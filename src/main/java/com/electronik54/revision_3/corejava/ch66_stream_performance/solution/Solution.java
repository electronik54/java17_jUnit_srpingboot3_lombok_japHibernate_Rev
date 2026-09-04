package com.electronik54.revision_3.corejava.ch66_stream_performance.solution;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Solution for Challenge 66: Stream Performance
 *
 * Demonstrates: lazy evaluation, short-circuiting, and operation ordering.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. findFirst stops the expensive pipeline early
        AtomicInteger invocations = new AtomicInteger();
        int first = java.util.stream.IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .map(n -> {
                    invocations.incrementAndGet();     // "expensive" work
                    return n * 10;
                })
                .findFirst()
                .orElse(-1);
        System.out.println("findFirst result: " + first
                + " - expensive op executed only " + invocations.get() + " time(s) before stopping");

        // 2. Order matters: filter BEFORE map processes fewer elements
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        AtomicInteger mapCount1 = new AtomicInteger();
        AtomicInteger mapCount2 = new AtomicInteger();

        long bad = numbers.stream()
                .map(n -> { mapCount1.incrementAndGet(); return n * 2; })
                .filter(n -> n > 5)
                .count();

        long good = numbers.stream()
                .filter(n -> n > 2)
                .map(n -> { mapCount2.incrementAndGet(); return n * 2; })
                .filter(n -> n > 5)
                .count();

        System.out.println("map-then-filter processed " + mapCount1.get()
                + " elements; filter-then-map processed " + mapCount2.get()
                + " (results: " + bad + "/" + good + ")");

        // 3. anyMatch short-circuits
        AtomicInteger checked = new AtomicInteger();
        boolean hasBig = numbers.stream()
                .peek(n -> checked.incrementAndGet())
                .anyMatch(n -> n == 3);
        System.out.println("anyMatch=" + hasBig + " stopped at element: " + checked.get());
    }
}