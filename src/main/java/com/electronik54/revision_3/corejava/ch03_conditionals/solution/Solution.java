package com.electronik54.revision_3.corejava.ch03_conditionals.solution;

/**
 * Solution for Challenge 3: Conditionals
 * 
 * This solution demonstrates:
 * - if-else statements
 * - Nested if-else
 * - Ternary operator
 * - Traditional switch statement
 */
public class Solution {

    public static void main(String[] args) {
        // Test numbers
        int[] numbers = {5, -3, 0};
        
        // Number check with if-else
        System.out.println("=== Number Check ===");
        for (int num : numbers) {
            checkNumber(num);
        }
        
        // Day of week with switch
        System.out.println("\n=== Day of Week ===");
        for (int day = 1; day <= 8; day++) {
            printDay(day);
        }
        
        // Ternary operator example
        System.out.println("\n=== Ternary Operator ===");
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age " + age + ": " + status);
    }
    
    private static void checkNumber(int num) {
        // Check positive/negative/zero
        if (num > 0) {
            // Nested if-else for even/odd
            if (num % 2 == 0) {
                System.out.println(num + " is positive and even");
            } else {
                System.out.println(num + " is positive and odd");
            }
        } else if (num < 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is negative and even");
            } else {
                System.out.println(num + " is negative and odd");
            }
        } else {
            System.out.println(num + " is zero");
        }
    }
    
    private static void printDay(int day) {
        // Traditional switch statement
        switch (day) {
            case 1:
                System.out.println("Day " + day + ": Monday");
                break;
            case 2:
                System.out.println("Day " + day + ": Tuesday");
                break;
            case 3:
                System.out.println("Day " + day + ": Wednesday");
                break;
            case 4:
                System.out.println("Day " + day + ": Thursday");
                break;
            case 5:
                System.out.println("Day " + day + ": Friday");
                break;
            case 6:
                System.out.println("Day " + day + ": Saturday");
                break;
            case 7:
                System.out.println("Day " + day + ": Sunday");
                break;
            default:
                System.out.println("Day " + day + ": Invalid day");
        }
    }

}