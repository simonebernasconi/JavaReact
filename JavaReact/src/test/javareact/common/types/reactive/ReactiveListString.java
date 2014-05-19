package test.javareact.common.types.reactive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import test.javareact.common.types.observable.ImpactOn;

/**
 * A reactive variable of integer type.
 */
public interface ReactiveListString extends ReactiveListenerInterface {

	/**
	 * Returns the value of the variable.
	 * 
	 * @return the value of the variable.
	 */

	public int size();

	public String lastElement();

	public String firstElement();

	public void clear();

	public String concat();

	public List<String> sort();

	public List<String> reverse();

	public boolean isSort();

	public boolean isReverse();

}
