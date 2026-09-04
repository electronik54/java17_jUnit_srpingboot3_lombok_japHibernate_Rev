package com.electronik54.revision_3.corejava.ch30_datetime_api;

/**
 * Challenge 30: Date and Time API (java.time)
 *
 * Problem:
 * Work with LocalDate, LocalTime, LocalDateTime and DateTimeFormatter:
 * get today's date, add/subtract days, compare dates, calculate a period
 * between two dates, and format/parse dates.
 *
 * Hint:
 * - java.time types are immutable and thread-safe (unlike old Date/Calendar)
 * - plusDays/minusMonths return NEW objects
 * - Pattern letters: yyyy year, MM month, dd day, HH hour, mm minute
 *
 * Expected Output (example - depends on current date):
 * Today: 2024-01-15
 * Plus 10 days: 2024-01-25
 * Formatted: 25/01/2024
 * Days between: 10
 * Parsed back: 2024-01-25
 *
 * TODO:
 * 1. Print LocalDate.now() and LocalTime.now()
 * 2. Add 10 days to today and print the result
 * 3. Format that date with pattern "dd/MM/yyyy"
 * 4. Use ChronoUnit.DAYS.between to get days between today and the new date
 * 5. Parse the formatted string back to a LocalDate
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 30: Date and Time API ===");
    }
}