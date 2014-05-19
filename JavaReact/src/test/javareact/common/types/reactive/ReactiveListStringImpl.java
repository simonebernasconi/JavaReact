package test.javareact.common.types.reactive;

import java.util.List;

import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveListStringImpl extends Reactive implements ReactiveListString {

  protected ReactiveListStringImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.LISTSTRING, name, isPublic);
  }

  protected ReactiveListStringImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.LISTSTRING, name, isPublic);
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
    return value.listStringVal();
}

@Override
public List<String> reverse() {
	requiresUpdatedValue();
    return value.listStringVal();
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
