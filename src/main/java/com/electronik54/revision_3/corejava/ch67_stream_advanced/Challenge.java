package com.electronik54.revision_3.corejava.ch67_stream_advanced;

import java.util.List;
import java.util.Optional;

/**
 * Challenge 67: Stream Advanced (flatMap patterns, Optional in streams)
 *
 * Problem:
 * Combine streams with Optionals and nested structures: flatten a map of
 * lists, unwrap Optionals mid-stream, chain findFirst with or() fallbacks,
 * and parse strings safely (empty on bad input).
 *
 * Hint:
 * - Optional.stream() (Java 9+) turns an Optional into 0..1 elements
 * - Optional.or(() -> fallback) (Java 9+) chains alternative lookups
 * - map + filter == same as flatMap(Optional::stream) for unwrapping
 * - flatMap on Map.values() flattens grouped data
 *
 * Expected Output:
 * Flattened map values: [A1, A2, B1]
 * Unwrapped optionals: [one, three]
 * findFirst with or() fallback: Optional[fallback]
 * Parsed numbers: [1, 2] (bad input skipped)
 *
 * TODO:
 * 1. Flatten Map<String, List<String>> into one sorted list
 * 2. Unwrap List<Optional<String>> with flatMap(Optional::stream)
 * 3. findFirst().or(() -> Optional.of("fallback"))
 * 4. Safe parse: map Integer::parseInt wrapped in try/catch returning Optional
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 67: Stream Advanced ===");
        System.out.println("Sample optionals: " + List.of(Optional.of("one"), Optional.empty()));
    }
}