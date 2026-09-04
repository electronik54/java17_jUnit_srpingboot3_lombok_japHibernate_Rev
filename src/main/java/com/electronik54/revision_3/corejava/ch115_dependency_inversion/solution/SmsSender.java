package com.electronik54.revision_3.corejava.ch115_dependency_inversion.solution;

/** Low-level implementation B, swappable without touching NotificationService. */
public class SmsSender implements MessageSender {
    @Override
    public void send(String message, String to) {
        System.out.println("Sending SMS to " + to + ": " + message);
    }
}