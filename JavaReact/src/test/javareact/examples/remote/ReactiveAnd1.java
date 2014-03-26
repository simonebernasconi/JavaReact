package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;

public class ReactiveAnd1 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "ReactiveAnd1";
		ReactiveAnd1 remoteReact = new ReactiveAnd1();
		ReactiveBool react= ReactiveFactory.getBool("ReactiveMin1.obMin1.get() & ReactiveDecrease.obDecrease1.get() ", false, "");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.intVal());
	}

	@Override
	public void notifyReactiveUpdate(Value value) {
		//
	}
}
