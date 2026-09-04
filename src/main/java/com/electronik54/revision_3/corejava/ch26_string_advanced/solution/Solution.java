package com.electronik54.revision_3.corejava.ch26_string_advanced.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for Challenge 26: String Advanced
 *
 * Demonstrates: manual character-level string processing, two-pointer
 * palindrome check, frequency counting, manual tokenizing.
 */
public class Solution {

    static int countChar(String s, char target) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    static boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        int left = 0, right = lower.length() - 1;
        while (left < right) {
            if (lower.charAt(left++) != lower.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    static Character firstNonRepeating(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return null;
    }

    static List<String> splitWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for (int i = 0; i <= s.length(); i++) {
            char c = i < s.length() ? s.charAt(i) : ' ';
            if (c == ' ' && current.length() > 0) {
                words.add(current.toString());
                current.setLength(0);
            } else if (c != ' ') {
                current.append(c);
            }
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println("countChar(\"programming\", 'g') = " + countChar("programming", 'g'));
        System.out.println("isPalindrome(\"Level\") = " + isPalindrome("Level"));
        System.out.println("firstNonRepeating(\"swiss\") = '" + firstNonRepeating("swiss") + "'");
        System.out.println("words of \"java is fun\" = " + splitWords("java is fun"));
    }
}