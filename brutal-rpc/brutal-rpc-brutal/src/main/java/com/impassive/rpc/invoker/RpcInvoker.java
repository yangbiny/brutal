package com.impassive.rpc.invoker;

import com.brutal.common.Invocation;
import com.brutal.common.Invoker;
import com.brutal.common.Result;
import com.brutal.common.URL;
import com.impassive.remoting.exchange.ExchangeClient;

public class RpcInvoker<T> implements Invoker<T> {

  private ExchangeClient exchangeClient;

  private final URL url;

  private Class<T> classType;

  public RpcInvoker(Class<T> classType, URL url) {
    this.classType = classType;
    this.url = url;
  }

  public RpcInvoker(Class<T> classType, ExchangeClient exchangeClient, URL url) {
    this.classType = classType;
    this.exchangeClient = exchangeClient;
    this.url = url;
  }

  @Override
  public Class<T> getInterfaceClass() {
    return classType;
  }

  @Override
  public Result invoke(Invocation invocation) {
    return exchangeClient.request();
  }
}
