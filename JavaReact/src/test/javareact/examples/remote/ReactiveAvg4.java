package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;
import test.javareact.common.types.reactive.ReactiveString;

public class ReactiveAvg4 implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "Reactive";
		ReactiveAvg4 remoteReact = new ReactiveAvg4();
		ReactiveString react3 = ReactiveFactory.getString("Remote.obString.get()", "");
		react3.addReactiveListener(remoteReact);
	}

	@Override
	public void notifyReactiveChange(Value value) {
		System.out.println("The reactive value is changed in: " + value.stringVal());
	}

	@Override
	public void notifyReactiveUpdate(Value value) {
		// TODO Auto-generated method stub
		
	}
}
