package test.javareact.common.types.reactive;

import java.util.List;

import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveListDoubleImpl extends Reactive implements ReactiveListDouble {

  protected ReactiveListDoubleImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.LIST, name, isPublic);
  }

  protected ReactiveListDoubleImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.LIST, name, isPublic);
  }


@Override
public int size() {
	requiresUpdatedValue();
    return value.intVal();
}

@Override
public double sum() {
	requiresUpdatedValue();
    return value.doubleVal();
}

@Override
public double avg() {
	requiresUpdatedValue();
    return value.doubleVal();
}

@Override
public double lastElement() {
	requiresUpdatedValue();
    return value.doubleVal();
}

@Override
public double firstElement() {
	requiresUpdatedValue();
    return value.doubleVal();
}

@Override
public void clear() {
	requiresUpdatedValue();
}

@Override
public List<Double> sort() {
	requiresUpdatedValue();
    return value.listVal();
}

@Override
public List<Double> reverse() {
	requiresUpdatedValue();
    return value.listVal();
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
