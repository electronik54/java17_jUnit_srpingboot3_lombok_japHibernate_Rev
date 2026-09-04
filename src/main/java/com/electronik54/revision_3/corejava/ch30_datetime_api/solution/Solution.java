package com.electronik54.revision_3.corejava.ch30_datetime_api.solution;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Solution for Challenge 30: Date and Time API
 *
 * Demonstrates: LocalDate/LocalTime, immutable arithmetic (plusDays),
 * DateTimeFormatter format & parse, ChronoUnit for differences.
 */
public class Solution {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now().withNano(0);

        System.out.println("Today: " + today);
        System.out.println("Time now: " + now);

        LocalDate later = today.plusDays(10);
        System.out.println("Plus 10 days: " + later);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatted = later.format(fmt);
        System.out.println("Formatted: " + formatted);

        long days = ChronoUnit.DAYS.between(today, later);
        System.out.println("Days between: " + days);

        LocalDate parsed = LocalDate.parse(formatted, fmt);
        System.out.println("Parsed back: " + parsed);

        // Immutability: original 'today' is unchanged
        System.out.println("Original today unchanged: " + today.equals(LocalDate.now()));
    }
}