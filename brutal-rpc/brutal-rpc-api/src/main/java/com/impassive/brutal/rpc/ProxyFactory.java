package com.impassive.brutal.rpc;

import com.impassive.brutal.common.Invoker;

public interface ProxyFactory {

  <T> T proxy(Invoker<T> invoker);
}
