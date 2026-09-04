package com.electronik54.revision_3.corejava.ch04_loops.solution;

import java.util.Arrays;
import java.util.List;

/**
 * Solution for Challenge 4: Loops
 * 
 * This solution demonstrates:
 * - for loop (known iterations)
 * - while loop (condition-based)
 * - do-while loop (at least once)
 * - for-each loop (collections/arrays)
 * - break and continue statements
 */
public class Solution {

    public static void main(String[] args) {
        // For loop
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // While loop
        System.out.println("\n=== While Loop ===");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        
        // Do-while loop
        System.out.println("\n=== Do-While Loop ===");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);
        System.out.println();
        
        // For-each loop with List
        System.out.println("\n=== For-Each Loop ===");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // Sum of array
        System.out.println("\n=== Sum of Array ===");
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
        
        // Break and continue
        System.out.println("\n=== Break and Continue ===");
        System.out.print("Break at 5: ");
        for (int k = 1; k <= 10; k++) {
            if (k == 5) break;
            System.out.print(k + " ");
        }
        System.out.println();
        
        System.out.print("Skip evens: ");
        for (int k = 1; k <= 10; k++) {
            if (k % 2 == 0) continue;
            System.out.print(k + " ");
        }
        System.out.println();
    }

}