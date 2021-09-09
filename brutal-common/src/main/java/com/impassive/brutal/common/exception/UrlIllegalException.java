package com.impassive.brutal.common.exception;

import com.impassive.brutal.common.BrutalException;
import com.impassive.brutal.common.URL;

public class UrlIllegalException extends BrutalException {

  public UrlIllegalException() {}

  public UrlIllegalException(String message, URL url) {
    super(message, url);
  }

  public UrlIllegalException(String message) {
    super(message, null);
  }
}
