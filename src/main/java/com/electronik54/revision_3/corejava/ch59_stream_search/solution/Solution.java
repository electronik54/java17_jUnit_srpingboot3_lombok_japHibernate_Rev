package com.electronik54.revision_3.corejava.ch59_stream_search.solution;

import java.util.List;
import java.util.Optional;

/**
 * Solution for Challenge 59: Stream Search
 *
 * Demonstrates: short-circuit searches and the empty-stream gotcha.
 */
public class Solution {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // 1. Match checks (short-circuit evaluation)
        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("anyMatch even: " + anyEven
                + "  allMatch positive: " + allPositive
                + "  noneMatch negative: " + noneNegative);

        // 2. findFirst over filtered elements
        Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        System.out.println("findFirst even: " + firstEven);

        // 3. findAny - any matching element, useful in parallel
        Optional<Integer> any = numbers.parallelStream().filter(n -> n % 2 == 0).findAny();
        System.out.println("findAny: " + any);

        // 4. Empty stream gotcha: allMatch is TRUE on empty (vacuous truth)
        System.out.println("allMatch on empty: " + List.<Integer>of().stream().allMatch(n -> n > 0));
        System.out.println("anyMatch on empty: " + List.<Integer>of().stream().anyMatch(n -> n > 0));
    }
}