package com.electronik54.revision_3.corejava.ch50_optional_with_streams.solution;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Solution for Challenge 50: Optional with Streams
 *
 * Demonstrates: unwrapping Stream<Optional<T>>, findFirst/findAny,
 * and reduce returning an Optional.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Unwrap List<Optional<String>> -> List<String>
        List<Optional<String>> mixed = List.of(
                Optional.of("apple"), Optional.empty(), Optional.of("cherry"));
        List<String> unwrapped = mixed.stream()
                .flatMap(Optional::stream)          // Java 9+: filter + unwrap in one step
                .collect(Collectors.toList());
        System.out.println("Unwrapped: " + unwrapped);

        // 2. findFirst / findAny return Optionals
        List<Integer> numbers = List.of(10, 20, 30, 40);
        Optional<Integer> firstOver25 = numbers.stream().filter(n -> n > 25).findFirst();
        Optional<Integer> firstOver99 = numbers.stream().filter(n -> n > 99).findFirst();
        System.out.println("findFirst with match: " + firstOver25);
        System.out.println("findFirst no match: " + firstOver99);
        System.out.println("findAny parallel: " + numbers.parallelStream().findAny());

        // 3. reduce without identity -> Optional (empty stream would give Optional.empty)
        Optional<Integer> total = Stream.of(10, 20, 30).reduce(Integer::sum);
        System.out.println("reduce without identity: " + total);
    }
}