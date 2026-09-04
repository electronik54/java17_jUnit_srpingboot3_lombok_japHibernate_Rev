package com.electronik54.revision_3.springboot.ch199_spring_aop_realworld.solution;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/** Measures @Timed method execution with minimal overhead. */
@Aspect
@Component
public class TimingAspect {

    @Pointcut("@annotation(timed)")
    public void timedMethod(Timed timed) {
    }

    @Around("timedMethod(timed)")
    public Object measure(ProceedingJoinPoint pjp, Timed timed) throws Throwable {
        long start = System.nanoTime();
        Object result = pjp.proceed();
        long elapsedMs = (System.nanoTime() - start) / 1_000_000;
        System.out.println("TIMED " + pjp.getSignature().getName() + ": " + elapsedMs + " ms");
        return result;
    }
}