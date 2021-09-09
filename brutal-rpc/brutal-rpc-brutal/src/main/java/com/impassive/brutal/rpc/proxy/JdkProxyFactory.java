package com.impassive.brutal.rpc.proxy;

import com.impassive.brutal.common.Invoker;
import java.lang.reflect.Proxy;

@SuppressWarnings("unchecked")
public class JdkProxyFactory extends AbstractProxyFactory {

  @Override
  protected <T> T createProxy(Invoker<T> invoker, Class<T>[] classType) {
    return (T)
        Proxy.newProxyInstance(
            Thread.currentThread().getContextClassLoader(),
            classType,
            new ProxyInvocationHandler(invoker));
  }
}
