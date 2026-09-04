package com.electronik54.revision_3.corejava.ch64_primitive_streams.solution;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Solution for Challenge 64: Primitive Streams
 *
 * Demonstrates: ranges, numeric reductions without boxing, and
 * conversions to/from object streams.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Ranges
        List<Integer> range = IntStream.range(0, 5).boxed().collect(Collectors.toList());
        System.out.println("Range 0..4: " + range);
        System.out.println("rangeClosed(1,5): " + IntStream.rangeClosed(1, 5).sum());

        // 2. Sum without boxing
        System.out.println("Sum 1..100: " + IntStream.rangeClosed(1, 100).sum());

        // 3. Average -> OptionalDouble
        System.out.println("Average 1..10: " + IntStream.rangeClosed(1, 10).average().getAsDouble());

        // 4. mapToObj and boxed
        List<Integer> squares = IntStream.rangeClosed(1, 3)
                .mapToObj(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        int boxedSum = IntStream.rangeClosed(1, 3).boxed().reduce(0, Integer::sum);
        System.out.println("Boxed sum via Stream: " + boxedSum);

        // Summary statistics
        IntSummaryStatistics stats = IntStream.rangeClosed(1, 100).summaryStatistics();
        System.out.println("Stats: count=" + stats.getCount() + ", max=" + stats.getMax());

        // map vs mapToInt round trip
        List<String> words = List.of("a", "bb", "ccc");
        int totalLen = words.stream().mapToInt(String::length).sum();
        System.out.println("Total length via mapToInt: " + totalLen);
    }
}