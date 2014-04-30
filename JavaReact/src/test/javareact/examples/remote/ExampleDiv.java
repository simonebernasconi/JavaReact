package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveInteger;
import test.javareact.common.types.reactive.ReactiveListener;

public class ExampleDiv implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "ReactiveDiv";
		ExampleDiv remoteReact = new ExampleDiv();
//		ReactiveList react= ReactiveFactory.getList("Remote1.obList.get().orderAsc", "obDiv");
		ReactiveInteger react= ReactiveFactory.getInteger("Remote2.obInt2.get() + Remote1.obInt1.get() ", "obDiv");
		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.intVal());
	}

	@Override
	public void notifyReactiveUpdate(Value value) {
		System.out.println("1The reactive value is changed in: " + value.intVal());
	}
}
