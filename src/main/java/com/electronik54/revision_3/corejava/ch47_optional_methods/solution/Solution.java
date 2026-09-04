package com.electronik54.revision_3.corejava.ch47_optional_methods.solution;

import java.util.Optional;

/**
 * Solution for Challenge 47: Optional Methods
 *
 * Demonstrates the orElse vs orElseGet eagerness difference -
 * the #1 Optional interview question.
 */
public class Solution {

    private static boolean orElseEvaluated;

    private static String expensiveDefault() {
        orElseEvaluated = true;
        return "DEFAULT";
    }

    public static void main(String[] args) {
        // ---- PRESENT case ----
        Optional<String> present = Optional.of("Hello");

        orElseEvaluated = false;
        String viaOrElse = present.orElse(expensiveDefault());
        System.out.println("Present: orElse saw expensive call: " + orElseEvaluated + "  <- ALWAYS evaluated!");

        orElseEvaluated = false;
        String viaOrElseGet = present.orElseGet(Solution::expensiveDefault);
        System.out.println("Present: orElseGet did NOT run: " + !orElseEvaluated + "  <- lazy!");
        System.out.println("Present: value=" + viaOrElse + " / " + viaOrElseGet);

        // ---- EMPTY case ----
        Optional<String> empty = Optional.empty();

        System.out.println("Empty: orElse -> " + empty.orElse(expensiveDefault()));
        System.out.println("Empty: orElseGet -> " + empty.orElseGet(Solution::expensiveDefault));

        // orElseThrow with a custom exception supplier
        try {
            empty.orElseThrow(() -> new IllegalStateException("no value!"));
        } catch (IllegalStateException e) {
            System.out.println("Empty: orElseThrow threw: " + e);
        }

        // Side-effect style APIs
        present.ifPresent(v -> System.out.println("ifPresent: present -> " + v));
        empty.ifPresentOrElse(
                v -> System.out.println("ifPresentOrElse: " + v),
                () -> System.out.println("ifPresentOrElse: missing -> fallback executed"));
    }
}