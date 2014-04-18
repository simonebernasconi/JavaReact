package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveDouble;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class ExampleSub2 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "ReactiveSub2";
		ExampleSub2 remoteReact = new ExampleSub2();
		ReactiveDouble react= ReactiveFactory.getDouble("ReactiveMul2.obMul2.get() - ReactiveDiv.obDiv.get() ", 0, "obSub2");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.doubleVal());
//		ObservableBool obAnd1 = new ObservableBool("obAnd1", false);
//		obAnd1.set(value.boolVal());
	}

	@Override
	public void notifyReactiveUpdate(Value value) {
		System.out.println("1The reactive value is changed in: " + value.doubleVal());
	}
}
