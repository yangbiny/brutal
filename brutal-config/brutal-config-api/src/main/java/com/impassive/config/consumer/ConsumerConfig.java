package com.impassive.config.consumer;

import com.brutal.common.URL;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * @author impassivey
 */
@Getter
public class ConsumerConfig<T> extends BaseConsumerConfig {

  private String groupName;

  private Class<T> classType;

  private String interfaceName;

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public void setClassType(Class<T> classType) {
    if (classType != null) {
      this.interfaceName = classType.getName();
    }
    this.classType = classType;
  }

  public T refer() {
    checkParam();
    return createProxy();
  }

  private void checkParam() {
    if (applicationConfig == null) {
      throw new IllegalArgumentException("applicationConfig can not be null");
    }
    if (protocolConfig == null) {
      throw new IllegalArgumentException("protocolConfig can not be null");
    }
    if (registryConfig == null) {
      throw new IllegalArgumentException("registryConfig can not be null");
    }
    if (StringUtils.isEmpty(groupName)) {
      throw new IllegalArgumentException("groupName can not be null");
    }
    if (classType == null) {
      throw new IllegalArgumentException("classInterface can not be null");
    }
    if (!classType.isInterface()) {
      throw new IllegalArgumentException(classType.getName() + " is not a interface");
    }
  }

  private T createProxy() {
    URL url = new URL(applicationConfig.getApplicationName(), protocolConfig.getPort(),
        registryConfig.getHost(), registryConfig.getPort(),
        groupName, classType);
    return PROTOCOL.refer(classType, url).get();
  }
}
