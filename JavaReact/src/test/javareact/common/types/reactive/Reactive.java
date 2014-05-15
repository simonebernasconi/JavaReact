package test.javareact.common.types.reactive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import test.javareact.client.ClientEventForwarder;
import test.javareact.client.QueueManager;
import test.javareact.client.Subscriber;
import test.javareact.common.Consts;
import test.javareact.common.expressions.ExpressionsHandler;
import test.javareact.common.packets.EventPacket;
import test.javareact.common.packets.content.Advertisement;
import test.javareact.common.packets.content.Attribute;
import test.javareact.common.packets.content.Event;
import test.javareact.common.packets.content.Subscription;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

public abstract class Reactive implements Subscriber, ReactiveListenerInterface {
	private final Map<String, Value> currentValues = new HashMap<String, Value>();
	protected final Set<String> missingValues = new HashSet<String>();

	protected final ClientEventForwarder forwarder;
	private final ExpressionsHandler expressionHandler;
	protected final QueueManager queueManager = new QueueManager();

	protected final boolean blocking;
	//private final Types type;
	protected final String name;
	private final boolean isPublic;

	protected boolean hasValue;
	protected Value value;

	protected final List<ReactiveListener> reactiveListeners = new ArrayList<ReactiveListener>();

	/**
	 * Non-blocking reactive.
	 * 
	 * @param expression
	 *            the expression that defines the reactive value.
	 * @param startingValue
	 *            the starting value to use until new updates are received.
	 * @param type
	 *            the type of the reactive.
	 * @param name
	 *            the name the reactive is publicly known with.
	 */
//	protected Reactive(String expression, Value startingValue, Types type,
//			String name, boolean isPublic) {
//		forwarder = ClientEventForwarder.get();
//		this.type = type;
//		this.name = name;
//		this.isPublic = isPublic;
//		expressionHandler = new ExpressionsHandler(type, expression);
//		value = startingValue;
//		blocking = false;
//		hasValue = true;
//		initValues();
//		subscribeAndAdvertise();
//	}
	
	protected Reactive(String expression, Value startingValue, String name, boolean isPublic) {
		forwarder = ClientEventForwarder.get();
		this.name = name;
		this.isPublic = isPublic;
		expressionHandler = new ExpressionsHandler(expression);
		value = startingValue;
		blocking = false;
		hasValue = true;
		initValues();
		subscribeAndAdvertise();
	}

	/**
	 * Blocking reactive.
	 * 
	 * @param expression
	 *            the expression that defines the reactive value.
	 * @param type
	 *            the type of the reactive.
	 * @param name
	 *            the name the reactive is publicly known with.
	 */
	protected Reactive(String expression, String name,
			boolean isPublic) {
		forwarder = ClientEventForwarder.get();
		this.name = name;
		this.isPublic = isPublic;
		expressionHandler = new ExpressionsHandler(expression);
		blocking = true;
		hasValue = false;
		initValues();
		subscribeAndAdvertise();
	}
	
//	protected Reactive(String expression, Types type, String name,
//			boolean isPublic) {
//		forwarder = ClientEventForwarder.get();
//		this.type = type;
//		this.name = name;
//		this.isPublic = isPublic;
//		expressionHandler = new ExpressionsHandler(type, expression);
//		blocking = true;
//		hasValue = false;
//		initValues();
//		subscribeAndAdvertise();
//	}

	@Override
	public synchronized void notifyValueChanged(EventPacket evPkt) {
		// Update the data structures
		// Contact the queue manager to obtain the list of changes that can be
		// processed
		Set<EventPacket> changes = queueManager.processEventPacket(evPkt, Consts.hostName + "." + name);
		boolean modified = updateDataStructures(changes);
		// If some data has been updated and no values are missing ...
		// ... recompute the expression and notify waiting threads
		// CHECK: what if some values are missing??
		if (modified && missingValues.isEmpty()) {
			// All the packets should have exactly the same id
			// (they have been generated by the same initial change)
			// Because of this, we take the id from the last arrived evPkt
			Value oldVal = value;
			recomputeExpression(evPkt.getId(), getComputedFrom(changes), evPkt.getFinalExpressions());
			// code new here
			// if old value is not equal to new value do something
			if (!value.equals(oldVal)) {
				for (ReactiveListener l : reactiveListeners) {
					l.notifyReactiveChange(value);
//					l.notifyReactiveUpdate(value);
				}
			}
//			else {
//				for (ReactiveListener l : reactiveListeners) {
//					l.notifyReactiveUpdate(value);
//				}
//			}
			if (blocking) {
				notifyAll();
			}
		}
	}

	// new methods
	public final void addReactiveListener(ReactiveListener listener) {
		reactiveListeners.add(listener);
	}

	public final void removeReactiveListener(ReactiveListener listener) {
		reactiveListeners.remove(listener);
	}

	/**
	 * Update the data structures using the values carried by the given events.
	 * Return true iff any data structure was modified.
	 */
	protected final boolean updateDataStructures(Collection<EventPacket> events) {
		boolean modified = false;
		for (EventPacket evPkt : events) {
			Event ev = evPkt.getEvent();
			String observableId = ev.getObservableId();
			String hostId = ev.getHostId();
			for (Attribute attr : ev) {
				String methodName = attr.getName();
				String varName = hostId + "." + observableId + "." + methodName;
				if (currentValues.containsKey(varName)
						|| missingValues.contains(varName)) {
					currentValues.remove(varName);
					missingValues.remove(varName);
					currentValues.put(varName, attr.getValue());
					modified = true;
				}
			}
		}
		return modified;
	}

	private final void initValues() {
		for (String var : expressionHandler.extractVariableNames()) {
			missingValues.add(var);
		}
	}
	
//	private final void initValues() {
//		for (String var : expressionHandler.extractVariableNames(type)) {
//			missingValues.add(var);
//		}
//	}

	private final void subscribeAndAdvertise() {
		Set<Subscription> subs = expressionHandler.buildSubscriptions();
		Advertisement adv = new Advertisement(name, Consts.hostName);
		forwarder.advertise(adv, subs, isPublic);
		forwarder.addSubscriptions(this, subs);
	}
	
//	private final void subscribeAndAdvertise() {
//		Set<Subscription> subs = expressionHandler.buildSubscriptions(type);
//		Advertisement adv = new Advertisement(name, Consts.hostName);
//		forwarder.advertise(adv, subs, isPublic);
//		forwarder.addSubscriptions(this, subs);
//	}

	/**
	 * Recompute the expression and return true iff any new event has been
	 * generated.
	 */
	protected boolean recomputeExpression(UUID id,
			Set<String> computedFrom, Set<String> finalExpressions) {
		boolean generateEvents = false;
		value = expressionHandler.evaluateExpression(currentValues);
		hasValue = true;
		if (name != null) {
			try {
				Attribute attr = new Attribute("get()", value);
				Event event = new Event(name, Consts.hostName, attr);
				Set<String> newComputedFrom = new HashSet<String>(computedFrom);
				newComputedFrom.add(name);
				forwarder.sendEvent(id, event, newComputedFrom,
						finalExpressions, true);
				generateEvents = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return generateEvents;
	}
	
//	protected boolean recomputeExpression(UUID id,
//			Set<String> computedFrom, Set<String> finalExpressions) {
//		boolean generateEvents = false;
//		value = expressionHandler.evaluateExpression(currentValues, type);
//		hasValue = true;
//		if (name != null) {
//			try {
//				Attribute attr = new Attribute("get()", value);
//				Event event = new Event(name, Consts.hostName, attr);
//				Set<String> newComputedFrom = new HashSet<String>(computedFrom);
//				newComputedFrom.add(name);
//				forwarder.sendEvent(id, event, newComputedFrom,
//						finalExpressions, true);
//				generateEvents = true;
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return generateEvents;
//	}

	protected final Set<String> getComputedFrom(Set<EventPacket> pkts) {
		Set<String> results = new HashSet<String>();
		for (EventPacket pkt : pkts) {
			results.addAll(pkt.getComputedFrom());
		}
		return results;
	}

	protected final void requiresUpdatedValue() {
		while (blocking && !hasValue) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
