package test.javareact.common.types.reactive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import test.javareact.common.types.observable.ImpactOn;

/**
 * A reactive variable of integer type.
 */
public interface ReactiveListDouble extends ReactiveListenerInterface {

	/**
	 * Returns the value of the variable.
	 * 
	 * @return the value of the variable.
	 */

	public int size();

	public double lastElement();

	public double firstElement();

	public void clear();

	public double sum();

	public double avg();

	public List<Double> sort();

	public List<Double> reverse();

	public boolean isSort();

	public boolean isReverse();

}
