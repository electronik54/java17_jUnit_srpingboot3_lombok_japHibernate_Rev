package com.electronik54.revision_3.corejava.ch115_dependency_inversion.solution;

/** High-level module depends on the abstraction, not a concrete sender. */
public class NotificationService {
    private final MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notify(String to, String message) {
        sender.send(message, to);
    }
}