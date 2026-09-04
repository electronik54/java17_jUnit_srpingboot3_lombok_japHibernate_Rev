package com.electronik54.revision_3.corejava.ch89_switch_advanced;

/**
 * Challenge 89: Switch Expressions Advanced
 *
 * Problem:
 * Go beyond basic switch expressions: multi-label cases, case with
 * 'when' guards (Java 21 preview - simulate with if), yield for block
 * bodies, switch on Strings and enums, and exhaustive expression switches.
 *
 * Hint:
 * - Multiple labels: case 1, 2, 3 -> ...
 * - yield is return-for-switch inside a block: case X -> { ... yield value; }
 * - An expression switch MUST be exhaustive (or the compiler errors)
 * - Switch on String compares with equals() semantics
 *
 * Expected Output:
 * Multi-label: weekend
 * yield from block: large
 * String switch: two
 * Exhaustive enum switch: starts
 *
 * TODO:
 * 1. Multi-label case for Saturday/Sunday -> "weekend"
 * 2. Block body with yield for ranges (> 10 = large, > 5 = medium, else small)
 * 3. Switch over a String returning the word count
 * 4. Exhaustive switch over an enum with no default
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 89: Switch Advanced ===");
    }
}