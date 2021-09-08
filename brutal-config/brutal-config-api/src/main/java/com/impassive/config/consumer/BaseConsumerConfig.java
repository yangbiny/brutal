package com.impassive.config.consumer;

import com.impassive.config.ApplicationConfig;
import com.impassive.config.ProtocolConfig;
import com.impassive.config.RegistryConfig;
import com.impassive.rpc.Protocol;
import com.impassive.rpc.protocol.BrutalProtocol;
import lombok.Getter;
import lombok.Setter;

/**
 * @author impassivey
 */
@Getter
public class BaseConsumerConfig {

  protected static final Protocol PROTOCOL = new BrutalProtocol();

  @Setter
  protected RegistryConfig registryConfig;

  @Setter
  protected ProtocolConfig protocolConfig;

  @Setter
  protected ApplicationConfig applicationConfig;

}
