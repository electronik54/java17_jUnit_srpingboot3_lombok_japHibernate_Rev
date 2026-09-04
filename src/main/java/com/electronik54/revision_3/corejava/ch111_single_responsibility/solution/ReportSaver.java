package com.electronik54.revision_3.corejava.ch111_single_responsibility.solution;

/** SRP 3: only persists. */
public class ReportSaver {
    public void saveToFile(Report report) {
        // In a real app this writes to a file/db
        System.out.println("Saved to report.json");
    }
}