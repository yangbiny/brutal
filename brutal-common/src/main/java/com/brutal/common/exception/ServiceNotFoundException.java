package com.brutal.common.exception;

import com.brutal.common.BrutalException;
import com.brutal.common.URL;

public class ServiceNotFoundException extends BrutalException {

  public ServiceNotFoundException(URL url) {
    super(url);
  }

  public ServiceNotFoundException(String message, URL url) {
    super(message, url);
  }

  @Override
  public String getMessage() {
    if (url == null) {
      throw new UrlIllegalException("url is null");
    }
    String message = super.getMessage();
    return message + " : " + url.registerInfo();
  }
}
