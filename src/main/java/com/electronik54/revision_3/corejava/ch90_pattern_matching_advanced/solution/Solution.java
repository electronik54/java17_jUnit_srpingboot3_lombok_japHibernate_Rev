package com.electronik54.revision_3.corejava.ch90_pattern_matching_advanced.solution;

import java.util.ArrayList;

/**
 * Solution for Challenge 90: Pattern Matching Advanced
 *
 * Demonstrates: flow scoping, conditional patterns, subtype ordering.
 * (Uses ArrayList as the concrete type since String cannot be extended.)
 */
public class Solution {

    static String describe(Object obj) {
        // instanceof + && : the bound variable is in scope in the RIGHT operand
        if (obj instanceof String s && s.length() > 5) {
            return "Long string of length " + s.length();
        }
        if (obj instanceof String s) {
            return "Short string: " + s;
        }
        // Order matters: Integer (subtype) BEFORE Number (superclass)
        if (obj instanceof Integer i) {
            return "Integer doubled: " + (i * 2);
        }
        if (obj instanceof Number n) {
            return "Number (not Integer): " + n;
        }
        return "unknown";
    }

    public static void main(String[] args) {
        System.out.println(describe("a very long string!"));
        System.out.println(describe("hi"));
        System.out.println(describe(42));
        System.out.println(describe(3.14));
        System.out.println(describe(new ArrayList<String>()));

        // Flow scope: s usable in both the condition and the block
        Object o = "scoped";
        if (o instanceof String s && !s.isEmpty() && s.length() < 10) {
            System.out.println("Flow-scoped variable in all conditions: " + s);
        }

        // Negation: after !(o instanceof String s), s is NOT in scope
        Object other = 7;
        if (!(other instanceof String s)) {
            // s cannot be used here - it did not match
            System.out.println("Negated test: not a string, value " + other);
        } else {
            System.out.println("s IS available here: " + s);
        }
    }
}