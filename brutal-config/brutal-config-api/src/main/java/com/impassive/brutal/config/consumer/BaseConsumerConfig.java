package com.impassive.brutal.config.consumer;

import com.impassive.brutal.config.ApplicationConfig;
import com.impassive.brutal.config.ProtocolConfig;
import com.impassive.brutal.config.RegistryConfig;
import com.impassive.brutal.rpc.Protocol;
import com.impassive.brutal.rpc.ProxyFactory;
import com.impassive.brutal.rpc.protocol.BrutalProtocol;
import com.impassive.brutal.rpc.proxy.JdkProxyFactory;
import lombok.Getter;
import lombok.Setter;

/** @author impassivey */
@Getter
public class BaseConsumerConfig {

  protected static final Protocol PROTOCOL = new BrutalProtocol();

  protected static final ProxyFactory PROXY_FACTORY = new JdkProxyFactory();

  @Setter protected RegistryConfig registryConfig;

  @Setter protected ProtocolConfig protocolConfig;

  @Setter protected ApplicationConfig applicationConfig;
}
