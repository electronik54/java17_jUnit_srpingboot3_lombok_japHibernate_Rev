package com.electronik54.revision_3.lombok.ch96_lombok_data.solution;

import lombok.Value;

/**
 * @Value makes the class final and all fields private final.
 * Generates: constructor, getters, equals, hashCode, toString. No setters.
 */
@Value
public class ImmutableConfig {
    String dbUrl;
    int maxThreads;
}