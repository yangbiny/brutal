package com.impassive.remoting.exchange;

import com.brutal.common.URL;

public interface ExchangeClientAdapter {

   ExchangeClient buildExchangeClient(URL url);
}
