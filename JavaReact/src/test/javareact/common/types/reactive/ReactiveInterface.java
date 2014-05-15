package test.javareact.common.types.reactive;

import java.util.List;

import test.javareact.common.packets.content.Value;

/**
 * A reactive variable of boolean type.
 */
public interface ReactiveInterface extends ReactiveListenerInterface {

  /**
   * Returns the value of the variable.
   * 
   * @return the value of the variable.
   */
  public List<?> get();
  
  public List<?> add();


}
