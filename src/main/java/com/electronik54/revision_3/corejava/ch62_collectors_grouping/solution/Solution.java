package com.electronik54.revision_3.corejava.ch62_collectors_grouping.solution;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 62: groupingBy / partitioningBy
 *
 * Demonstrates: grouping with downstream collectors, partitioning,
 * and multi-level grouping.
 */
public class Solution {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "IT", 70000),
                new Employee("Bob", "IT", 50000),
                new Employee("Carol", "HR", 50000));

        // 1. Simple grouping
        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::dept));
        System.out.println("By dept: " + byDept);

        // 2. counting() downstream
        Map<String, Long> counts = employees.stream()
                .collect(Collectors.groupingBy(Employee::dept, Collectors.counting()));
        System.out.println("Count per dept: " + counts);

        // 3. averagingInt downstream
        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::dept,
                        Collectors.averagingInt(Employee::salary)));
        System.out.println("Avg salary per dept: " + avgSalary);

        // 4. partitioningBy (boolean key)
        Map<Boolean, List<Employee>> partition = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.salary() >= 60000));
        System.out.println("Partition by senior: " + partition);

        // 5. Multi-level: dept -> sorted names
        Map<String, java.util.TreeSet<String>> deptNames = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::dept,
                        Collectors.mapping(Employee::name,
                                Collectors.toCollection(java.util.TreeSet::new))));
        System.out.println("Dept -> sorted names: " + deptNames);
    }
}