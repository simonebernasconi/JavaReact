package test.javareact.common.types.observable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObservableListInteger extends Observable {
	public List<Integer> val = new ArrayList<Integer>();

	public ObservableListInteger(String observableId, boolean persistent,
			List<Integer> val) {
		super(observableId, persistent);
		// set(val);
	}

	public ObservableListInteger(String observableId, List<Integer> val) {
		super(observableId);
		// set(val);
	}

	@ImpactOn(method = {"contains", "size", "avg", "firstElement", "sum", "lastElement",
			"isSort", "isReverse" })
	public final void add(int n) {
		val.add(n);
	}

	@ImpactOn(method = {"contains", "size", "avg", "firstElement", "sum", "lastElement",
			"isSort", "isReverse" })
	public final void addAll(List<Integer> list) {
		val.addAll(list);
	}

	@ImpactOn(method = {"contains", "size", "avg", "firstElement", "sum", "lastElement",
			"isSort", "isReverse" })
	public final void remove(int n) {
		val.remove(n);
	}

	@ImpactOn(method = {"contains", "size", "avg", "firstElement", "sum", "lastElement",
			"isSort", "isReverse" })
	public final void removeAll(List<Integer> list) {
		val.removeAll(list);
	}

	public final int size() {
		return val.size();
	}

	public final int lastElement() {
		return val.get(val.size() - 1);
	}

	public final int firstElement() {
		return val.get(0);
	}

	@ImpactOn(method = {"contains", "size", "avg", "sum", "firstElement", "lastElement",
			"isSort", "isReverse" })
	public void clear() {
		val.clear();
	}

	public final int sum() {
		int sum = 0;
		for (int n : val) {
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

//	@ImpactOn(method = { "firstElement", "lastElement", "isSort", "isReverse" })
//	public final void sort() {
//		Collections.sort(val);
//	}
//
//	@ImpactOn(method = { "firstElement", "lastElement", "isSort", "isReverse" })
//	public final void reverse() {
//		Collections.reverse(val);
//	}

	public final boolean isSort() {
		List<Integer> list = new ArrayList<Integer>(val);
		Collections.sort(list);
		if (val.equals(list)) {
			return true;
		} else
			return false;
	}

	public final boolean isReverse() {
		List<Integer> list = new ArrayList<Integer>(val);
		Collections.reverse(list);
		if (val.equals(list)) {
			return true;
		} else
			return false;
	}
	
	@ImpactOn(method = {"avg", "sum","lastElement",
			"isSort", "isReverse" })
	public final void changeLast(int n) {
		val.remove(val.size()-1);
		val.add(n);
	}


}
