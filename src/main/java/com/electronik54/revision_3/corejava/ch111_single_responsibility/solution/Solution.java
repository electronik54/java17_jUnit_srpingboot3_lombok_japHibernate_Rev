package com.electronik54.revision_3.corejava.ch111_single_responsibility.solution;

/**
 * Solution for Challenge 111: Single Responsibility Principle
 */
public class Solution {

    public static void main(String[] args) {
        Report report = new Report("Sales", "Q1 numbers");

        ReportFormatter formatter = new ReportFormatter();
        System.out.println(formatter.formatToJson(report));

        ReportSaver saver = new ReportSaver();
        saver.saveToFile(report);
    }
}