package com.electronik54.revision_3.corejava.ch51_optional_best_practices;

import java.util.List;
import java.util.Optional;

/**
 * Challenge 51: Optional Best Practices and Anti-Patterns
 *
 * Problem:
 * Refactor common Optional anti-patterns into idiomatic code: never call
 * get() without isPresent(), never return null from an Optional-returning
 * method, avoid Optional fields/parameters, and prefer orElse over
 * isPresent+get chains.
 *
 * Hint:
 * - Optional was designed as a RETURN type only - not for fields or parameters
 * - optional.get() without checking = same NPE risk as no Optional at all
 * - Anti-pattern: if (opt.isPresent()) { return opt.get(); } -> use map/orElse
 *
 * Expected Output:
 * BAD  get() without check threw: NoSuchElementException
 * GOOD orElse fallback: unknown
 * GOOD map/orElse chain: 5
 * Field with Optional: wrong design (use getter returning Optional instead)
 *
 * TODO:
 * 1. Show get() on empty Optional throwing NoSuchElementException
 * 2. Replace isPresent()+get() with orElse and with map().orElse()
 * 3. Demonstrate a getter that returns Optional<String> for a nullable field
 * 4. Note in comments: never Optional field, never Optional method parameter
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 51: Optional Best Practices ===");
        Optional<String> empty = Optional.empty();
        System.out.println("Empty optional to inspect: " + empty);
    }
}