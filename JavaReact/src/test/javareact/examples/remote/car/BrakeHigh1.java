package test.javareact.examples.remote.car;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class BrakeHigh1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "BrakeHigh1";
		BrakeHigh1 remoteReact = new BrakeHigh1();
		ReactiveBool react= ReactiveFactory.getBool("Brake1.ObBrake1.get():ListDouble.Last > 400", false, "BrakeHigh1");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.boolVal());
	}

	
}
