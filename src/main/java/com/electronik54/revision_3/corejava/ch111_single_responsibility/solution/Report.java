package com.electronik54.revision_3.corejava.ch111_single_responsibility.solution;

/** SRP 1: only holds data. */
public class Report {
    private final String title;
    private final String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}