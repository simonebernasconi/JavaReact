package test.javareact.common.types.reactive;

import java.util.List;

/**
 * A reactive variable of integer type.
 */
public interface ReactiveList extends ReactiveListenerInterface {

  /**
   * Returns the value of the variable.
   * 
   * @return the value of the variable.
   */
  
  public int size();

}
