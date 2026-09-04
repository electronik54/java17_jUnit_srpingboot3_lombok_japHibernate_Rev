package com.electronik54.revision_3.corejava.ch52_optional_realworld;

import java.util.Map;

/**
 * Challenge 52: Optional in Real-World Scenarios
 *
 * Problem:
 * Model realistic lookups that may find nothing: user lookup by id in a
 * Map/repository, config value parsing to int, finding the cheapest item,
 * and combining multiple Optional lookups into one result.
 *
 * Hint:
 * - Map.get returns null - wrap lookups with Optional.ofNullable(map.get(key))
 * - Optional.map converts types mid-chain: String -> Integer for config parsing
 * - Optional.or(() -> otherLookup) (Java 9+) tries a fallback lookup lazily
 *
 * Expected Output:
 * User found: Alice / Not found fallback: Guest
 * Config timeout (default 30): 45
 * Config missing (default 30): 30
 * Cheapest item: pen (1.99)
 * Combined: OK for 2
 *
 * TODO:
 * 1. userRepository: Map<Long,String>; findById returns Optional with fallback to "Guest"
 * 2. config: Map<String,String>; read "timeout" as int with default 30 (map + orElse)
 * 3. Find the cheapest item in a list of (name, price) via stream min
 * 4. Combine: find user AND config to build a summary, else a default message
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 52: Optional Real-World ===");
        Map<Long, String> users = Map.of(1L, "Alice");
        System.out.println("Repository contains: " + users);
    }
}