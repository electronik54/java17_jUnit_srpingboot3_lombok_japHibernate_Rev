package com.electronik54.revision_3.springboot.ch196_spring_aop_basics.solution;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/** Cross-cutting logging concern. */
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.electronik54.revision_3.springboot.ch196_spring_aop_basics.solution.BusinessService.*(..))")
    public void businessMethods() {
    }

    @Before("businessMethods()")
    public void beforeAdvice() {
        System.out.println("Before executing processOrder");
    }
}