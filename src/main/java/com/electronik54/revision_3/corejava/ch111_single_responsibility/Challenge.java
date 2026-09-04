package com.electronik54.revision_3.corejava.ch111_single_responsibility;

/**
 * Challenge 111: Single Responsibility Principle (SRP)
 *
 * Problem:
 * A class should have one reason to change. Split a 'Report' class that
 * currently (mis)handles data + formatting + saving into separate classes:
 * Report (data), ReportFormatter (formatting), ReportSaver (persistence).
 *
 * Hint:
 * - SRP = two classes doing two jobs should be split; each class changes for one reason
 * - Data holder: fields + getters. Formatter: formatToJson(). Saver: saveToFile()
 * - Test each class in isolation
 *
 * Expected Output:
 * {title:"Sales", content:"Q1 numbers"}
 * Saved to report.json
 *
 * TODO:
 * 1. Create Report (data only: title, content)
 * 2. Create ReportFormatter.formatToJson(Report)
 * 3. Create ReportSaver.saveToFile(Report)
 * 4. Use all three in main - each has a single responsibility
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 111: Single Responsibility Principle ===");
    }
}