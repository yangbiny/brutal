package com.impassive.rpc.protocol;

import com.brutal.common.Invoker;
import com.brutal.common.URL;
import com.impassive.rpc.Protocol;

public class BrutalProtocol implements Protocol {

  @Override
  public <T> Invoker<T> refer(Class<T> classType, URL url) {
    return null;
  }
}
