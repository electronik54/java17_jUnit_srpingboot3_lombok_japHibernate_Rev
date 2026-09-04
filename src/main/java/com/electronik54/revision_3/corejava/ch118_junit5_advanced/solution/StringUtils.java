package com.electronik54.revision_3.corejava.ch118_junit5_advanced.solution;

/**
 * Class under test for Challenge 118.
 */
public class StringUtils {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String cleaned = s.replaceAll("\\s", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public String reverse(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Cannot reverse null");
        }
        return new StringBuilder(s).reverse().toString();
    }
}