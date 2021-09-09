package com.impassive.registry;

import com.brutal.common.ServiceMetadata;
import com.brutal.common.URL;
import java.util.List;

/** 服务注册和服务发现的入口 */
public interface ServiceRegister {

  void register(URL url);

  List<ServiceMetadata> findService(URL url);
}
