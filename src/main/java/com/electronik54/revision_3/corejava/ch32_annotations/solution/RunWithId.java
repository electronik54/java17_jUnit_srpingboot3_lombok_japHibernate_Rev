package com.electronik54.revision_3.corejava.ch32_annotations.solution;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Custom annotation readable at RUNTIME via reflection.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RunWithId {
    int id();
    String name() default "unknown";
}