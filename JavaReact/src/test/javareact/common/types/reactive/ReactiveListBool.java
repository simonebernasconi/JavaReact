package test.javareact.common.types.reactive;

import java.util.List;

/**
 * A reactive variable of integer type.
 */
public interface ReactiveListBool extends ReactiveListenerInterface {

	/**
	 * Returns the value of the variable.
	 * 
	 * @return the value of the variable.
	 */

	public int size();

	public boolean lastElement();

	public boolean firstElement();

	public void clear();

	public boolean isAllTrue();

	public boolean isAllFalse();

}
