package com.electronik54.revision_3.corejava.ch52_optional_realworld.solution;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Solution for Challenge 52: Optional Real-World
 *
 * Demonstrates: repository lookups, config parsing, stream min,
 * and combining multiple lookups.
 */
public class Solution {

    static final Map<Long, String> USER_REPOSITORY = Map.of(1L, "Alice", 2L, "Bob");
    static final Map<String, String> CONFIG = Map.of("timeout", "45", "retries", "3");

    static Optional<String> findById(long id) {
        return Optional.ofNullable(USER_REPOSITORY.get(id));
    }

    static Optional<Integer> readIntConfig(String key) {
        return Optional.ofNullable(CONFIG.get(key)).map(Integer::parseInt);
    }

    record Item(String name, double price) {
    }

    public static void main(String[] args) {
        // 1. Repository lookup with fallback
        System.out.println("User found: " + findById(1L).orElse("Guest"));
        System.out.println("Not found fallback: " + findById(99L).orElse("Guest"));

        // 2. Config parsing: String -> Integer mid-chain, default on any failure
        System.out.println("Config timeout (default 30): " + readIntConfig("timeout").orElse(30));
        System.out.println("Config missing (default 30): " + readIntConfig("missing").orElse(30));

        // 3. Cheapest item via stream min
        List<Item> items = List.of(new Item("laptop", 999.0), new Item("pen", 1.99), new Item("book", 12.5));
        Optional<Item> cheapest = items.stream()
                .min((a, b) -> Double.compare(a.price(), b.price()));
        cheapest.ifPresent(i -> System.out.println("Cheapest item: " + i.name() + " (" + i.price() + ")"));

        // 4. Combine two lookups
        String summary = findById(2L)
                .flatMap(user -> readIntConfig("retries").map(retries -> "OK for " + user + " with " + retries + " retries"))
                .orElse("Summary unavailable");
        System.out.println("Combined: " + summary);
    }
}