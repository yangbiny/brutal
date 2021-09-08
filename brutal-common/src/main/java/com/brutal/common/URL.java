package com.brutal.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class URL {

  private Integer protocolPort;

  private String registryHost;

  private Integer registryPort;

  private String groupName;

  private String serviceName;

  private Class<?> classType;

  private String applicationName;

  public URL(String applicationName, Integer protocolPort, String registryHost, Integer registryPort,
      String groupName, String serviceName, Class<?> classType) {
    this.applicationName = applicationName;
    this.protocolPort = protocolPort;
    this.registryHost = registryHost;
    this.registryPort = registryPort;
    this.groupName = groupName;
    this.serviceName = serviceName;
    this.classType = classType;
  }

  public URL(String applicationName, Integer protocolPort, String registryHost,
      Integer registryPort,
      String groupName, Class<?> classType) {
    this(applicationName, protocolPort, registryHost, registryPort, groupName, classType.getName(),
        classType);
  }
}
