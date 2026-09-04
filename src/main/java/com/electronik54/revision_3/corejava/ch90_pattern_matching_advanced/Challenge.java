package com.electronik54.revision_3.corejava.ch90_pattern_matching_advanced;

/**
 * Challenge 90: Pattern Matching Advanced
 *
 * Problem:
 * Push instanceof pattern matching further: type tests combined with
 * conditions (&&), flow-scope variables staying in scope, chained
 * instanceof with subtypes (order matters!), and why pattern matching
 * beats classic cast-and-check code.
 *
 * Hint:
 * - if (obj instanceof String s && s.length() > 2): s is IN SCOPE in the right operand
 * - Match SUBCLASSES BEFORE superclasses or the broader type wins first
 * - Negated tests: !(obj instanceof String s) means s is NOT in scope after
 *
 * Expected Output:
 * Long string of length 18
 * Integer doubled: 84
 * Subtype matched first: special
 * Number (not Integer): 3.14
 *
 * TODO:
 * 1. instanceof + && condition on the bound variable
 * 2. instanceof Integer then use it; else instanceof Number fallback
 * 3. Order subclasses before superclasses in an if-else chain
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 90: Pattern Matching Advanced ===");
    }
}