package com.electronik54.revision_3.corejava.ch161_interview_prep.solution;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 161: Array Manipulation ===\n");

        int[] arr1 = {1, 2, 4, 5, 6};
        int n = 6;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr1).sum();
        System.out.println("Missing number: " + (expectedSum - actualSum));

        int[] arr2 = {1, 2, 3, 2, 4, 3};
        Set<Integer> seen = new HashSet<>(), dups = new HashSet<>();
        for (int x : arr2) if (!seen.add(x)) dups.add(x);
        System.out.println("Duplicates: " + dups);

        int[] arr3 = {1, 2, 3, 4, 5};
        int k = 2;
        rotate(arr3, k);
        System.out.println("Rotate by " + k + ": " + Arrays.toString(arr3));

        int[] arr4 = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr4.length; i++) {
            int complement = target - arr4[i];
            if (map.containsKey(complement)) {
                System.out.println("Two sum: [" + map.get(complement) + ", " + i + "]");
                break;
            }
            map.put(arr4[i], i);
        }

        int[] arr5 = {0, 1, 0, 3, 12};
        moveZeros(arr5);
        System.out.println("Move zeros: " + Arrays.toString(arr5));
    }

    static void rotate(int[] arr, int k) {
        k %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    static void reverse(int[] arr, int l, int r) {
        while (l < r) { int t = arr[l]; arr[l] = arr[r]; arr[r] = t; l++; r--; }
    }

    static void moveZeros(int[] arr) {
        int pos = 0;
        for (int x : arr) if (x != 0) arr[pos++] = x;
        while (pos < arr.length) arr[pos++] = 0;
    }
}