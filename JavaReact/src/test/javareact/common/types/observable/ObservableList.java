package test.javareact.common.types.observable;

import java.util.ArrayList;
import java.util.List;

public class ObservableList extends Observable {
  private List<?> val;
  private int intVal;
  private double doubleVal;

  public ObservableList(String observableId, boolean persistent, List<?> val) {
    super(observableId, persistent);
    //set(val);
  }

  public ObservableList(String observableId, List<?> val) {
    super(observableId);
    //set(val);
  }


  
  @ImpactOn(method = {"contains","size"})
  public final void add(List<?> val) {
    this.val = val;
  }
  

  
  public final int size() {
	    return val.size();
  }
  
  public final boolean contains(){
	  return false;
  }
  
 
}
