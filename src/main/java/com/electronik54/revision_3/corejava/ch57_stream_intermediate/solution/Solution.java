package com.electronik54.revision_3.corejava.ch57_stream_intermediate.solution;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Solution for Challenge 57: Intermediate Operations
 *
 * Demonstrates: distinct, sorted, limit, skip, peek.
 */
public class Solution {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 2, 6, 4, 5);

        // 1. sorted with Comparator (descending)
        List<Integer> desc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted desc: " + desc);

        // 2. Paging: skip + limit
        List<Integer> page2 = numbers.stream()
                .sorted()
                .skip(2)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("Page 2 (skip 2 limit 2): " + page2);

        // 3. peek: observe elements mid-pipeline
        List<Integer> peeked = numbers.stream()
                .filter(n -> n >= 10)
                .peek(n -> System.out.print("Peeking element: " + n + " / "))
                .map(n -> n * 10)
                .collect(Collectors.toList());
        System.out.println("-> result " + peeked);

        // 4. distinct + sorted on duplicates
        List<Integer> uniqueSorted = List.of(3, 1, 3, 2, 1).stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Distinct sorted: " + uniqueSorted);

        // limit short-circuits infinite streams
        List<Integer> infinite = Stream.generate(() -> 1).limit(3).collect(Collectors.toList());
        System.out.println("Bounded infinite stream: " + infinite);
    }
}