package com.impassive.brutal.rpc;

import com.impassive.brutal.common.Invocation;
import java.lang.reflect.Method;

public class RpcInvocation implements Invocation {

  private final transient Method method;

  private final Object[] args;

  private final Class<?> interfaceClass;

  public RpcInvocation(Method method, Object[] args, Class<?> interfaceClass) {
    this.method = method;
    this.args = args;
    this.interfaceClass = interfaceClass;
  }

  @Override
  public String getServiceName() {
    return interfaceClass.getName();
  }

  @Override
  public Object[] getArgs() {
    return args;
  }

  @Override
  public String getMethodName() {
    return method.getName();
  }
}
