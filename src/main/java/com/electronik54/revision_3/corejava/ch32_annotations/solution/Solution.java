package com.electronik54.revision_3.corejava.ch32_annotations.solution;

/**
 * Solution for Challenge 32: Annotations
 *
 * Demonstrates: defining a runtime-retention annotation and reading it
 * back via reflection - the foundation of frameworks like Spring.
 */
public class Solution {

    public static void main(String[] args) {
        RunWithId annotation = SampleTask.class.getAnnotation(RunWithId.class);
        if (annotation != null) {
            System.out.println("Found @RunWithId on SampleTask: id=" + annotation.id()
                    + ", name=" + annotation.name());
        } else {
            System.out.println("No annotation found");
        }
    }
}