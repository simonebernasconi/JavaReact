package test.javareact.token_service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


import org.junit.Test;

import test.javareact.common.packets.AdvertisementPacket;
import test.javareact.common.packets.content.AdvType;
import test.javareact.common.packets.content.Advertisement;
import test.javareact.common.packets.content.Subscription;
import test.javareact.token_service.FinalExpressionsDetector;

public class FinalExpressionsDetectorTest {

  private static final String hostId = "hostId";
  private static final String hostIdDot = hostId + ".";

  @Test
  public void singleExpressionTest() {
    // A
    FinalExpressionsDetector finalExpressionsDetector = new FinalExpressionsDetector();
    generateAdvertisementPacket(finalExpressionsDetector, "A");
    finalExpressionsDetector.consolidate();

    Map<String, Integer> results = finalExpressionsDetector.getFinalExpressionsFor(hostIdDot + "A");
    assertEquals(results.size(), 0);
  }

  @Test
  public void simpleDependencyTest() {
    // A
    // B = f(A)
    FinalExpressionsDetector finalExpressionsDetector = new FinalExpressionsDetector();
    generateAdvertisementPacket(finalExpressionsDetector, "A");
    generateAdvertisementPacket(finalExpressionsDetector, "B", "A");
    finalExpressionsDetector.consolidate();

    Map<String, Integer> results = finalExpressionsDetector.getFinalExpressionsFor(hostIdDot + "A");
    assertEquals(results.size(), 1);
    assertTrue(results.containsKey(hostIdDot + "A"));
    assertTrue(results.get(hostIdDot + "A") == 1);
  }

  @Test
  public void simpleDependencyTest2() {
    // A
    // B = f(A)
    // C = f(B)
    // D = f(C)
    FinalExpressionsDetector finalExpressionsDetector = new FinalExpressionsDetector();
    generateAdvertisementPacket(finalExpressionsDetector, "A");
    generateAdvertisementPacket(finalExpressionsDetector, "B", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "C", "B");
    generateAdvertisementPacket(finalExpressionsDetector, "D", "C");
    finalExpressionsDetector.consolidate();

    Map<String, Integer> results = finalExpressionsDetector.getFinalExpressionsFor(hostIdDot + "A");
    assertEquals(results.size(), 1);
    assertTrue(results.containsKey(hostIdDot + "C"));
    assertTrue(results.get(hostIdDot + "C") == 1);
  }

  @Test
  public void simpleDependencyTest3() {
    // A
    // B = f(A)
    // C = f(A)
    FinalExpressionsDetector finalExpressionsDetector = new FinalExpressionsDetector();
    generateAdvertisementPacket(finalExpressionsDetector, "A");
    generateAdvertisementPacket(finalExpressionsDetector, "B", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "C", "A");
    finalExpressionsDetector.consolidate();

    Map<String, Integer> results = finalExpressionsDetector.getFinalExpressionsFor(hostIdDot + "A");
    assertEquals(results.size(), 1);
    assertTrue(results.containsKey(hostIdDot + "A"));
    assertTrue(results.get(hostIdDot + "A") == 2);
  }

  @Test
  public void doubleDependencyTest() {
    // A
    // B = f(A)
    // C = f(B)
    // D = f(B)
    FinalExpressionsDetector finalExpressionsDetector = new FinalExpressionsDetector();
    generateAdvertisementPacket(finalExpressionsDetector, "A");
    generateAdvertisementPacket(finalExpressionsDetector, "B", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "C", "B");
    generateAdvertisementPacket(finalExpressionsDetector, "D", "B");
    finalExpressionsDetector.consolidate();

    Map<String, Integer> results = finalExpressionsDetector.getFinalExpressionsFor(hostIdDot + "A");
    assertEquals(results.size(), 1);
    assertTrue(results.containsKey(hostIdDot + "B"));
    assertTrue(results.get(hostIdDot + "B") == 2);
  }

  @Test
  public void tripleDependencyTest() {
    // A
    // B = f(A)
    // C = f(B)
    // D = f(B)
    // E = f(D)
    FinalExpressionsDetector finalExpressionsDetector = new FinalExpressionsDetector();
    generateAdvertisementPacket(finalExpressionsDetector, "A");
    generateAdvertisementPacket(finalExpressionsDetector, "B", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "C", "B");
    generateAdvertisementPacket(finalExpressionsDetector, "D", "B");
    generateAdvertisementPacket(finalExpressionsDetector, "E", "D");
    finalExpressionsDetector.consolidate();

    Map<String, Integer> results = finalExpressionsDetector.getFinalExpressionsFor(hostIdDot + "A");
    assertEquals(results.size(), 1);
    assertTrue(results.containsKey(hostIdDot + "D"));
    assertTrue(results.get(hostIdDot + "D") == 1);
  }

  @Test
  public void treeDependencyTest() {
    // A
    // B = f(A)
    // C = f(A)
    // D = f(B)
    // E = f(B)
    // F = f(C)
    // G = f(C)
    FinalExpressionsDetector finalExpressionsDetector = new FinalExpressionsDetector();
    generateAdvertisementPacket(finalExpressionsDetector, "A");
    generateAdvertisementPacket(finalExpressionsDetector, "B", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "C", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "D", "B");
    generateAdvertisementPacket(finalExpressionsDetector, "E", "B");
    generateAdvertisementPacket(finalExpressionsDetector, "F", "C");
    generateAdvertisementPacket(finalExpressionsDetector, "G", "C");
    finalExpressionsDetector.consolidate();

    Map<String, Integer> results = finalExpressionsDetector.getFinalExpressionsFor(hostIdDot + "A");
    assertEquals(results.size(), 2);
    assertTrue(results.containsKey(hostIdDot + "B"));
    assertTrue(results.containsKey(hostIdDot + "C"));
    assertTrue(results.get(hostIdDot + "B") == 2);
    assertTrue(results.get(hostIdDot + "C") == 2);
  }

  @Test
  public void treeDependencyTest2() {
    // A
    // B = f(A)
    // C = f(A)
    // D = f(B)
    // E = f(B)
    // F = f(C)
    // G = f(C)
    // H = f(G)
    FinalExpressionsDetector finalExpressionsDetector = new FinalExpressionsDetector();
    generateAdvertisementPacket(finalExpressionsDetector, "A");
    generateAdvertisementPacket(finalExpressionsDetector, "B", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "C", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "D", "B");
    generateAdvertisementPacket(finalExpressionsDetector, "E", "B");
    generateAdvertisementPacket(finalExpressionsDetector, "F", "C");
    generateAdvertisementPacket(finalExpressionsDetector, "G", "C");
    generateAdvertisementPacket(finalExpressionsDetector, "H", "G");
    finalExpressionsDetector.consolidate();

    Map<String, Integer> results = finalExpressionsDetector.getFinalExpressionsFor(hostIdDot + "A");
    assertEquals(results.size(), 2);
    assertTrue(results.containsKey(hostIdDot + "B"));
    assertTrue(results.containsKey(hostIdDot + "G"));
    assertTrue(results.get(hostIdDot + "B") == 2);
    assertTrue(results.get(hostIdDot + "G") == 1);
  }

  @Test
  public void triangularDependencyTest() {
    // A
    // B = f(A)
    // C = f(A, B)
    FinalExpressionsDetector finalExpressionsDetector = new FinalExpressionsDetector();
    generateAdvertisementPacket(finalExpressionsDetector, "A");
    generateAdvertisementPacket(finalExpressionsDetector, "B", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "C", "A", "B");
    finalExpressionsDetector.consolidate();

    Map<String, Integer> results = finalExpressionsDetector.getFinalExpressionsFor(hostIdDot + "A");
    assertEquals(results.size(), 1);
    assertTrue(results.containsKey(hostIdDot + "B"));
    assertTrue(results.get(hostIdDot + "B") == 1);
  }

  @Test
  public void cycleDependencyTest() {
    // A
    // B = f(A)
    // C = f(A)
    // D = f(B, C)
    FinalExpressionsDetector finalExpressionsDetector = new FinalExpressionsDetector();
    generateAdvertisementPacket(finalExpressionsDetector, "A");
    generateAdvertisementPacket(finalExpressionsDetector, "B", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "C", "A");
    generateAdvertisementPacket(finalExpressionsDetector, "D", "B", "C");
    finalExpressionsDetector.consolidate();

    Map<String, Integer> results = finalExpressionsDetector.getFinalExpressionsFor(hostIdDot + "A");
    assertEquals(results.size(), 2);
    assertTrue(results.containsKey(hostIdDot + "B"));
    assertTrue(results.containsKey(hostIdDot + "C"));
    assertTrue(results.get(hostIdDot + "B") == 1);
    assertTrue(results.get(hostIdDot + "C") == 1);
  }

  private final void generateAdvertisementPacket(FinalExpressionsDetector finalExpressionsDetector, String name, String... subsNames) {
    AdvertisementPacket advPkt = generateAdvertisementPacket(name, subsNames);
    finalExpressionsDetector.processAdvertisementPacket(advPkt);
  }

  private final AdvertisementPacket generateAdvertisementPacket(String name, String... subsNames) {
    Advertisement adv = new Advertisement(name, hostId);
    Set<Subscription> subscriptions = new HashSet<Subscription>();
    for (String subName : subsNames) {
      Subscription sub = new Subscription(subName, hostId);
      subscriptions.add(sub);
    }
    if (subscriptions.isEmpty()) {
      return new AdvertisementPacket(adv, AdvType.ADV, true);
    } else {
      return new AdvertisementPacket(adv, AdvType.ADV, subscriptions, true);
    }
  }
}
