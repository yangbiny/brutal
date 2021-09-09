package com.impassive.brutal.remote.exchange;

import com.impassive.brutal.common.Request;
import com.impassive.brutal.common.Result;
import com.impassive.brutal.common.URL;
import com.impassive.brutal.remoting.exchange.ExchangeClient;

public class NettyExchangeClient implements ExchangeClient {

  private URL url;

  public NettyExchangeClient(URL url) {
    this.url = url;
  }

  @Override
  public Result request(Request request) {
    return null;
  }
}
