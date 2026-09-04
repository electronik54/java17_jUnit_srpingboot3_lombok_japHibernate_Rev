package com.electronik54.revision_3.corejava.ch28_wrapper_classes.solution;

/**
 * Solution for Challenge 28: Wrapper Classes
 *
 * Demonstrates: parsing, valueOf vs parseInt, wrapper constants,
 * comparison helpers, and conversions between primitive/wrapper/String.
 */
public class Solution {

    public static void main(String[] args) {
        int primitive = Integer.parseInt("42");
        System.out.println("parseInt(\"42\") = " + primitive + " (primitive int)");

        Integer object = Integer.valueOf("42");
        System.out.println("valueOf(\"42\") = " + object + " (Integer object)");

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE
                + ", MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Integer.compare(5, 3) = " + Integer.compare(5, 3));
        System.out.println("Integer.max(5, 3) = " + Integer.max(5, 3));

        double d = Double.parseDouble("3.14");
        System.out.println("Double.parseDouble(\"3.14\") = " + d);

        // Wrapper -> primitive -> String round trip
        int back = object;                  // unboxing
        String asText = Integer.toString(back);
        System.out.println("Integer -> int -> String: " + asText);

        // Binary representation
        System.out.println("Integer.toBinaryString(10) = " + Integer.toBinaryString(10));
    }
}