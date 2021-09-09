package com.impassive.brutal.rpc;

import com.impassive.brutal.common.Invoker;
import com.impassive.brutal.common.URL;

public interface Protocol {

  <T> Invoker<T> refer(Class<T> classType, URL url);
}
