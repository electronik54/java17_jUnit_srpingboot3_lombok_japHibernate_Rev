package com.electronik54.revision_3.springboot.ch124_spring_annotations_core.solution;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Standalone wiring demo for @Service/@Repository/@Configuration/@Bean.
 */
public class Solution {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx =
                     new AnnotationConfigApplicationContext(
                             "com.electronik54.revision_3.springboot.ch124_spring_annotations_core.solution")) {

            CustomerService service = ctx.getBean(CustomerService.class);
            System.out.println("Service using repository: Found customers: " + service.getCustomers());

            ConfigBean configBean = ctx.getBean(ConfigBean.class);
            System.out.println("Bean from @Configuration: " + configBean.describe());
        }
    }
}