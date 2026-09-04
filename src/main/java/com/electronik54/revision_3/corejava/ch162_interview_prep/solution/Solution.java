package com.electronik54.revision_3.corejava.ch162_interview_prep.solution;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 162: String Manipulation ===\n");

        System.out.println("Anagram 'listen' vs 'silent': " + isAnagram("listen", "silent"));
        System.out.println("First non-repeating in 'stress': '" + firstNonRepeating("stress") + "'");
        System.out.println("Palindrome 'racecar': " + isPalindrome("racecar"));
        System.out.println("'Hello World Java' reversed: " + reverseWords("Hello World Java"));
        System.out.println("Longest substring 'abcabcbb': " + longestSubstring("abcabcbb"));
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] count = new int[26];
        for (char c : a.toCharArray()) count[c - 'a']++;
        for (char c : b.toCharArray()) if (--count[c - 'a'] < 0) return false;
        return true;
    }

    static char firstNonRepeating(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) map.merge(c, 1, Integer::sum);
        return map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst()
                .map(Map.Entry::getKey).orElse('_');
    }

    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }

    static String reverseWords(String s) {
        var words = s.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (!set.add(s.charAt(right))) set.remove(s.charAt(left++));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}