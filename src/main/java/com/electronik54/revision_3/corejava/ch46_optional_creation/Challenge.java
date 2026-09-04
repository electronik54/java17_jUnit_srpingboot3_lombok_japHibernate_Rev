package com.electronik54.revision_3.corejava.ch46_optional_creation;

/**
 * Challenge 46: Optional Creation
 *
 * Problem:
 * Create Optionals all three ways - of(), ofNullable(), empty() - and
 * observe what happens when of() receives null. Use isPresent() and
 * isEmpty() to inspect them.
 *
 * Hint:
 * - Optional.of(null) throws NullPointerException IMMEDIATELY (fail fast)
 * - Optional.ofNullable(null) returns Optional.empty() instead
 * - Optional is a container: it forces you to THINK about the missing case
 *
 * Expected Output:
 * of: present -> Hello
 * ofNullable(value): present -> Hello
 * ofNullable(null): empty=true
 * empty(): empty=true
 * of(null) threw: NullPointerException
 *
 * TODO:
 * 1. Create Optional.of("Hello") and print value if present
 * 2. Create Optional.ofNullable("Hello") and Optional.ofNullable(null)
 * 3. Create Optional.empty()
 * 4. Wrap Optional.of(null) in try-catch and print the exception type
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 46: Optional Creation ===");
    }
}