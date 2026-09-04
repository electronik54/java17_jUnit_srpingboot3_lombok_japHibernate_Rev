package com.electronik54.revision_3.springboot.ch200_spring_aop_advanced.solution;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/** Runs after SecurityAspect on entry (higher order number). */
@Aspect
@Component
@Order(2)
public class CoreLoggingAspect {

    @Around("execution(* ..CoreService.execute(..))")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[Logging] entering execute");
        return pjp.proceed();
    }
}