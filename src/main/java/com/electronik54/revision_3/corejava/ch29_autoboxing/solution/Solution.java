package com.electronik54.revision_3.corejava.ch29_autoboxing.solution;

import java.util.List;

/**
 * Solution for Challenge 29: Autoboxing and Unboxing
 *
 * Demonstrates: autoboxing, unboxing, the Integer cache (-128..127),
 * == vs equals pitfalls, and NullPointerException on null unboxing.
 */
public class Solution {

    public static void main(String[] args) {
        // Integer cache: values -128..127 are shared objects
        Integer a127 = 127, b127 = 127;
        System.out.println("boxed == boxed (127): " + (a127 == b127) + "   <- Integer cache");

        Integer a128 = 128, b128 = 128;
        System.out.println("boxed == boxed (128): " + (a128 == b128) + "  <- different objects!");
        System.out.println("boxed.equals(boxed) (128): " + a128.equals(b128));

        // Unboxing: wrapper -> primitive arithmetic
        List<Integer> numbers = List.of(10, 20, 30);   // autoboxed on insert
        int sum = 0;
        for (Integer n : numbers) {                    // n is unboxed here
            sum += n;
        }
        System.out.println("Sum via unboxing: " + sum);

        // Null unboxing pitfall
        Integer maybeNull = null;
        try {
            int x = maybeNull;                          // NPE here
            System.out.println("no exception: " + x);
        } catch (NullPointerException e) {
            System.out.println("null unboxing threw: NullPointerException");
        }
    }
}