package com.impassive.rpc.protocol;

import com.brutal.common.Invoker;
import com.brutal.common.ServiceMetadata;
import com.brutal.common.URL;
import com.impassive.registry.ServiceRegister;
import com.impassive.remote.NettyExchangeClientAdapter;
import com.impassive.remoting.exchange.ExchangeClient;
import com.impassive.remoting.exchange.ExchangeClientAdapter;
import com.impassive.rpc.Protocol;
import com.impassive.rpc.invoker.RpcInvoker;
import java.util.List;

public class BrutalProtocol implements Protocol {

  private ServiceRegister serviceRegister;

  private final ExchangeClientAdapter exchangeClientAdapter = new NettyExchangeClientAdapter();

  @Override
  public <T> Invoker<T> refer(Class<T> classType, URL url) {
    // 1. 服务发现
    List<ServiceMetadata> service = serviceRegister.findService(url);

    // 2. 构建invoker
    // 2.1 根据url构建client
    ExchangeClient exchangeClient = exchangeClientAdapter.buildExchangeClient(url);
    // 2.2 根据构建的client生成对应的invoker
    return new RpcInvoker<>(classType, exchangeClient, url);
  }
}
