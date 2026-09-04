package com.electronik54.revision_3.corejava.ch53_stream_basics.solution;

import java.util.List;
import java.util.stream.Stream;

/**
 * Solution for Challenge 53: Stream Basics
 *
 * Demonstrates: laziness of intermediate ops, terminal triggering,
 * and single-use semantics.
 */
public class Solution {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        // 1. Pipeline WITHOUT terminal op - nothing executes
        Stream<Integer> lazy = numbers.stream()
                .filter(n -> {
                    System.out.println("filtering " + n);   // does NOT print yet
                    return n > 15;
                })
                .map(n -> {
                    System.out.println("mapping " + n);     // does NOT print yet
                    return n * 10;
                });
        System.out.println("No terminal op: nothing printed above until forEach");

        // 2. Terminal op triggers the pipeline
        System.out.println("Pipeline ran:");
        lazy.forEach(n -> System.out.println("  terminal got " + n));

        // 3. Streams are single-use
        Stream<Integer> once = numbers.stream();
        once.count();
        try {
            once.count();
        } catch (IllegalStateException e) {
            System.out.println("Reusing threw: IllegalStateException: " + e.getMessage());
        }
    }
}