package com.brutal.common;

public class BrutalException extends RuntimeException {

  protected URL url;

  public BrutalException() {}

  public BrutalException(URL url) {
    this.url = url;
  }

  public BrutalException(String message, URL url) {
    super(message);
    this.url = url;
  }

  public BrutalException(String message, Throwable cause, URL url) {
    super(message, cause);
    this.url = url;
  }

  public BrutalException(Throwable cause, URL url) {
    super(cause);
    this.url = url;
  }

  public BrutalException(
      String message,
      Throwable cause,
      boolean enableSuppression,
      boolean writableStackTrace,
      URL url) {
    super(message, cause, enableSuppression, writableStackTrace);
    this.url = url;
  }
}
