package com.electronik54.revision_3.corejava.ch55_stream_filter.solution;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 55: Stream filter
 *
 * Demonstrates: simple filters, chained filters, reusable combined
 * predicates, and distinct.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Simple filter
        List<Integer> evens = List.of(1, 2, 3, 4, 5, 6).stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Evens: " + evens);

        // 2. Two conditions chained
        List<String> aWords = List.of("apple", "ant", "avocado", "banana").stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() > 2)
                .collect(Collectors.toList());
        System.out.println("Starts with 'a' and length>2: " + aWords);

        // 3. Reusable predicates combined
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isSmall = n -> n < 5;
        List<Integer> combined = List.of(1, 2, 3, 4, 5, 6).stream()
                .filter(isEven.and(isSmall))        // same as (n % 2 == 0) && (n < 5)
                .collect(Collectors.toList());
        System.out.println("Combined via predicate and(): " + combined);

        // 4. distinct after filter
        List<Integer> distinctEvens = List.of(2, 2, 3, 4, 4, 6).stream()
                .filter(isEven)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct evens: " + distinctEvens);
    }
}