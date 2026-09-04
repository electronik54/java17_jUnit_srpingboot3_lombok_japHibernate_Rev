package com.electronik54.revision_3.corejava.ch168_interview_prep.solution;

/**
 * Solution 168: Code Review Techniques
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 168: Code Review Techniques ===\n");
        System.out.println("What to check in a code review:");
        System.out.println("  1. Functionality - Does it meet requirements?");
        System.out.println("  2. Security - SQL injection, XSS, auth checks");
        System.out.println("  3. Performance - N+1 queries, memory leaks");
        System.out.println("  4. Thread safety - Shared mutable state, locks");
        System.out.println("  5. Error handling - Exceptions, null checks");
        System.out.println("  6. Testing - Edge cases, coverage");
        System.out.println("\nCommon code smells:");
        System.out.println("  - Long methods (>30 lines)");
        System.out.println("  - Deep nesting (>3 levels)");
        System.out.println("  - Magic numbers/strings without constants");
        System.out.println("  - Unused imports and dead code");
        System.out.println("\nGiving feedback:");
        System.out.println("  - Be specific: 'Line 42: Null check missing'");
        System.out.println("  - Be constructive: 'Consider using Optional'");
        System.out.println("  - Focus on code, not the developer");
    }
}