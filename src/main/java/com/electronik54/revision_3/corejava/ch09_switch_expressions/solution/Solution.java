package com.electronik54.revision_3.corejava.ch09_switch_expressions.solution;

/**
 * Solution for Challenge 9: Switch Expressions
 * 
 * This solution demonstrates:
 * - Traditional switch statement
 * - Modern switch expressions (Java 12+)
 * - Arrow syntax (->)
 * - yield keyword for returning values
 * - No fall-through behavior
 */
public class Solution {

    public static void main(String[] args) {
        // Traditional switch
        System.out.println("=== Traditional Switch ===");
        for (int day = 1; day <= 7; day++) {
            printDayTraditional(day);
        }
        
        System.out.println();
        
        // Switch expression
        System.out.println("=== Switch Expression ===");
        for (int day = 1; day <= 7; day++) {
            String result = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid";
            };
            System.out.println("Day " + day + ": " + result);
        }
        
        System.out.println();
        
        // Calculator with yield
        System.out.println("=== Calculator ===");
        System.out.println("5 + 3 = " + calculate(5, 3, '+'));
        System.out.println("10 / 2 = " + calculate(10, 2, '/'));
    }
    
    private static void printDayTraditional(int day) {
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
                System.out.println("Day " + day + ": Invalid");
        }
    }
    
    private static int calculate(int a, int b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    yield 0;  // yield for returning from block
                }
                yield a / b;
            }
            default -> 0;
        };
    }

}