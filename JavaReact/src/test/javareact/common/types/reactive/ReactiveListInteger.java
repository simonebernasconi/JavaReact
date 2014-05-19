package test.javareact.common.types.reactive;

import java.util.List;

/**
 * A reactive variable of integer type.
 */
public interface ReactiveListInteger extends ReactiveListenerInterface {

	/**
	 * Returns the value of the variable.
	 * 
	 * @return the value of the variable.
	 */

	public int size();

	public int lastElement();

	public int firstElement();

	public void clear();

	public int sum();

	public double avg();

	public List<Integer> sort();

	public List<Integer> reverse();

	public boolean isSort();

	public boolean isReverse();

}
