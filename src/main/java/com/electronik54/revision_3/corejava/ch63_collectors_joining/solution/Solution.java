package com.electronik54.revision_3.corejava.ch63_collectors_joining.solution;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 63: joining, summarizing, averaging
 *
 * Demonstrates: joining, summary statistics, and numeric collectors.
 */
public class Solution {

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry");

        // 1. joining with delimiter, prefix, suffix
        String joined = words.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Joined: " + joined);

        // 2. CSV style
        String csv = words.stream().collect(Collectors.joining(","));
        System.out.println("CSV row: " + csv);

        // 3. Summary statistics on lengths
        IntSummaryStatistics stats = words.stream()
                .collect(Collectors.summarizingInt(String::length));
        System.out.println("Stats: " + stats);
        System.out.println("Min: " + stats.getMin() + ", Max: " + stats.getMax());

        // 4. Individual collectors
        double avg = words.stream().collect(Collectors.averagingInt(String::length));
        Integer sum = words.stream().collect(Collectors.summingInt(String::length));
        Long count = words.stream().collect(Collectors.counting());
        System.out.printf("Avg: %.1f  Sum: %d  Count: %d%n", avg, sum, count);
    }
}