package com.electronik54.revision_3.springboot.ch197_spring_aop_advice_types.solution;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/** Demonstrates every advice type. */
@Aspect
@Component
public class AdviceDemoAspect {

    @Pointcut("execution(* ..CalculatorService.divide(..))")
    public void divideMethods() {
    }

    @Before("divideMethods()")
    public void before(JoinPoint joinPoint) {
        System.out.println("[@Before] dividing " + joinPoint.getArgs()[0]
                + " by " + joinPoint.getArgs()[1]);
    }

    @Around("divideMethods()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[@Around] before proceed");
        Object result = pjp.proceed();
        System.out.println("[@Around] after proceed -> " + result);
        return result;
    }

    @AfterReturning(pointcut = "divideMethods()", returning = "result")
    public void afterReturning(Object result) {
        System.out.println("[@AfterReturning] result=" + result);
    }

    @AfterThrowing(pointcut = "divideMethods()", throwing = "ex")
    public void afterThrowing(Throwable ex) {
        System.out.println("[@AfterThrowing] threw " + ex.getClass().getSimpleName());
    }

    @After("divideMethods()")
    public void after() {
        System.out.println("[@After] finished (finally-equivalent)");
    }
}