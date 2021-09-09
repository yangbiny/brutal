package com.impassive.brutal.remoting.exchange;

import com.impassive.brutal.common.URL;

public interface ExchangeClientAdapter {

   ExchangeClient buildExchangeClient(URL url);
}
