package test.javareact.common.types.reactive;

import java.util.List;

import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveListStringImpl extends Reactive implements ReactiveListString {

  protected ReactiveListStringImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.LIST, name, isPublic);
  }

  protected ReactiveListStringImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.LIST, name, isPublic);
  }


@Override
public int size() {
	requiresUpdatedValue();
    return value.intVal();
}

@Override
public String concat() {
	requiresUpdatedValue();
    return value.stringVal();
}

@Override
public String lastElement() {
	requiresUpdatedValue();
    return value.stringVal();
}

@Override
public String firstElement() {
	requiresUpdatedValue();
    return value.stringVal();
}

@Override
public void clear() {
	requiresUpdatedValue();
}

@Override
public List<String> sort() {
	requiresUpdatedValue();
    return value.listVal();
}

@Override
public List<String> reverse() {
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
