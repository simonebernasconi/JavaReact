package test.javareact.examples.remote.car;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class PressureHigh1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "PressureHigh1";
		PressureHigh1 remoteReact = new PressureHigh1();
		ReactiveBool react= ReactiveFactory.getBool("Tire1.obTire1.get():ListDouble.Last > 10.0:Num", false, "PressureHigh1");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.boolVal());
	}

	
}
