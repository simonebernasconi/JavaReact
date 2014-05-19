package test.javareact.common.types.reactive;

import java.util.List;

import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveListIntegerImpl extends Reactive implements ReactiveListInteger {

  protected ReactiveListIntegerImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.LIST, name, isPublic);
  }

  protected ReactiveListIntegerImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.LIST, name, isPublic);
  }


@Override
public int size() {
	requiresUpdatedValue();
    return value.intVal();
}

@Override
public int sum() {
	requiresUpdatedValue();
    return value.intVal();
}

@Override
public double avg() {
	requiresUpdatedValue();
    return value.doubleVal();
}

@Override
public int lastElement() {
	requiresUpdatedValue();
    return value.intVal();
}

@Override
public int firstElement() {
	requiresUpdatedValue();
    return value.intVal();
}

@Override
public void clear() {
	requiresUpdatedValue();
}

@Override
public List<Integer> sort() {
	requiresUpdatedValue();
    return value.listIntVal();
}

@Override
public List<Integer> reverse() {
	requiresUpdatedValue();
    return value.listIntVal();
}

@Override
public boolean isSort() {
	requiresUpdatedValue();
    return value.boolVal();
}

@Override
public boolean isReverse() {
	requiresUpdatedValue();
    return value.boolVal();
}


}
