package com.electronik54.revision_3.lombok.ch100_lombok_best_practices.solution;

/**
 * Solution for Challenge 100: Lombok Best Practices
 */
public class Solution {

    public static void main(String[] args) {
        Employee alice = new Employee("Alice", 5000.0);
        System.out.println(alice); // name + baseSalary (bonus excluded from toString)
        System.out.println("Derived bonus: " + alice.bonus());
        System.out.println("totalCompensation: " + alice.totalCompensation());
    }
}