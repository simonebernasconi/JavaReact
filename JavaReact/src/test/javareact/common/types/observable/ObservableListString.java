package test.javareact.common.types.observable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObservableListString extends Observable {
	public List<String> val = new ArrayList<String>();

	public ObservableListString(String observableId, boolean persistent,
			List<?> val) {
		super(observableId, persistent);
		// set(val);
	}

	public ObservableListString(String observableId, List<?> val) {
		super(observableId);
		// set(val);
	}

	@ImpactOn(method = { "size", "firstElement", "lastElement", "sort",
			"reverse", "isSort", "isReverse", "concat" })
	public final void add(String str) {
		val.add(str);
	}

	@ImpactOn(method = { "size", "firstElement", "lastElement", "sort",
			"reverse", "isSort", "isReverse", "concat" })
	public final void addAll(List<String> list) {
		val.addAll(list);
	}

	@ImpactOn(method = { "size", "firstElement", "lastElement", "sort",
			"reverse", "isSort", "isReverse", "concat" })
	public final void remove(String str) {
		val.remove(str);
	}

	@ImpactOn(method = { "size", "firstElement", "lastElement", "sort",
			"reverse", "isSort", "isReverse", "concat" })
	public final void removeAll(List<String> list) {
		val.removeAll(list);
	}

	public final int size() {
		return val.size();
	}

	public final String lastElement() {
		return val.get(val.size() - 1);
	}

	public final String firstElement() {
		return val.get(0);
	}

	@ImpactOn(method = { "size", "firstElement", "lastElement", "sort",
			"reverse", "isSort", "isReverse", "concat" })
	public void clear() {
		val.clear();
	}

	public final String concat() {
		String concat = "";
		for (String str : val) {
			concat.concat(str);
		}
		return concat;
	}

	@ImpactOn(method = { "firstElement", "lastElement", "isSort", "isReverse",
			"reverse" })
	public final List<String> sort() {
		List<String> list = new ArrayList<String>(val);
		Collections.sort(list);
		return list;
	}

	@ImpactOn(method = { "firstElement", "lastElement", "isSort", "isReverse",
			"sort" })
	public final List<String> reverse() {
		List<String> list = new ArrayList<String>(val);
		Collections.reverse(list);
		return list;
	}

	public final boolean isSort() {
		List<String> list = new ArrayList<String>(val);
		Collections.sort(list);
		if (val.equals(list)) {
			return true;
		} else
			return false;
	}

	public final boolean isReverse() {
		List<String> list = new ArrayList<String>(val);
		Collections.reverse(list);
		if (val.equals(list)) {
			return true;
		} else
			return false;
	}

}
