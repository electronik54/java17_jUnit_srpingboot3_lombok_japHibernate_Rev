package com.electronik54.revision_3.springboot.ch197_spring_aop_advice_types;

/**
 * Challenge 197: AOP Advice Types (@Before @AfterReturning @AfterThrowing @Around)
 *
 * Problem:
 * Demonstrate every advice type on a Calculator service:
 * - @Before runs before the method
 * - @AfterReturning runs after success, can read the return value
 * - @AfterThrowing runs on exception
 * - @After always runs (finally-equivalent)
 * - @Around wraps the call entirely (can bypass/transform)
 *
 * Hint:
 * - Order of execution: Before -> Around enter -> method -> AfterReturning/AfterThrowing -> After
 * - @Around receives ProceedingJoinPoint; call pjp.proceed() to continue
 * - Use joinPoint.getArgs() to read method arguments
 *
 * Expected Output (console):
 * [@Before] dividing 10 by 2
 * [@Around] before proceed
 * result = 5
 * [@AfterReturning] result=5
 * [@After] finished
 * (and an exception path showing @AfterThrowing)
 *
 * TODO:
 * 1. Create CalculatorService (Spring bean) with divide(a,b)
 * 2. Create AdviceDemoAspect exposing @Before/@AfterReturning/@AfterThrowing/@After/@Around
 * 3. Enable AOP and run both a success and a failure call
 *
 * See solution package + a small context test for verification.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 197: AOP Advice Types ===");
    }
}