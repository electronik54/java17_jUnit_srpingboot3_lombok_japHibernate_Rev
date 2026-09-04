package com.electronik54.revision_3.corejava.ch49_optional_filter.solution;

import java.util.Optional;

/**
 * Solution for Challenge 49: Optional filter
 *
 * Demonstrates: conditional containment, filter+map pipelines,
 * and empty-propagation.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. String length filter
        Optional<String> passes = Optional.of("Hello").filter(s -> s.length() > 3);
        Optional<String> fails = Optional.of("Hi").filter(s -> s.length() > 3);
        System.out.println("filter(\"Hello\", len>3): " + passes);
        System.out.println("filter(\"Hi\", len>3): " + fails);

        // 2. filter + map chain: keep evens, double them
        Optional<Integer> even = Optional.of(4).filter(n -> n % 2 == 0);
        System.out.println("filter(4, even): " + even + " -> mapped: " + even.map(n -> n * 2));
        Optional<Integer> odd = Optional.of(3).filter(n -> n % 2 == 0);
        System.out.println("filter(3, even): " + odd);

        // 3. filter on empty is a no-op
        Optional<Integer> empty = Optional.<Integer>empty().filter(n -> n % 2 == 0);
        System.out.println("filter on empty is a no-op: " + empty);

        // Bonus: replacing imperative null-check ladders
        String password = "secret123";
        Optional<String> validated = Optional.ofNullable(password)
                .filter(p -> p.length() >= 8)
                .map(p -> p + " (valid)");
        System.out.println("Validation pipeline: " + validated);
    }
}