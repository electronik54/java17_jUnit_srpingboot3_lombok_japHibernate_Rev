package com.electronik54.revision_3.springboot.ch198_spring_aop_pointcuts;

/**
 * Challenge 198: AOP Pointcuts (execution, within, & annotations)
 *
 * Problem:
 * Write different pointcut expressions and observe matching:
 * - execution: fine-grained on method signature: execution(public * *(..))
 * - within: restricts to types in a package: within(com.example.service..*)
 * - @within / @annotation: match methods/classes carrying a specific annotation
 *
 * Hint:
 * - execution(returnType declaringType.method(params))
 * - within(typePattern) matches all methods of matching types
 * - @annotation(com.example.MyAnno) advises methods annotated with MyAnno
 *
 * Expected Output:
 * A method with a custom @Auditable annotation gets logged; others do not
 *
 * TODO:
 * 1. Create an @Auditable runtime annotation
 * 2. Create TargetService with an @Auditable method and a plain method
 * 3. Aspect uses @annotation(Auditable) pointcut
 * 4. Verify only the annotated method is advised
 *
 * The solution package contains the annotation, service, and aspect.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 198: AOP Pointcuts ===");
    }
}