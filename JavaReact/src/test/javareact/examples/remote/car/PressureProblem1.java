package test.javareact.examples.remote.car;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class PressureProblem1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "PressureProblem1";
		PressureProblem1 remoteReact = new PressureProblem1();
		ReactiveBool react= ReactiveFactory.getBool("PressureHigh1.PressureHigh1.get():Bool | PressureLow1.PressureLow1.get():Bool | PressureDecrease1.PressureDecrease1.get():Bool", false, "PressureProblem1");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.boolVal());
	}

	
}
