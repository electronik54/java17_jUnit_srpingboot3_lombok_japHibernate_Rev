package com.electronik54.revision_3.corejava.ch167_interview_prep.solution;

/**
 * Solution 167: Coding Best Practices
 *
 * Before (bad):
 *   class Calc { int x(int a,int b){return a*b/100;} }
 *
 * After (clean):
 *   class TaxCalculator {
 *     private static final double TAX_RATE = 0.15;
 *     public double calculateTax(double income) {
 *       validatePositive(income, "Income");
 *       return income * TAX_RATE;
 *     }
 *     private void validatePositive(double value, String field) {
 *       if (value < 0) throw new IllegalArgumentException(field + " must be positive");
 *     }
 *   }
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 167: Coding Best Practices ===\n");
        System.out.println("Key Principles:");
        System.out.println("  1. Meaningful names: avoid 'x', 'temp', 'data'");
        System.out.println("  2. Single responsibility: one class = one concern");
        System.out.println("  3. DRY: extract repeated code into methods");
        System.out.println("  4. KISS: simplest solution that works");
        System.out.println("  5. YAGNI: don't add functionality until needed");
        System.out.println("  6. Validate inputs early, fail fast");
        System.out.println("\nExample: TaxCalculator calculates only tax (SRP)");
    }
}