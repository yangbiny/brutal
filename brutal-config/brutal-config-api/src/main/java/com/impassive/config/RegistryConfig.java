package com.impassive.config;

import lombok.Getter;
import lombok.Setter;

/**
 * 注册中心的相关配置
 */
@Getter
@Setter
public class RegistryConfig {

  private String host;

  private Integer port;
}
