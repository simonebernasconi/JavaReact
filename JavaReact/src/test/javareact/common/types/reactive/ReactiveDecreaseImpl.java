package test.javareact.common.types.reactive;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import test.javareact.common.Consts;
import test.javareact.common.packets.EventPacket;
import test.javareact.common.packets.content.Attribute;
import test.javareact.common.packets.content.Event;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveDecreaseImpl extends Reactive implements ReactiveDecrease {

  protected ReactiveDecreaseImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.BOOL, name, isPublic);
  }

  protected ReactiveDecreaseImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.BOOL, name, isPublic);
  }

  @Override
  public synchronized boolean get() {
    requiresUpdatedValue();
    return value.boolVal();
  }

	Queue<Integer> lastValues = new LinkedList<Integer>();
	
	@Override
	public synchronized void notifyValueChanged(EventPacket evPkt) {
		// Update the data structures
		// Contact the queue manager to obtain the list of changes that can be
		// processed
		Set<EventPacket> changes = queueManager.processEventPacket(evPkt,
				Consts.hostName + name);
		assert (changes.size() == 1 && changes.contains(evPkt));
		int newVal = evPkt.getEvent().getAttributeFor("get()").intVal();

		if (lastValues.size() < 10) {
			lastValues.add(newVal);
		} else {
			lastValues.remove();
			lastValues.add(newVal);
		}
		boolean decreasing = true;

		Iterator<Integer> it = lastValues.iterator();
		if (it.hasNext()) {
			it.next();
		}
		for (int val : lastValues) {
			if (decreasing == true){
				if (it.hasNext()) {
					int iteratorValue = (int) it.next();
					if (val <= iteratorValue) {
						decreasing = false;
					}
					else {}
				}
			}

		}
			
		
			Value oldVal = value;
			
			if (decreasing) {
				value = new Value(true);
			} else {
				value = new Value(false);
			}
			
			hasValue = true;
			if (name != null) {
				try {
					Attribute attr = new Attribute("get()", value);
					Event event = new Event(name, Consts.hostName, attr);
					Set<String> newComputedFrom = new HashSet<String>(getComputedFrom(changes));
					newComputedFrom.add(name);
					forwarder.sendEvent(evPkt.getId(), event, newComputedFrom,
							evPkt.getFinalExpressions(), true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
			if (!value.equals(oldVal)) {
				for (ReactiveListener l : reactiveListeners) {
					l.notifyReactiveChange(value);
					l.notifyReactiveUpdate(value);
				}
			}
			else {
				for (ReactiveListener l : reactiveListeners) {
					l.notifyReactiveUpdate(value);
				}
			}	
			
		

	}

}
