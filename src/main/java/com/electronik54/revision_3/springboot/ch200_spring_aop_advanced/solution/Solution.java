package com.electronik54.revision_3.springboot.ch200_spring_aop_advanced.solution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Solution 200: Spring AOP Advanced
 *
 * Demonstrates @Around with ProceedingJoinPoint, aspect ordering,
 * conditional advice execution.
 */
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Solution {

    @org.springframework.stereotype.Service
    static class PaymentService {
        public String processPayment(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
            return "Payment processed: $" + amount;
        }
    }

    @Component @Order(1)
    static class SecurityAspect {
        @org.aspectj.lang.annotation.Around("execution(* com.electronik54.revision_3.springboot.ch200_spring_aop_advanced..*(..))")
        public Object checkAccess(org.aspectj.lang.ProceedingJoinPoint pjp) throws Throwable {
            System.out.println("  [Security] Checking access...");
            boolean hasAccess = true;
            if (!hasAccess) { System.out.println("  [Security] Denied!"); return null; }
            return pjp.proceed();
        }
    }

    @Component @Order(2)
    static class LoggingAspect {
        @org.aspectj.lang.annotation.Around("execution(* com.electronik54.revision_3.springboot.ch200_spring_aop_advanced..*(..))")
        public Object logExecution(org.aspectj.lang.ProceedingJoinPoint pjp) throws Throwable {
            System.out.println("  [Logging] Entering: " + pjp.getSignature().toShortString());
            long start = System.nanoTime();
            try {
                Object result = pjp.proceed();
                long ms = (System.nanoTime() - start) / 1_000_000;
                System.out.println("  [Logging] Exited: " + pjp.getSignature().toShortString() + " (" + ms + "ms)");
                return result;
            } catch (Exception e) {
                System.out.println("  [Logging] Exception in " + pjp.getSignature().toShortString() + ": " + e.getMessage());
                throw e;
            }
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        var svc = ctx.getBean(PaymentService.class);

        System.out.println("=== Solution 200: Spring AOP Advanced ===\n");
        System.out.println("Result: " + svc.processPayment(100.50));
        System.out.println("\nKey concepts:");
        System.out.println("  @Order controls aspect execution sequence");
        System.out.println("  @Around wrap the full method lifecycle");
        System.out.println("  ProceedingJoinPoint.proceed() invokes the target");
        System.out.println("  proxyTargetClass=true ensures CGLIB proxy for classes");
        ctx.close();
    }
}