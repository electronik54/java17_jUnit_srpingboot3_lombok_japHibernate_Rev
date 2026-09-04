package com.electronik54.revision_3.corejava.ch115_dependency_inversion.solution;

/**
 * Solution for Challenge 115: Dependency Inversion Principle
 */
public class Solution {

    public static void main(String[] args) {
        NotificationService service = new NotificationService(new EmailSender());
        service.notify("alice@example.com", "Hello");

        service = new NotificationService(new SmsSender());
        service.notify("+123", "Hello");
    }
}