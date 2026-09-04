package com.electronik54.revision_3.corejava.ch68_stream_realworld.solution;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 68: Stream Real-World
 *
 * The classic employee-processing interview suite.
 */
public class Solution {

    static final List<Employee> EMPLOYEES = List.of(
            new Employee("Alice", "IT", 90000, 30),
            new Employee("Bob", "IT", 80000, 25),
            new Employee("Carol", "HR", 50000, 40),
            new Employee("Dave", "IT", 80000, 35),
            new Employee("Emma", "IT", 60000, 22),
            new Employee("Frank", "HR", 50000, 23));

    public static void main(String[] args) {
        // 1. Highest paid
        Optional<Employee> top = EMPLOYEES.stream()
                .max(Comparator.comparingInt(Employee::salary));
        top.ifPresent(e -> System.out.println("Highest paid: " + e.name()
                + " (" + e.dept() + ", " + e.salary() + ")"));

        // 2. Second-highest DISTINCT salary
        Optional<Integer> second = EMPLOYEES.stream()
                .map(Employee::salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println("Second highest salary: " + second.orElse(-1));

        // 3. Salary total per department
        Map<String, Integer> deptTotals = EMPLOYEES.stream()
                .collect(Collectors.groupingBy(Employee::dept,
                        Collectors.summingInt(Employee::salary)));
        System.out.println("Salary total per dept: " + deptTotals);

        // 4. Above-average earners
        double avg = EMPLOYEES.stream().mapToInt(Employee::salary).average().orElse(0);
        List<String> aboveAvg = EMPLOYEES.stream()
                .filter(e -> e.salary() > avg)
                .map(Employee::name)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Above average (" + (int) avg + "): " + aboveAvg);

        // 5. Youngest per department
        Map<String, Optional<Employee>> youngest = EMPLOYEES.stream()
                .collect(Collectors.groupingBy(Employee::dept,
                        Collectors.minBy(Comparator.comparingInt(Employee::age))));
        Map<String, String> youngestNames = youngest.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        e -> e.getValue().map(Employee::name).orElse("")));
        System.out.println("Youngest per dept: " + youngestNames);

        // 6. CSV of all names
        String csv = EMPLOYEES.stream()
                .map(Employee::name)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("Names: " + csv);
    }
}