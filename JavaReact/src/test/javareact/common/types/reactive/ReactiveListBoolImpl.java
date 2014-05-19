package test.javareact.common.types.reactive;

import java.util.List;

import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveListBoolImpl extends Reactive implements ReactiveListBool {

  protected ReactiveListBoolImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.LIST, name, isPublic);
  }

  protected ReactiveListBoolImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.LIST, name, isPublic);
  }


@Override
public int size() {
	requiresUpdatedValue();
    return value.intVal();
}

@Override
public boolean lastElement() {
	requiresUpdatedValue();
    return value.boolVal();
}

@Override
public boolean firstElement() {
	requiresUpdatedValue();
    return value.boolVal();
}

@Override
public void clear() {
	requiresUpdatedValue();
}

@Override
public boolean isAllTrue() {
	requiresUpdatedValue();
    return value.boolVal();
}

@Override
public boolean isAllFalse() {
	requiresUpdatedValue();
    return value.boolVal();
}


}
