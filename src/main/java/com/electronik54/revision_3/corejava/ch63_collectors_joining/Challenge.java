package com.electronik54.revision_3.corejava.ch63_collectors_joining;

import java.util.List;

/**
 * Challenge 63: Collectors - joining, summarizing, averaging
 *
 * Problem:
 * Join strings with delimiters/prefix/suffix, compute statistics with
 * summarizingInt (count/sum/min/avg/max), and use averagingInt,
 * summingInt and counting collectors.
 *
 * Hint:
 * - joining(", ", "[", "]") builds "[a, b, c]" in one pass
 * - IntSummaryStatistics is a one-shot stats object from summarizingInt
 * - averagingInt returns double; summingInt returns Integer
 *
 * Expected Output:
 * Joined: [apple, banana, cherry]
 * CSV row: apple,banana,cherry
 * Stats: IntSummaryStatistics{count=3, sum=24, min=6, average=8.0, max=10}
 * Avg: 8.0  Sum: 24  Count: 3
 *
 * TODO:
 * 1. Join words with ", " wrapped in brackets
 * 2. Join without spaces (CSV style)
 * 3. summarizingInt on string lengths - print count/sum/min/avg/max
 * 4. Separate averagingInt, summingInt, counting
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 63: Collectors joining/summarizing ===");
        System.out.println("Source: " + List.of("apple", "banana", "cherry"));
    }
}