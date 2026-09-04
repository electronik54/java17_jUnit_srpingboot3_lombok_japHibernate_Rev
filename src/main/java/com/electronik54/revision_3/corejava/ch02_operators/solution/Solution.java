package com.electronik54.revision_3.corejava.ch02_operators.solution;

/**
 * Solution for Challenge 2: Operators
 * 
 * This solution demonstrates:
 * - Arithmetic operators: +, -, *, /, %
 * - Relational operators: ==, !=, <, >, <=, >=
 * - Logical operators: &&, ||, !
 * - Bitwise operators: &, |, ^, ~, <<, >>, >>>
 */
public class Solution {

    public static void main(String[] args) {
        int a = 10, b = 3;
        
        // Arithmetic operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);  // Integer division
        System.out.printf("%d %% %d = %d%n", a, b, a % b);
        
        // Relational operators
        System.out.println("\n=== Relational Operators ===");
        System.out.printf("%d > %d = %b%n", a, b, a > b);
        System.out.printf("%d < %d = %b%n", a, b, a < b);
        System.out.printf("%d == %d = %b%n", a, b, a == b);
        System.out.printf("%d != %d = %b%n", a, b, a != b);
        
        // Logical operators
        System.out.println("\n=== Logical Operators ===");
        boolean x = true, y = false;
        System.out.printf("%b && %b = %b%n", x, y, x && y);
        System.out.printf("%b || %b = %b%n", x, y, x || y);
        System.out.printf("!%b = %b%n", x, !x);
        
        // Bitwise operators
        System.out.println("\n=== Bitwise Operators ===");
        int m = 5, n = 3;  // 5 = 0101, 3 = 0011
        System.out.printf("%d & %d = %d%n", m, n, m & n);   // 0001 = 1
        System.out.printf("%d | %d = %d%n", m, n, m | n);   // 0111 = 7
        System.out.printf("%d ^ %d = %d%n", m, n, m ^ n);   // 0110 = 6
        System.out.printf("~%d = %d%n", m, ~m);             // 1010 = -6 (two's complement)
        System.out.printf("%d << 1 = %d%n", m, m << 1);     // 1010 = 10
        System.out.printf("%d >> 1 = %d%n", m, m >> 1);     // 0010 = 2
    }

}