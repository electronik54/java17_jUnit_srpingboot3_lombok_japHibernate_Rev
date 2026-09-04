package com.electronik54.revision_3.corejava.ch106_observer_pattern.solution;

/** Observer contract (push model). */
public interface Subscriber {
    void update(String news);
}