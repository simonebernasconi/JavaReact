package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.observable.ObservableBool;
import test.javareact.common.types.reactive.ReactiveBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class CopyOfReactiveAnd1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "ReactiveAnd1";
		CopyOfReactiveAnd1 remoteReact = new CopyOfReactiveAnd1();
		ReactiveBool react= ReactiveFactory.getBool("Tire1.obTire1.get():Bool & ReactiveDecrease1.obDecrease1.get() ", false, "obAnd1");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.boolVal());
//		ObservableBool obAnd1 = new ObservableBool("obAnd1", false);
//		obAnd1.set(value.boolVal());
	}

//	@Override
//	public void notifyReactiveUpdate(Value value) {
//		System.out.println("1The reactive value is changed in: " + value.intVal());
//	}
}
