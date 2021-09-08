package com.impassive.config.consumer;

import com.impassive.config.ApplicationConfig;
import com.impassive.config.ProtocolConfig;
import com.impassive.config.RegistryConfig;
import com.impassive.rpc.Protocol;
import com.impassive.rpc.ProxyFactory;
import com.impassive.rpc.protocol.BrutalProtocol;
import com.impassive.rpc.proxy.JdkProxyFactory;
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
