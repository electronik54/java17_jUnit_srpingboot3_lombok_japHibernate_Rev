package com.electronik54.revision_3.springboot.ch127_spring_profiles.solution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Defines profile-specific DataSourceConfig beans. Only the bean matching
 * the active profile is created.
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DataSourceConfig devDataSource() {
        return new DataSourceConfig("jdbc:h2:mem:testdb");
    }

    @Bean
    @Profile("prod")
    public DataSourceConfig prodDataSource() {
        return new DataSourceConfig("jdbc:mysql://localhost:3306/proddb");
    }
}