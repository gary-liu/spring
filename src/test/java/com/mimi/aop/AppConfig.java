package com.mimi.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.mimi")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
}
