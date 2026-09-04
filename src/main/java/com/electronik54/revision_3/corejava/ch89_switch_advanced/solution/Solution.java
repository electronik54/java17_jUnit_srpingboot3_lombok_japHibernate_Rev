package com.electronik54.revision_3.corejava.ch89_switch_advanced.solution;

/**
 * Solution for Challenge 89: Switch Advanced
 *
 * Demonstrates: multi-label cases, yield, string switch, exhaustive enum switch.
 */
public class Solution {

    enum State { STARTED, RUNNING, STOPPED }

    static String dayType(int day) {
        return switch (day) {
            case 1, 2, 3, 4, 5 -> "weekday";
            case 6, 7 -> "weekend";
            default -> "invalid";
        };
    }

    static String sizeOf(int n) {
        return switch (Integer.signum(n)) {
            case 0 -> "zero";
            default -> {
                if (n > 10) {
                    yield "large";
                } else if (n > 5) {
                    yield "medium";
                } else {
                    yield "small";
                }
            }
        };
    }

    static String wordCount(String phrase) {
        return switch (phrase) {
            case "hello" -> "one";
            case "hello world" -> "two";
            default -> "many";
        };
    }

    static String describe(State state) {
        // Exhaustive: no default needed - all enum constants covered
        return switch (state) {
            case STARTED -> "starts";
            case RUNNING -> "runs";
            case STOPPED -> "stops";
        };
    }

    public static void main(String[] args) {
        System.out.println("Multi-label: " + dayType(6));
        System.out.println("yield from block: " + sizeOf(42));
        System.out.println("String switch: " + wordCount("hello world"));
        System.out.println("Exhaustive enum switch: " + describe(State.STARTED));
    }
}