package com.electronik54.revision_3.corejava.ch47_optional_methods;

import java.util.Optional;

/**
 * Challenge 47: Optional Methods (orElse vs orElseGet vs orElseThrow)
 *
 * Problem:
 * Compare orElse, orElseGet and orElseThrow on both a present and an
 * empty Optional, and use ifPresent / ifPresentOrElse for side effects.
 * KEY INTERVIEW QUESTION: which of orElse/orElseGet evaluates eagerly?
 *
 * Hint:
 * - orElse(computeDefault()): the argument is ALWAYS evaluated, even when present
 * - orElseGet(supplier): the supplier runs ONLY when empty (lazy)
 * - orElseThrow(supplier): throws a custom exception when empty
 *
 * Expected Output:
 * Present case:  value=Hello  orElse saw expensive call: true
 * Present case:  orElseGet did NOT run
 * Empty case:    value=DEFAULT
 * Empty case:    orElseThrow threw: IllegalStateException: no value!
 * ifPresentOrElse: present -> Hello / missing -> fallback executed
 *
 * TODO:
 * 1. Track evaluation with a boolean flag set in an "expensive" default method
 * 2. On a PRESENT optional, call orElse(expensive()) and orElseGet(expensive supplier); print flags
 * 3. On an EMPTY optional, get the value via orElse and via orElseGet
 * 4. Use orElseThrow to fail with IllegalStateException
 * 5. Use ifPresent and ifPresentOrElse
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 47: Optional Methods ===");
        Optional<String> sample = Optional.of("Hello");
        System.out.println("Sample present: " + sample.isPresent());
    }
}