package com.electronik54.revision_3.corejava.ch05_arrays.solution;

import java.util.Arrays;

/**
 * Solution for Challenge 5: Arrays
 * 
 * This solution demonstrates:
 * - Array declaration and initialization
 * - Array traversal
 * - Sorting with Arrays.sort()
 * - Searching with Arrays.binarySearch()
 * - Copying with Arrays.copyOf()
 * - Multi-dimensional arrays
 */
public class Solution {

    public static void main(String[] args) {
        // Array creation
        System.out.println("=== Array Creation ===");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];  // Default values (0)
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));
        
        // Array traversal
        System.out.println("\n=== Array Traversal ===");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        
        // Array sorting
        System.out.println("\n=== Array Sorting ===");
        int[] unsorted = {5, 2, 8, 1, 9};
        System.out.println("Before: " + Arrays.toString(unsorted));
        Arrays.sort(unsorted);
        System.out.println("After: " + Arrays.toString(unsorted));
        
        // Array searching
        System.out.println("\n=== Array Searching ===");
        int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(sorted, 5);
        System.out.println("Index of 5: " + index);
        
        int notFound = Arrays.binarySearch(sorted, 11);
        System.out.println("Index of 11: " + notFound + " (negative = not found)");
        
        // Array copying
        System.out.println("\n=== Array Copying ===");
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
        
        // Copy with different size
        int[] resized = Arrays.copyOf(original, 3);
        System.out.println("Resized (3): " + Arrays.toString(resized));
        
        // 2D array
        System.out.println("\n=== 2D Array ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
        // Jagged array
        System.out.println("\n=== Jagged Array ===");
        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };
        for (int[] row : jagged) {
            System.out.println(Arrays.toString(row));
        }
    }

}