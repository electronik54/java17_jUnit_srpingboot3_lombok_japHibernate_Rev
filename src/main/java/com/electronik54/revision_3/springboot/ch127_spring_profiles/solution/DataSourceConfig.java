package com.electronik54.revision_3.springboot.ch127_spring_profiles.solution;

/** Plain data class holding a JDBC URL resolved per profile. */
public class DataSourceConfig {
    private final String url;

    public DataSourceConfig(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return url;
    }
}