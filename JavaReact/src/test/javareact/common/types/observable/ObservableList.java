package test.javareact.common.types.observable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ObservableList<T> extends Observable {
  private List<T> val;

  public ObservableList(String observableId, boolean persistent, List<?> val) {
    super(observableId, persistent);
    //set(val);
  }

  public ObservableList(String observableId, List<?> val) {
    super(observableId);
    //set(val);
  }

  @ImpactOn(method = {"lastElement", "size" , "orderAsc", "orderDesc"})
  public final void add(T val) {
    this.val.add(val);
  }
  
  public final int size() {
	    return val.size();
  }
  
  public final T lastElement(){
	  return val.get(val.size()-1);
  }
  
  public final T firstElement(){
	  return val.get(0);
  }
  
  public void clear() {
	  val.clear();
  }
  
  public boolean isOrderedAsc() {
	  return val
  }
  
  public boolean isOrderedDesc() {
	  return true; // todo
  }
  
  public List<T> orderAsc() {
	  return Collections.sort(val);
  }
  
  public List<?> orderDesc() {
	  return true; // todo
  }
 
}
