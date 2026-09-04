package com.electronik54.revision_3.springboot.ch196_spring_aop_basics.solution;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/** Fast, no-Spring-Boot test proving the aspect intercepts the bean. */
class AopBasicsTest {

    @Test
    void adviceFiresAroundServiceMethod() {
        try (AnnotationConfigApplicationContext ctx =
                     new AnnotationConfigApplicationContext(AopConfig.class)) {
            BusinessService service = ctx.getBean(BusinessService.class);
            assertEquals("BusinessService processing order 1", service.processOrder(1));
        }
    }
}