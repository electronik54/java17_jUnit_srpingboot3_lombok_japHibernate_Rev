package com.electronik54.revision_3.corejava.ch115_dependency_inversion;

/**
 * Challenge 115: Dependency Inversion Principle (DIP)
 *
 * Problem:
 * High-level modules should not depend on low-level modules; both should
 * depend on abstractions. Build a NotificationService that depends on a
 * MessageSender interface (abstraction), not on a concrete EmailSender -
 * so you can swap in SmsSender without touching the service.
 *
 * Hint:
 * - Abstraction: MessageSender { void send(String msg, String to); }
 * - Low-level: EmailSender, SmsSender implement it
 * - High-level: NotificationService depends on MessageSender (injected)
 *
 * Expected Output:
 * Sending email to alice@example.com: Hello
 * Sending SMS to +123: Hello
 *
 * TODO:
 * 1. Create MessageSender interface
 * 2. EmailSender and SmsSender implement it
 * 3. NotificationService takes MessageSender in constructor
 * 4. Inject each sender and notify
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 115: Dependency Inversion Principle ===");
    }
}