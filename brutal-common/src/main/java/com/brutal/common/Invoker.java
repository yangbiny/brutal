package com.brutal.common;

public interface Invoker<T> {

  Class<T> getInterfaceClass();

  Result invoke(Invocation invocation);
}
