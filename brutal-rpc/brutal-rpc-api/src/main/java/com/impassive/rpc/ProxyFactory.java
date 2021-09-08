package com.impassive.rpc;

import com.brutal.common.Invoker;

public interface ProxyFactory {

  <T> T proxy(Invoker<T> invoker);
}
