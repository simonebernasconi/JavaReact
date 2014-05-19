package test.javareact.common.types.observable;

import java.util.ArrayList;
import java.util.List;

public class ObservableListBool extends Observable {
	public List<Boolean> val = new ArrayList<Boolean>();

	public ObservableListBool(String observableId, boolean persistent,
			List<?> val) {
		super(observableId, persistent);
		// set(val);
	}

	public ObservableListBool(String observableId, List<?> val) {
		super(observableId);
		// set(val);
	}

	@ImpactOn(method = { "size", "firstElement", "lastElement", "isAllTrue",
			"isAllFalse" })
	public final void add(Boolean bool) {
		val.add(bool);
	}

	@ImpactOn(method = { "size", "firstElement", "lastElement", "isAllTrue",
			"isAllFalse" })
	public final void addAll(List<Boolean> list) {
		val.addAll(list);
	}

	@ImpactOn(method = { "size", "firstElement", "lastElement", "isAllTrue",
			"isAllFalse" })
	public final void remove(Boolean bool) {
		val.remove(bool);
	}

	@ImpactOn(method = { "size", "firstElement", "lastElement", "isAllTrue",
			"isAllFalse" })
	public final void removeAll(List<Boolean> list) {
		val.removeAll(list);
	}

	public final int size() {
		return val.size();
	}

	public final Boolean lastElement() {
		return val.get(val.size() - 1);
	}

	public final Boolean firstElement() {
		return val.get(0);
	}

	@ImpactOn(method = { "size", "firstElement", "lastElement", "isAllTrue",
			"isAllFalse" })
	public void clear() {
		val.clear();
	}

	public final boolean isAllTrue() {
		Boolean result = true;
		for (Boolean bool : val) {
			if (bool == false) {
				result = false;
			} else {
			}
		}
		return result;
	}

	public final boolean isAllFalse() {
		Boolean result = true;
		for (Boolean bool : val) {
			if (bool == true) {
				result = false;
			} else {
			}
		}
		return result;
	}

}
