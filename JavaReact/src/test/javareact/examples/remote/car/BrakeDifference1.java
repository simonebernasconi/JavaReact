package test.javareact.examples.remote.car;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class BrakeDifference1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "BrakeHigh1";
		BrakeDifference1 remoteReact = new BrakeDifference1();
		ReactiveBool react= ReactiveFactory.getBool("!(Brake1.ObBrake1.get():ListDouble.Constant(200)) > 400", false, "BrakeHigh1");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.boolVal());
	}

	
}
