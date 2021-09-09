package com.impassive.brutal.rpc.proxy;

import com.impassive.brutal.common.Invoker;
import com.impassive.brutal.common.Result;
import com.impassive.brutal.rpc.RpcInvocation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {

  private final Invoker<?> invoker;

  public <T> ProxyInvocationHandler(Invoker<T> invoker) {
    this.invoker = invoker;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    RpcInvocation rpcInvocation = new RpcInvocation(method, args, invoker.getInterfaceClass());
    Result invoke = invoker.invoke(rpcInvocation);
    return invoke.getResult();
  }
}
