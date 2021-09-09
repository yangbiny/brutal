package com.impassive.brutal.rpc.invoker;

import com.impassive.brutal.common.Invocation;
import com.impassive.brutal.common.Invoker;
import com.impassive.brutal.common.Request;
import com.impassive.brutal.common.Result;
import com.impassive.brutal.common.URL;
import com.impassive.brutal.remoting.exchange.ExchangeClient;
import com.impassive.brutal.rpc.request.RpcRequest;

public class RpcInvoker<T> implements Invoker<T> {

  private final ExchangeClient exchangeClient;

  private final URL url;

  private final Class<T> classType;

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
    Request request = new RpcRequest();
    return exchangeClient.request(request);
  }
}
