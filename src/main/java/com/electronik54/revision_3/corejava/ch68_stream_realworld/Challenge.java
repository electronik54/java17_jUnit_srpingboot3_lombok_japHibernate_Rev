package com.electronik54.revision_3.corejava.ch68_stream_realworld;

import java.util.List;

/**
 * Challenge 68: Stream Real-World (Employee Processing)
 *
 * Problem:
 * Solve the classic interview suite over an Employee dataset: highest paid
 * employee, second highest salary, department-wise salary totals, names of
 * employees earning above average, youngest per department, and a comma-
 * separated name string.
 *
 * Hint:
 * - max(Comparator) + Optional - never null
 * - Second highest: sorted(comparator).skip(1).findFirst() OR distinct salaries
 * - Collectors.groupingBy + summingInt for dept totals
 * - Chained Collectors.joining(", ") for CSV output
 *
 * Expected Output (example):
 * Highest paid: Alice (IT, 90000)
 * Second highest salary: 80000
 * Salary total per dept: {IT=150000, HR=50000}
 * Above average: [Alice, Bob]
 * Youngest per dept: {IT=Emma, HR=Frank}
 * Names: Alice, Bob, Carol, Dave, Emma, Frank
 *
 * TODO:
 * 1. Find highest-paid employee
 * 2. Second-highest DISTINCT salary
 * 3. Salary sum per department
 * 4. Names earning above the average salary
 * 5. Youngest employee name per department
 * 6. All names joined with ", "
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 68: Stream Real-World ===");
        System.out.println("Dataset: 6 employees in IT and HR - see solution/Solution.java");
    }
}