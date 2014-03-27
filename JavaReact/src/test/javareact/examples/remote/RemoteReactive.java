package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveInteger;
import test.javareact.common.types.reactive.ReactiveListener;
import test.javareact.common.types.reactive.ReactiveString;

public class RemoteReactive implements ReactiveListener {

	public static void main(String args[]) {
		Consts.hostName = "Reactive";
		RemoteReactive remoteReact = new RemoteReactive();
		ReactiveString react1 = ReactiveFactory.getString("Remote.obString.get()", "");
		ReactiveString react2 = ReactiveFactory.getString("Remote2.obString.get()", "");
		react1.addReactiveListener(remoteReact);
		react2.addReactiveListener(remoteReact);
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
