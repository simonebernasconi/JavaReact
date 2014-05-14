package test.javareact.examples.remote.car;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class PressureDecrease1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "PressureDecrease1";
		PressureDecrease1 remoteReact = new PressureDecrease1();
		ReactiveBool react= ReactiveFactory.getBool("Tire1.obTire1.get():ListDouble.orderDesc", false, "PressureDecrease1");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.boolVal());
	}

	
}
