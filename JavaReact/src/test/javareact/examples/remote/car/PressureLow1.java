package test.javareact.examples.remote.car;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class PressureLow1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "PressureLow1";
		PressureLow1 remoteReact = new PressureLow1();
		ReactiveBool react= ReactiveFactory.getBool("Tire1.ObTire1.get():ListDouble.Last < 1.0", false, "PressureLow1");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.boolVal());
	}

	
}
