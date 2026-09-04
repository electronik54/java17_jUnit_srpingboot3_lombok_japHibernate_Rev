package com.electronik54.revision_3.corejava.ch106_observer_pattern;

/**
 * Challenge 106: Observer Pattern
 *
 * Problem:
 * Implement the Observer pattern with a NewsAgency (subject) that notifies
 * registered Subscriber observers when news is published. When the agency
 * publishes, every subscriber gets the update.
 *
 * Hint:
 * - Subscriber interface: void update(String news)
 * - NewsAgency holds List<Subscriber>, expose subscribe/unsubscribe, and
 *   notifyAll on publish
 * - Push model: the subject pushes the news to observers
 *
 * Expected Output:
 * Subscriber1 received: Breaking News: Java 21 released!
 * Subscriber2 received: Breaking News: Java 21 released!
 *
 * TODO:
 * 1. Create Subscriber interface with update(String)
 * 2. Create EmailSubscriber and SMSSubscriber implementing it
 * 3. Create NewsAgency with subscribe, unsubscribe, publish
 * 4. Attach two subscribers, publish, and print notifications
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 106: Observer Pattern ===");
    }
}