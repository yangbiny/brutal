package com.impassive.rpc;

import com.brutal.common.Invoker;
import com.brutal.common.URL;

public interface Protocol {

  <T> Invoker<T> refer(Class<T> classType, URL url);
}
