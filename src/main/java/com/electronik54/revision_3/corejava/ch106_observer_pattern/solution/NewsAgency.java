package com.electronik54.revision_3.corejava.ch106_observer_pattern.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject: manages observers and notifies them on state change.
 */
public class NewsAgency {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void publish(String news) {
        for (Subscriber s : subscribers) {
            s.update(news);
        }
    }
}