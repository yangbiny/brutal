package com.impassive.brutal.remoting.exchange;

import com.impassive.brutal.common.Request;
import com.impassive.brutal.common.Result;

public interface ExchangeClient {

  Result request(Request request);
}
