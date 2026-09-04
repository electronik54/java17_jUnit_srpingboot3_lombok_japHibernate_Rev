package com.electronik54.revision_3.corejava.ch32_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Challenge 32: Annotations
 *
 * Problem:
 * Create a custom annotation @RunWithId (runtime retention) with an int id
 * and a String name with default value "unknown". Apply it to a class and
 * read it back via reflection.
 *
 * Hint:
 * - Meta-annotations configure annotations: @Retention, @Target, @Inherited
 * - RetentionPolicy.RUNTIME keeps the annotation readable at runtime via reflection
 * - Built-ins: @Override, @Deprecated, @SuppressWarnings, @FunctionalInterface
 *
 * Expected Output:
 * Found @RunWithId on SampleTask: id=42, name=sample
 *
 * TODO:
 * 1. Define @RunWithId with @Retention(RUNTIME) and @Target(TYPE)
 * 2. Elements: int id(); String name() default "unknown";
 * 3. Annotate a SampleTask class with @RunWithId(id = 42, name = "sample")
 * 4. In main, read the annotation via SampleTask.class.getAnnotation(...)
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {

    // Custom annotation lives here so the user can see it while solving
    @Retention(RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
    @interface RunWithId {
        int id();
        String name() default "unknown";
    }

    public static void main(String[] args) {
        System.out.println("=== Challenge 32: Annotations ===");
    }
}