package com.electronik54.revision_3.corejava.ch105_prototype_pattern.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype: supports cloning. Overrides clone() to perform a DEEP copy
 * of the mutable content list.
 */
public class Document implements Cloneable {
    private final String title;
    private final List<String> content;

    public Document(String title, List<String> content) {
        this.title = title;
        this.content = content;
    }

    public void addLine(String line) {
        content.add(line);
    }

    public List<String> getContent() {
        return content;
    }

    @Override
    public Document clone() {
        // Deep copy: new list so the clone does not share mutation with original
        return new Document(this.title, new ArrayList<>(this.content));
    }
}