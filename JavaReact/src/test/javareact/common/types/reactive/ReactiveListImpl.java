package test.javareact.common.types.reactive;

import java.util.List;

import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveListImpl extends Reactive implements ReactiveList {

  protected ReactiveListImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.INT, name, isPublic);
  }

  protected ReactiveListImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.INT, name, isPublic);
  }


@Override
public int size() {
	requiresUpdatedValue();
    return value.intVal();
}


}
