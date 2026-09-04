package com.electronik54.revision_3.corejava.ch26_string_advanced;

/**
 * Challenge 26: String Advanced
 *
 * Problem:
 * Implement common interview string operations WITHOUT library helpers:
 * count occurrences of a character, check palindrome, find the first
 * non-repeating character, and split a sentence into words manually.
 *
 * Hint:
 * - String is immutable: every "modification" creates a new object
 * - charAt(i) is O(1); prefer it over toCharArray() when avoiding allocation
 * - A palindrome reads the same forwards and backwards (ignore case)
 *
 * Expected Output:
 * countChar("programming", 'g') = 2
 * isPalindrome("Level") = true
 * firstNonRepeating("swiss") = 'w'
 * words of "java is fun" = [java, is, fun]
 *
 * TODO:
 * 1. countChar(String, char) - loop with charAt and count matches
 * 2. isPalindrome(String) - two-pointer compare ignoring case
 * 3. firstNonRepeating(String) - nested pass or count array (256)
 * 4. splitWords(String) - collect substrings between spaces into a list
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 26: String Advanced ===");
    }
}