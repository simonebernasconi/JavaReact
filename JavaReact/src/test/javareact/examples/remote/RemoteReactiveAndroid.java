package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveInteger;

public class RemoteReactiveAndroid {

  public static void main(String args[]) {
    Consts.hostName = "Reactive";
    ReactiveInteger react1 = ReactiveFactory.getInteger("android.obInt.get()", 10, "react1");

    while (true) {
      System.out.println("React1: " + react1.getInt());
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    

  }
}
