package com.electronik54.revision_3.corejava.ch40_comparable_comparator.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Solution for Challenge 40: Comparable and Comparator
 *
 * Demonstrates: natural ordering (Comparable), external orders
 * (Comparator), reversed order, and multi-key chaining.
 */
public class Solution {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(3, "Bob", 80000),
                new Employee(1, "Dave", 90000),
                new Employee(2, "Alice", 80000)));

        // 1. Natural order (Comparable)
        List<Employee> byId = new ArrayList<>(employees);
        byId.sort(Comparator.naturalOrder());
        System.out.println("By id:       " + byId);

        // 2. By name (Comparator)
        List<Employee> byName = new ArrayList<>(employees);
        byName.sort(Comparator.comparing(Employee::getName));
        System.out.println("By name:     " + byName);

        // 3. Salary descending, name ascending tiebreak
        List<Employee> bySalary = new ArrayList<>(employees);
        bySalary.sort(Comparator.comparingInt(Employee::getSalary).reversed()
                .thenComparing(Employee::getName));
        System.out.println("By salary desc, then name: " + bySalary);
    }
}