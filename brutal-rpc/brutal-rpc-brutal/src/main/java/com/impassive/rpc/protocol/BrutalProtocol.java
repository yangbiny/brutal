package com.impassive.rpc.protocol;

import com.brutal.common.Invoker;
import com.brutal.common.ServiceMetadata;
import com.brutal.common.URL;
import com.brutal.common.exception.ServiceNotFoundException;
import com.impassive.registry.ServiceRegister;
import com.impassive.registry.ZookeeperServiceRegister;
import com.impassive.remote.NettyExchangeClientAdapter;
import com.impassive.remoting.exchange.ExchangeClient;
import com.impassive.remoting.exchange.ExchangeClientAdapter;
import com.impassive.rpc.Protocol;
import com.impassive.rpc.invoker.RpcInvoker;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/** brutal默认的协议类型 */
public class BrutalProtocol implements Protocol {

  private final ServiceRegister serviceRegister = new ZookeeperServiceRegister();

  private final ExchangeClientAdapter exchangeClientAdapter = new NettyExchangeClientAdapter();

  @Override
  public <T> Invoker<T> refer(Class<T> classType, URL url) {
    // 1. 服务发现
    List<ServiceMetadata> service = serviceRegister.findService(url);
    // 2. 重新构建新的url，包括了访问的目的地址
    if (CollectionUtils.isEmpty(service)) {
      throw new ServiceNotFoundException("can not find service", url);
    }
    // TODO:做路由
    ServiceMetadata serviceMetadata = service.get(0);
    url.addParameter(serviceMetadata);
    // 3. 构建invoker
    // 3.1 根据url构建client
    ExchangeClient exchangeClient = exchangeClientAdapter.buildExchangeClient(url);
    // 3.2 根据构建的client生成对应的invoker
    return new RpcInvoker<>(classType, exchangeClient, url);
  }
}
