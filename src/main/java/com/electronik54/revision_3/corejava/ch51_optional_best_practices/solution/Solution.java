package com.electronik54.revision_3.corejava.ch51_optional_best_practices.solution;

import java.util.Optional;

/**
 * Solution for Challenge 51: Optional Best Practices
 *
 * BAD vs GOOD patterns for working with Optional.
 */
public class Solution {

    static class Profile {
        private final String nickname;   // may be null

        Profile(String nickname) {
            this.nickname = nickname;
        }

        // GOOD: getter returns Optional for a nullable field
        Optional<String> getNickname() {
            return Optional.ofNullable(nickname);
        }
    }

    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> five = Optional.of("12345");

        // BAD: get() without isPresent()
        try {
            empty.get();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("BAD  get() without check threw: NoSuchElementException");
        }

        // GOOD: orElse fallback
        System.out.println("GOOD orElse fallback: " + empty.orElse("unknown"));

        // BAD: isPresent + get ladder   -> GOOD: map + orElse
        // if (five.isPresent()) { len = five.get().length(); } else { len = 0; }
        int length = five.map(String::length).orElse(0);
        System.out.println("GOOD map/orElse chain: " + length);

        // GOOD: getter returning Optional for nullable field
        Profile anon = new Profile(null);
        Profile named = new Profile("coderjoe");
        System.out.println("Nickname anon: " + anon.getNickname().orElse("none"));
        System.out.println("Nickname joe: " + named.getNickname().orElse("none"));

        // Anti-patterns to AVOID (comments only):
        // private Optional<String> field;                    // Optional field - wrong design
        // void method(Optional<String> param)                // Optional parameter - wrong design
        // optional.orElse(null);                             // defeats the purpose
        // optional.get().length() without check              // hidden NPE
        System.out.println("Field with Optional: wrong design (use getter returning Optional instead)");
    }
}