package com.impassive.remoting.exchange;

import com.brutal.common.Request;
import com.brutal.common.Result;

public interface ExchangeClient {

  Result request(Request request);
}
