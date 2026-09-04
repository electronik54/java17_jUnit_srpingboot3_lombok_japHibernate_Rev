package com.electronik54.revision_3.springboot.ch199_spring_aop_realworld.solution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Solution 199: Spring AOP Real-World Use Cases
 *
 * Demonstrates real AOP use cases: performance monitoring, transaction logging.
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Solution {

    @org.springframework.stereotype.Service
    static class OrderService {
        public String placeOrder(String item, int qty) {
            if (qty <= 0) throw new IllegalArgumentException("Invalid quantity");
            try { Thread.sleep(50); } catch (InterruptedException ignored) {}
            return "Order placed: " + item + " x " + qty;
        }
    }

    @Component
    static class MonitoringAspect {
        private final ConcurrentHashMap<String, AtomicLong> timings = new ConcurrentHashMap<>();

        @org.aspectj.lang.annotation.Around("execution(* com.electronik54.revision_3.springboot.ch199_spring_aop_realworld..*(..))")
        public Object measureTime(org.aspectj.lang.ProceedingJoinPoint pjp) throws Throwable {
            long start = System.nanoTime();
            try {
                return pjp.proceed();
            } finally {
                long ms = (System.nanoTime() - start) / 1_000_000;
                String method = pjp.getSignature().toShortString();
                timings.computeIfAbsent(method, k -> new AtomicLong()).addAndGet(ms);
                System.out.println("  [Monitor] " + method + " took " + ms + "ms");
            }
        }
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        var svc = ctx.getBean(OrderService.class);

        System.out.println("=== Solution 199: AOP Real-World ===\n");
        System.out.println("Result: " + svc.placeOrder("Laptop", 1));
        System.out.println("Result: " + svc.placeOrder("Phone", 2));
        try { svc.placeOrder("Item", 0); } catch (IllegalArgumentException e) {
            System.out.println("  Error handled: " + e.getMessage());
        }
        System.out.println("\nAOP provides: monitoring, logging, transactions, security, caching");
        ctx.close();
    }
}