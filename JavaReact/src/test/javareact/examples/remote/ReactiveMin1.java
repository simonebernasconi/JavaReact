package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.observable.ObservableBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveInteger;
import test.javareact.common.types.reactive.ReactiveListener;

public class ReactiveMin1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "ReactiveMin1";
		ReactiveMin1 remoteReact = new ReactiveMin1();
		ReactiveInteger react= ReactiveFactory.getInteger("Tire1.obTire1.get() + ReactiveAvg1.obAvg1.get() ", 0, "obMin1");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The result is " + value.boolVal());
		
	}
//
//	@Override
//	public void notifyReactiveUpdate(Value value) {
//		
//	}
}
