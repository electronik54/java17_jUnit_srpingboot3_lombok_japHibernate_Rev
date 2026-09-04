package com.electronik54.revision_3.springboot.ch126_spring_annotations_advanced.solution;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Standalone demo of @Primary vs @Qualifier resolution.
 */
public class Solution {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx =
                     new AnnotationConfigApplicationContext(
                             "com.electronik54.revision_3.springboot.ch126_spring_annotations_advanced.solution")) {
            MessageClient client = ctx.getBean(MessageClient.class);
            System.out.println(client.primary());
            System.out.println(client.sms());
        }
    }
}