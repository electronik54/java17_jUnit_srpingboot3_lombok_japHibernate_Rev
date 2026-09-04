package com.electronik54.revision_3.corejava.ch111_single_responsibility.solution;

/** SRP 2: only formats. */
public class ReportFormatter {
    public String formatToJson(Report report) {
        return "{\"title\":\"" + report.getTitle() + "\",\"content\":\"" + report.getContent() + "\"}";
    }
}