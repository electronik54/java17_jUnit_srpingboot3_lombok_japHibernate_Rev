package com.electronik54.revision_3.corejava.ch67_stream_advanced.solution;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 67: Stream Advanced
 *
 * Demonstrates: flattening grouped data, Optional integration,
 * or() fallbacks, and safe parsing.
 */
public class Solution {

    static Optional<Integer> safeParse(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        // 1. Flatten Map<String, List<String>>
        Map<String, List<String>> grouped = Map.of(
                "A", List.of("A1", "A2"),
                "B", List.of("B1"));
        List<String> flat = grouped.values().stream()
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Flattened map values: " + flat);

        // 2. Unwrap optionals
        List<Optional<String>> optionals =
                List.of(Optional.of("one"), Optional.empty(), Optional.of("three"));
        List<String> unwrapped = optionals.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        System.out.println("Unwrapped optionals: " + unwrapped);

        // 3. findFirst + or() fallback (Java 9+)
        List<String> empty = List.of();
        Optional<String> withFallback = empty.stream().findFirst()
                .or(() -> Optional.of("fallback"));
        System.out.println("findFirst with or() fallback: " + withFallback);

        // 4. Safe parsing pipeline
        List<Integer> numbers = List.of("1", "x", "2", "y").stream()
                .map(Solution::safeParse)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
        System.out.println("Parsed numbers: " + numbers + " (bad input skipped)");

        // 5. Nested Optional chain
        Optional<String> deepest = Optional.of(Optional.of(Optional.of("inner")))
                .flatMap(o -> o)
                .flatMap(o -> o);
        System.out.println("Nested optional flattened: " + deepest);
    }
}