package com.impassive.registry;

import com.brutal.common.ServiceMetadata;
import com.brutal.common.URL;
import java.util.List;

public class ZookeeperServiceRegister implements ServiceRegister {

  @Override
  public void register(URL url) {}

  @Override
  public List<ServiceMetadata> findService(URL url) {
    return null;
  }
}
