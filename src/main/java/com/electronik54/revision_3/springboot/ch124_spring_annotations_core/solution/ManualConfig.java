package com.electronik54.revision_3.springboot.ch124_spring_annotations_core.solution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** @Configuration + @Bean — programmatic bean definition (no scanning). */
@Configuration
public class ManualConfig {

    @Bean
    public ConfigBean configBean() {
        return new ConfigBean();
    }
}