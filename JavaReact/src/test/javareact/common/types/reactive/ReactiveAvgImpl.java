package test.javareact.common.types.reactive;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;

import test.javareact.common.Consts;
import test.javareact.common.packets.EventPacket;
import test.javareact.common.packets.content.Attribute;
import test.javareact.common.packets.content.Event;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveAvgImpl extends Reactive implements ReactiveAvg {

  protected ReactiveAvgImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.INT, name, isPublic);
  }

  protected ReactiveAvgImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.INT, name, isPublic);
  }

  @Override
  public synchronized double get() {
    requiresUpdatedValue();
    return value.doubleVal();
  }

	Queue<Integer> lastValues = new LinkedList<Integer>();
	int average;
		
	@Override
	public synchronized void notifyValueChanged(EventPacket evPkt) {
		// Update the data structures
		// Contact the queue manager to obtain the list of changes that can be
		// processed
		Set<EventPacket> changes = queueManager.processEventPacket(evPkt, Consts.hostName + name);
		
		assert (changes.size()==1 && changes.contains(evPkt));
		int newVal = evPkt.getEvent().getAttributeFor("get()").intVal();
		int sum = 0;
		if (lastValues.size() < 10){
			lastValues.add(newVal);
		}
		else {
			lastValues.remove();
			lastValues.add(newVal);
		}
		for(int val :lastValues) {
			sum += val;
		}
		average = sum / (lastValues.size());
		
		Value oldVal = value;

		value = new Value(average);
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
