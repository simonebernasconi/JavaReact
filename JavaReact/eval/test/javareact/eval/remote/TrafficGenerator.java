package test.javareact.eval.remote;

import test.javareact.common.ConsistencyType;
import test.javareact.common.Consts;
import test.javareact.common.types.observable.ObservableDouble;
import test.javareact.eval.common.EvalParams;
import test.javareact.eval.common.ParamHandler;

public class TrafficGenerator {

  public static void main(String args[]) {
    ConsistencyType consistencyType = getConsistencyTypeFrom(args[0]);
    TrafficGenerator trafficGenerator = new TrafficGenerator();
    try {
      trafficGenerator.start(consistencyType);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private final void start(ConsistencyType consistencyType) throws Exception {
    Consts.consistencyType = consistencyType;
    Consts.hostName = "TrafficGenerator";
    ObservableDouble obDouble = new ObservableDouble("obDouble0", System.nanoTime());
    Thread.sleep(5000);
    for (int i = 0; i < EvalParams.NUM_REPETITIONS; i++) {
      if (!ParamHandler.getInstance().getBurst()) {
        Thread.sleep(EvalParams.SLEEP_TIME);
      }
      obDouble.set(System.nanoTime());
    }
  }

  private static final ConsistencyType getConsistencyTypeFrom(String name) {
    if (name.toLowerCase().equals("causal")) {
      return ConsistencyType.CAUSAL;
    } else if (name.toLowerCase().equals("glitch-free")) {
      return ConsistencyType.GLITCH_FREE;
    } else {
      return ConsistencyType.ATOMIC;
    }
  }

}
