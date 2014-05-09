package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;
import test.javareact.common.types.reactive.ReactiveString;

public class ExampleDiv implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "ReactiveDiv";
		ExampleDiv remoteReact = new ExampleDiv();
//		ReactiveList react= ReactiveFactory.getList("Remote1.obList.get().orderAsc", "obDiv");
		//ReactiveDouble react= ReactiveFactory.getDouble("Remote2.obInt2.get():Int + Remote1.obInt1.get():Int", "obDiv");
		ReactiveString react= ReactiveFactory.getString("Remote1.obInt1.get():String + Remote2.obInt2.get():String + a", "obDiv");

		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.stringVal());
	}

	@Override
	public void notifyReactiveUpdate(Value value) {
		System.out.println("1The reactive value is changed in: " + value.stringVal());
	}
}
