package com.electronik54.revision_3.corejava.ch29_autoboxing;

/**
 * Challenge 29: Autoboxing and Unboxing
 *
 * Problem:
 * Demonstrate automatic conversion between primitives and wrappers, the
 * Integer cache (-128 to 127), and the classic == vs equals pitfall.
 *
 * Hint:
 * - Autoboxing: primitive -> wrapper (Integer i = 5;)
 * - Unboxing: wrapper -> primitive (int x = i;)
 * - Small Integers (-128..127) are cached: boxed values may be == equal
 * - ALWAYS use .equals() for wrapper comparison; null unboxing throws NullPointerException
 *
 * Expected Output:
 * boxed == boxed (127): true   <- Integer cache
 * boxed == boxed (128): false  <- different objects!
 * boxed.equals(boxed) (128): true
 * Sum via unboxing: 60
 * null unboxing threw: NullPointerException
 *
 * TODO:
 * 1. Box two Integers with value 127 and compare with ==
 * 2. Box two Integers with value 128 and compare with == (observe false)
 * 3. Compare the 128 pair with equals()
 * 4. Sum a List<Integer> into a primitive int (unboxing in action)
 * 5. Show that unboxing a null Integer throws NullPointerException
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 29: Autoboxing and Unboxing ===");
    }
}