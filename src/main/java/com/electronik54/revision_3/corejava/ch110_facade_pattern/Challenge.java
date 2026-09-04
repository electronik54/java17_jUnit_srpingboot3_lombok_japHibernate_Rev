package com.electronik54.revision_3.corejava.ch110_facade_pattern;

/**
 * Challenge 110: Facade Pattern
 *
 * Problem:
 * Create a ComputerFacade that simplifies starting and shutting down a
 * complex subsystem (CPU, Memory, HardDrive). The client uses the facade
 * instead of manually orchestrating every subsystem call.
 *
 * Hint:
 * - Subsystem classes: CPU, Memory, HardDrive each with start/stop behavior
 * - ComputerFacade wraps them and exposes simple start() / shutdown()
 * - Facade hides internal complexity from the client
 *
 * Expected Output:
 * Computer starting...
 * CPU loading
 * Memory loading
 * HardDrive reading
 * Computer shutting down...
 * CPU stopped
 * HardDrive closed
 *
 * TODO:
 * 1. Create CPU, Memory, HardDrive subsystem classes
 * 2. Create ComputerFacade wrapping them with start() and shutdown()
 * 3. Client calls only the facade's start()/shutdown()
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 110: Facade Pattern ===");
    }
}