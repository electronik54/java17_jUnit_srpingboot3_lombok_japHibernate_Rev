package com.electronik54.revision_3.springboot.ch196_spring_aop_basics.solution;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/** Enables @AspectJ proxy-based AOP for this package. */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.electronik54.revision_3.springboot.ch196_spring_aop_basics.solution")
public class AopConfig {
}