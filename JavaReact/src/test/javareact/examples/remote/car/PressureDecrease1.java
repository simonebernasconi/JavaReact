package test.javareact.examples.remote.car;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveDouble;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class PressureDecrease1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "PressureDecrease1";
		PressureDecrease1 remoteReact = new PressureDecrease1();
		ReactiveDouble react= ReactiveFactory.getDouble("Tire1.ObTire1.sum()", 0.0, "PressureDecrease1");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value);
	}

	
}
