package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.observable.ObservableBool;
import test.javareact.common.types.reactive.ReactiveDecrease;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class ReactiveDecrease1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "ReactiveDecrease1";
		ReactiveDecrease1 remoteReact = new ReactiveDecrease1();
		ReactiveDecrease react= ReactiveFactory.getDecrease("Tire1.obTire1.get()", false, "obDecrease1");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.boolVal());
//		ObservableBool obDecrease1 = new ObservableBool("obDecrease1", false);
//		obDecrease1.set(value.boolVal());
	}

	@Override
	public void notifyReactiveUpdate(Value value) {
//		ObservableBool obDecrease1 = new ObservableBool("obDecrease1", false);
//		obDecrease1.set(value.boolVal());
	}
}
