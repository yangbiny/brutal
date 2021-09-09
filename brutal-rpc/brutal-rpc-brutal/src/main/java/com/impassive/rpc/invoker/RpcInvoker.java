package com.impassive.rpc.invoker;

import com.brutal.common.Invocation;
import com.brutal.common.Invoker;
import com.brutal.common.Request;
import com.brutal.common.Result;
import com.brutal.common.URL;
import com.impassive.remoting.exchange.ExchangeClient;
import com.impassive.rpc.request.RpcRequest;

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
