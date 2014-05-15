package test.javareact.common.types.reactive;

import java.util.List;

import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveInterfaceImpl extends Reactive implements ReactiveInterface {

  protected ReactiveInterfaceImpl(String expression, String name, boolean isPublic) {
    super(expression, name, isPublic);
  }

  protected ReactiveInterfaceImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, name, isPublic);
  }

  @Override
  public synchronized List<?> get() {
    requiresUpdatedValue();
    return value.listVal();
  }

  @Override
  public synchronized List<?> add() {
    requiresUpdatedValue();
    return value.listVal();
  }




}
