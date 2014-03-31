package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;
import test.javareact.common.types.reactive.ReactiveString;

public class RemoteReactive {

	private class Tire implements ReactiveListener {
		private final ReactiveString reactive;
		private final int n;
		
		Tire(ReactiveString reactive, int n) {
			this.reactive = reactive;
			this.n = n;
		}
		
		@Override
		public void notifyReactiveChange(Value value) {
			System.out.println("The reactive value of " +n+ " is changed in: " + reactive.get());
		}

		@Override
		public void notifyReactiveUpdate(Value value) {
			// TODO Auto-generated method stub
		}
	}
	

	public static void main(String args[]) {
		new RemoteReactive().init();
	}
	
	public void init() {
		Consts.hostName = "Reactive";
		ReactiveString react1 = ReactiveFactory.getString(
				"Remote.obString.get()", "");
		react1.addReactiveListener(new Tire(react1, 1));
		
		ReactiveString react2 = ReactiveFactory.getString(
				"Remote2.obString.get()", "");
		react2.addReactiveListener(new Tire(react2, 2));
		
//		ReactiveString react3 = ReactiveFactory.getString(
//				"Remote2.obString.get()", "");
//		react1.addReactiveListener(new Tire(react3, 3));
//		
//		ReactiveString react4 = ReactiveFactory.getString(
//				"Remote2.obString.get()", "");
//		react1.addReactiveListener(new Tire(react4, 4));
	}

}






//public static void main(String args[]) {
//Consts.hostName = "Reactive";
//RemoteReactive remoteReact = new RemoteReactive();
//ReactiveString react1 = ReactiveFactory.getString(
//		"Remote.obString.get()", "");
//react1.addReactiveListener(remoteReact);
//
//RemoteReactive remoteReact2 = new RemoteReactive();
//ReactiveString react2 = ReactiveFactory.getString(
//		"Remote.obString.get()", "");
//react2.addReactiveListener(remoteReact2);
//}

//@Override
//public void notifyReactiveChange(Value value) {
//System.out.println("The reactive value is changed in: "
//		+ value.stringVal());
//}
//
//@Override
//public void notifyReactiveUpdate(Value value) {
//// TODO Auto-generated method stub
//
//}
