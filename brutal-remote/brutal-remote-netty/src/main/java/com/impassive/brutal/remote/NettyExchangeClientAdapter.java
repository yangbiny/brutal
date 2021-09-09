package com.impassive.brutal.remote;

import com.impassive.brutal.common.URL;
import com.impassive.brutal.remote.exchange.NettyExchangeClient;
import com.impassive.brutal.remoting.exchange.ExchangeClient;
import com.impassive.brutal.remoting.exchange.ExchangeClientAdapter;

public class NettyExchangeClientAdapter implements ExchangeClientAdapter {

  @Override
  public ExchangeClient buildExchangeClient(URL url) {
    return new NettyExchangeClient(url);
  }
}
