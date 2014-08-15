package test.javareact.common.types.observable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObservableListDouble extends Observable {
	private List<Double> val = new ArrayList<Double>();

	public ObservableListDouble(String observableId, boolean persistent,
			List<Double> val) {
		super(observableId, persistent);
		this.val = val;
		// set(val);
	}

	public ObservableListDouble(String observableId, List<Double> val) {
		super(observableId);
		this.val = val;
		// set(val);
	}

	@ImpactOn(method = {"size", "avg", "sum", "firstElement", "lastElement",
			"isSort", "isReverse" })
	public final void add(double n) {
		val.add(n);
	}

	@ImpactOn(method = {"size", "avg", "sum", "firstElement", "lastElement",
			"isSort", "isReverse" })
	public final void addAll(List<Double> list) {
		val.addAll(list);
	}

	@ImpactOn(method = {"size", "avg", "sum", "firstElement", "lastElement",
			"isSort", "isReverse" })
	public final void remove(double n) {
		val.remove(n);
	}

	@ImpactOn(method = {"size", "avg", "sum", "firstElement", "lastElement",
			"isSort", "isReverse" })
	public final void removeAll(List<Double> list) {
		val.removeAll(list);
	}

	public final int size() {
		return val.size();
	}

	public final Double lastElement() {
		return val.get(val.size() - 1);
	}

	public final Double firstElement() {
		return val.get(0);
	}

	@ImpactOn(method = {"size", "avg", "sum", "firstElement", "lastElement",
			"isSort", "isReverse" })
	public void clear() {
		val.clear();
	}

	public final double sum() {
		double sum = 0;
		for (double n : val) {
			sum += n;
		}
		return sum;
	}

	public final double avg() {
		double sum = 0.0;
		double avg = 0.0;
		for (double n : val) {
			sum += n;
		}
		avg = sum / val.size();
		return avg;
	}

	public final boolean isSort() {
		List<Double> list = new ArrayList<Double>(val);
		Collections.sort(list);
		if (val.equals(list)) {
			return true;
		} else
			return false;
	}

	public final boolean isReverse() {
		List<Double> list = new ArrayList<Double>(val);
		Collections.reverse(list);
		if (val.equals(list)) {
			return true;
		} else
			return false;
	}
	
	@ImpactOn(method = {"avg", "sum","firstElement","lastElement",
			"isSort", "isReverse" })
	public final void changeLast(double n) {
		val.remove(val.size()-1);
		val.add(n);
	}

}
