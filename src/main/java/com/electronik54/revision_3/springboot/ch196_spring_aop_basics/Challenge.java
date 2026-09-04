package com.electronik54.revision_3.springboot.ch196_spring_aop_basics;

/**
 * Challenge 196: AOP Basics (@Aspect, @Before, @Pointcut)
 *
 * Problem:
 * Add logging to a BusinessService method WITHOUT modifying its code using
 * Aspect-Oriented Programming. Configure @EnableAspectJAutoProxy, an
 * @Aspect with a @Pointcut matching the service package, and a @Before advice
 * that logs "Before executing ...".
 *
 * Hint:
 * - @Aspect marks a cross-cutting concern class
 * - @Pointcut("execution(* service.*.*(..))") defines WHERE advice applies
 * - @Before runs BEFORE the matched method
 * - Spring AOP uses proxy-based AOP: only Spring-managed beans are advised
 *
 * Expected Output (test run):
 * Before executing processOrder
 * BusinessService processing order 1
 *
 * TODO:
 * 1. Create BusinessService (Spring bean) with processOrder
 * 2. Create LoggingAspect with @Aspect + @Pointcut + @Before
 * 3. Create an @Configuration that @EnableAspectJAutoProxy s
 * 4. Verify via a small context test that advice fires
 *
 * The solution package includes a test proving the aspect activates.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 196: Spring AOP Basics ===");
    }
}