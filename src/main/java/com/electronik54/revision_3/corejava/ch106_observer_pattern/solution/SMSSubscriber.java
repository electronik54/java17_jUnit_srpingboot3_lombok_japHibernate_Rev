package com.electronik54.revision_3.corejava.ch106_observer_pattern.solution;

/** Concrete observer - SMS notification. */
public class SMSSubscriber implements Subscriber {
    private final String name;

    public SMSSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received: " + news);
    }
}