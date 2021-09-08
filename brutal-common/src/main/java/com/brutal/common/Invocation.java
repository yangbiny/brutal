package com.brutal.common;

public interface Invocation {

  String getServiceName();

  Object[] getArgs();

  String getMethodName();

}
