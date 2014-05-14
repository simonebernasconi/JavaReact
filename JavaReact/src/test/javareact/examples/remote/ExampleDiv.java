package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveList;
import test.javareact.common.types.reactive.ReactiveListener;

public class ExampleDiv implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "ReactiveDiv";
		ExampleDiv remoteReact = new ExampleDiv();
//		ReactiveList react= ReactiveFactory.getList("Remote1.ObList.get():ListDouble.orderAsc", "ObDiv");
		ReactiveList react= ReactiveFactory.getList("Remote1.ObList.size():Num", "ObDiv");
//		ReactiveDouble react= ReactiveFactory.getDouble("Remote1.ObList.get():ListDouble.Avg", "ObDiv");

		react.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value);
	}

//	@Override
//	public void notifyReactiveUpdate(Value value) {
//		System.out.println("1The reactive value is changed in: " + value.doubleVal());
//	}
}
