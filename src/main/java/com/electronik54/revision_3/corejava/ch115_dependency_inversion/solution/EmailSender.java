package com.electronik54.revision_3.corejava.ch115_dependency_inversion.solution;

/** Low-level implementation A. */
public class EmailSender implements MessageSender {
    @Override
    public void send(String message, String to) {
        System.out.println("Sending email to " + to + ": " + message);
    }
}