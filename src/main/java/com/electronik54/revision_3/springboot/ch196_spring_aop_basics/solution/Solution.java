package com.electronik54.revision_3.springboot.ch196_spring_aop_basics.solution;

import org.springframework.aop.framework.AopContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Solution 196: Spring AOP Basics
 *
 * Demonstrates core AOP concepts: Aspect, JoinPoint, Pointcut, Advice.
 * Uses a simple logging aspect to intercept method calls.
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Solution {

    @Service
    static class GreetingService {
        public String greet(String name) {
            return "Hello, " + name + "!";
        }
        public String farewell(String name) {
            return "Goodbye, " + name + "!";
        }
    }

    @Component
    static class LoggingAspect {
        @org.aspectj.lang.annotation.Before("execution(* com.electronik54.revision_3.springboot.ch196_spring_aop_basics..*(..))")
        public void logBefore(org.aspectj.lang.JoinPoint jp) {
            System.out.println("  [AOP @Before] Entering: " + jp.getSignature().toShortString());
        }

        @org.aspectj.lang.annotation.AfterReturning(
            value = "execution(* com.electronik54.revision_3.springboot.ch196_spring_aop_basics..*(..))",
            returning = "result")
        public void logAfter(org.aspectj.lang.JoinPoint jp, Object result) {
            System.out.println("  [AOP @AfterReturning] " + jp.getSignature().toShortString() + " returned: " + result);
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        GreetingService svc = ctx.getBean(GreetingService.class);

        System.out.println("=== Solution 196: Spring AOP Basics ===\n");
        System.out.println("Calling GreetingService (notice AOP logging):");
        System.out.println("  Result: " + svc.greet("Alice"));
        System.out.println("  Result: " + svc.farewell("Bob"));
        System.out.println("\nAOP Concepts:");
        System.out.println("  Aspect: A module that encapsulates cross-cutting concern");
        System.out.println("  JoinPoint: A point in execution (method call)");
        System.out.println("  Pointcut: Expression that selects JoinPoints");
        System.out.println("  Advice: Action taken at a JoinPoint (@Before, @After, @Around)");
        ctx.close();
    }
}