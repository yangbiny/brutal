package com.impassive.brutal.common;

import com.impassive.brutal.common.exception.UrlIllegalException;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

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

  private String providerHost;

  private Integer providerPort;

  public URL(
      String applicationName,
      Integer protocolPort,
      String registryHost,
      Integer registryPort,
      String groupName,
      String serviceName,
      Class<?> classType) {
    this.applicationName = applicationName;
    this.protocolPort = protocolPort;
    this.registryHost = registryHost;
    this.registryPort = registryPort;
    this.groupName = groupName;
    this.serviceName = serviceName;
    this.classType = classType;
  }

  public URL(
      String applicationName,
      Integer protocolPort,
      String registryHost,
      Integer registryPort,
      String groupName,
      Class<?> classType) {
    this(
        applicationName,
        protocolPort,
        registryHost,
        registryPort,
        groupName,
        classType.getName(),
        classType);
  }

  public String registerInfo() {
    return String.format(
        "register host = %s ; register port = %s ;service name = %s ; group name = %s",
        registryHost, registryPort, serviceName, groupName);
  }

  public void addParameter(ServiceMetadata serviceMetadata) {
    if (StringUtils.isEmpty(serviceName)) {
      throw new UrlIllegalException("serviceName is empty", this);
    }
    this.providerHost = serviceMetadata.getProviderHost();
    this.protocolPort = serviceMetadata.getProviderPort();
  }
}
