package com.electronik54.revision_3.springboot.ch197_spring_aop_advice_types.solution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Solution 197: Spring AOP Advice Types
 *
 * Demonstrates all 5 advice types: @Before, @After, @AfterReturning,
 * @AfterThrowing, @Around.
 *
 * Run this to see the console output from each advice type.
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Solution {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        DemoService svc = ctx.getBean(DemoService.class);

        System.out.println("=== Solution 197: AOP Advice Types ===\n");
        System.out.println("--- Successful call ---");
        svc.process("test");

        System.out.println("\n--- Failing call (simulates exception) ---");
        try { svc.process("fail"); } catch (RuntimeException ignored) {}

        System.out.println("\nAdvice types demonstrated:");
        System.out.println("  @Before         - Runs before target method");
        System.out.println("  @AfterReturning - Runs after successful return");
        System.out.println("  @AfterThrowing  - Runs after exception is thrown");
        System.out.println("  @After          - Runs after (finally, regardless)");
        System.out.println("  @Around         - Wraps the entire method execution");
        ctx.close();
    }
}

@org.springframework.stereotype.Service
class DemoService {
    public String process(String input) {
        String result = "Processed: " + input;
        System.out.println("    [Target] Executing process(\"" + input + "\")");
        if ("fail".equals(input)) throw new RuntimeException("Simulated failure");
        System.out.println("    [Target] Returning: " + result);
        return result;
    }
}

@org.springframework.stereotype.Component
class AllAdviceAspect {
    @org.aspectj.lang.annotation.Before("execution(* DemoService.process(..))")
    public void before(org.aspectj.lang.JoinPoint jp) {
        System.out.println("  [@Before] About to call " + jp.getSignature().getName());
    }

    @org.aspectj.lang.annotation.AfterReturning(
        value = "execution(* DemoService.process(..))", returning = "result")
    public void afterReturning(Object result) {
        System.out.println("  [@AfterReturning] Got result: " + result);
    }

    @org.aspectj.lang.annotation.AfterThrowing(
        value = "execution(* DemoService.process(..))", throwing = "ex")
    public void afterThrowing(RuntimeException ex) {
        System.out.println("  [@AfterThrowing] Exception: " + ex.getMessage());
    }

    @org.aspectj.lang.annotation.After("execution(* DemoService.process(..))")
    public void afterFinally(org.aspectj.lang.JoinPoint jp) {
        System.out.println("  [@After] (finally) " + jp.getSignature().getName() + " completed");
    }

    @org.aspectj.lang.annotation.Around("execution(* DemoService.process(..))")
    public Object around(org.aspectj.lang.ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("  [@Around] Before proceed");
        long start = System.nanoTime();
        try {
            Object result = pjp.proceed();
            long elapsed = (System.nanoTime() - start) / 1_000_000;
            System.out.println("  [@Around] After proceed (took " + elapsed + "ms)");
            return result;
        } catch (Throwable t) {
            System.out.println("  [@Around] Exception caught: " + t.getMessage());
            throw t;
        }
    }
}