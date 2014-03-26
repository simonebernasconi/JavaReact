package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.observable.ObservableInteger;
import test.javareact.common.types.reactive.ReactiveAvg;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class ReactiveAvg1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "ReactiveAvg1";
		ReactiveAvg1 remoteReact = new ReactiveAvg1();
		ReactiveAvg react= ReactiveFactory.getAvg("Tire1.obTire1.get()", "");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		
	}

	@Override
	public void notifyReactiveUpdate(Value value) {
		System.out.println("The reactive value is changed in: " + value.intVal());		
		ObservableInteger obAvg1 = new ObservableInteger("obAvg1", 0);
		obAvg1.set(value.intVal());
	}
}
