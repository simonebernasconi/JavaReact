package test.javareact;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;


import org.junit.Test;

import test.javareact.common.types.observable.ObservableInteger;
import test.javareact.common.types.observable.ObservableString;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveInteger;
import test.javareact.common.types.reactive.ReactiveString;
import test.javareact.server.ServerLauncher;
import test.javareact.token_service.TokenServiceLauncher;

public class LocalTest {
  private boolean serverStarted = false;
  private boolean tokenServiceStarted = false;

  @Test
  public void localTest1() {
    startServerIfNeeded();
    startTokenServiceIfNeeded();
    ObservableInteger obInt = new ObservableInteger("obInt", 1);
    ObservableString obString1 = new ObservableString("obString1", "");
    ObservableString obString2 = new ObservableString("obString2", "");

    ReactiveInteger reactInt = ReactiveFactory.getInteger("10:Num-2:Num+((obInt.get():Num*2:Num)+ obInt.get():Num)/2:Num", 10, "reactInt");
    ReactiveString reactString = ReactiveFactory.getString("((obString1.get():String) + obString2.get():String)", "", "reactString");
    ReactiveString reactString2 = ReactiveFactory.getString("((obString1.get():String) + World:String)", "", "reactString");

    ReactiveInteger reactInt2 = ReactiveFactory.getInteger("reactInt.get():Num*2:Num", 10, "reactInt2");

    ObservableInteger obIntStart = new ObservableInteger("obIntStart", 1);
    ReactiveInteger reactInterm1 = ReactiveFactory.getInteger("obIntStart.get():Num*2:Num", 10, "reactInterm1");
    ReactiveInteger reactInterm2 = ReactiveFactory.getInteger("obIntStart.get():Num*2:Num", 10, "reactInterm2");
    ReactiveInteger reactFinal = ReactiveFactory.getInteger("reactInterm1.get():Num + reactInterm2.get():Num", 10, "reactFinal");
    ReactiveInteger reactFinal2 = ReactiveFactory.getInteger("reactInterm1.get():Num + obIntStart.get():Num", 10, "reactFinal2");
    ReactiveInteger reactFinal3 = ReactiveFactory.getInteger("reactFinla3.get():Num + 100", 10, "reactFinal3");

    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    obInt.set(100);
    obString1.set("Hello ");
    obString2.set("World!");
    obIntStart.set(100);

    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    assertEquals(reactInt.getInt(), 158);
    assertEquals(reactString.get(), "Hello World!");
    assertEquals(reactString2.get(), "Hello World!");
    assertEquals(reactInt2.getInt(), 316);
    assertEquals(reactInterm1.getInt(), 200);
    assertEquals(reactInterm2.getInt(), 200);
    assertEquals(reactFinal.getInt(), 400);
    assertEquals(reactFinal2.getInt(), 300);
    assertEquals(reactFinal3.getInt(), 400);

  }

  private final void startServerIfNeeded() {
    if (!serverStarted) {
      ServerLauncher.start();
      serverStarted = true;
    }
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private final void startTokenServiceIfNeeded() {
    if (!tokenServiceStarted) {
      String serverAddress = "reds-tcp:localhost:9000";
      Set<String> addresses = new HashSet<String>();
      addresses.add(serverAddress);
      TokenServiceLauncher.start(addresses);
      tokenServiceStarted = true;
    }
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
