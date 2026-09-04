package com.electronik54.revision_3.springboot.ch200_spring_aop_advanced.solution;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/** Lower @Order value = runs first on entry. */
@Aspect
@Component
@Order(1)
public class SecurityAspect {

    @Around("execution(* ..CoreService.execute(..))")
    public Object secure(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[Security] checking access...");
        Object result = pjp.proceed();
        System.out.println("[Security] access granted");
        return result;
    }
}