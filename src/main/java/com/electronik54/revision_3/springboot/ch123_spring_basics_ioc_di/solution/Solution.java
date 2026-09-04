package com.electronik54.revision_3.springboot.ch123_spring_basics_ioc_di.solution;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Standalone wiring demo: builds an ApplicationContext, class-scans the
 * current package, and lets the container perform constructor injection.
 */
public class Solution {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx =
                     new AnnotationConfigApplicationContext("com.electronik54.revision_3.springboot.ch123_spring_basics_ioc_di.solution")) {
            GreetingRunner runner = ctx.getBean(GreetingRunner.class);
            runner.run();
        }
    }
}