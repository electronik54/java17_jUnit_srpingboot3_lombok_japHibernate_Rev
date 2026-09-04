package com.electronik54.revision_3.springboot.ch198_spring_aop_pointcuts.solution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Solution 198: Spring AOP Pointcuts
 *
 * Demonstrates pointcut expressions: execution, within, @annotation, args.
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Solution {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        var svc = ctx.getBean(TargetService.class);

        System.out.println("=== Solution 198: AOP Pointcuts ===\n");
        svc.create("Alice");
        svc.update(42);
        svc.delete(42);
        svc.query("test", 1);

        System.out.println("\nPointcut expressions:");
        System.out.println("  execution(* create(..))        - Match by method name pattern");
        System.out.println("  within(com.example..*)         - Match by package");
        System.out.println("  @annotation(Timed)             - Match by annotation");
        System.out.println("  args(int)                      - Match by parameter type");
        ctx.close();
    }
}

@org.springframework.stereotype.Service
class TargetService {
    public void create(String name) { System.out.println("  create(" + name + ")"); }
    public void update(int id) { System.out.println("  update(" + id + ")"); }
    public void delete(int id) { System.out.println("  delete(" + id + ")"); }
    public String query(String q, int page) { System.out.println("  query(" + q + ", " + page + ")"); return "OK"; }
}

@Component
class PointcutAspect {
    @org.aspectj.lang.annotation.Before("execution(* com.electronik54.revision_3.springboot.ch198_spring_aop_pointcuts..*.create(..))")
    public void matchCreate() { System.out.println("  [Pointcut: execution] Matched create method"); }

    @org.aspectj.lang.annotation.Before("within(com.electronik54.revision_3.springboot.ch198_spring_aop_pointcuts..*)")
    public void matchWithin() { /* fires for all methods in package */ }

    @org.aspectj.lang.annotation.Before("args(int)")
    public void matchIntArg(org.aspectj.lang.JoinPoint jp) {
        if (!jp.getSignature().getName().equals("matchIntArg"))
            System.out.println("  [Pointcut: args] Matched method with int param: " + jp.getSignature().getName());
    }
}