package com.electronik54.revision_3.springboot.ch127_spring_profiles.solution;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Standalone demo of @Profile-driven bean selection.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("=== dev profile ===");
        showActive("dev");

        System.out.println("=== prod profile ===");
        showActive("prod");
    }

    private static void showActive(String profile) {
        ConfigurableEnvironment env = new StandardEnvironment();
        env.setActiveProfiles(profile);

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.setEnvironment(env);
        ctx.register(ProfileConfig.class);
        ctx.refresh();

        DataSourceConfig config = ctx.getBean(DataSourceConfig.class);
        System.out.println("Active data source -> " + config);
        ctx.close();
    }
}