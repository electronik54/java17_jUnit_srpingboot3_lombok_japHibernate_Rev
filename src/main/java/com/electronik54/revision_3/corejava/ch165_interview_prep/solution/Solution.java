package com.electronik54.revision_3.corejava.ch165_interview_prep.solution;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 165: Dynamic Programming ===\n");
        System.out.println("Fibonacci(10) = " + fib(10));
        System.out.println("Stairs(5) = " + climbStairs(5) + " ways");
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max subarray: " + maxSubArray(arr));
        System.out.println("LCS('abcde', 'ace') = " + lcs("abcde", "ace") + " ('ace')");
        System.out.println("Min coins for 11 using [1,2,5] = " + coinChange(new int[]{1, 2, 5}, 11));
    }

    static int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }

    static int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }

    static int maxSubArray(int[] arr) {
        int max = arr[0], curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(max, curr);
        }
        return max;
    }

    static int lcs(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                dp[i][j] = a.charAt(i - 1) == b.charAt(j - 1) ? 1 + dp[i - 1][j - 1] : Math.max(dp[i - 1][j], dp[i][j - 1]);
        return dp[m][n];
    }

    static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++)
            for (int c : coins)
                if (c <= i) dp[i] = Math.min(dp[i], 1 + dp[i - c]);
        return dp[amount] > amount ? -1 : dp[amount];
    }
}