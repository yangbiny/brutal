package com.impassive.brutal.rpc.proxy;

import com.impassive.brutal.common.Invoker;
import com.impassive.brutal.rpc.ProxyFactory;

public abstract class AbstractProxyFactory implements ProxyFactory {

  protected abstract <T> T createProxy(Invoker<T> invoker, Class<T>[] classType);

  @SuppressWarnings("unchecked")
  @Override
  public <T> T proxy(Invoker<T> invoker) {
    Class<T>[] classTypes = new Class[1];
    classTypes[0] = invoker.getInterfaceClass();
    return createProxy(invoker, classTypes);
  }
}
