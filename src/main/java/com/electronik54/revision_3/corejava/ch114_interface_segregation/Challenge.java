package com.electronik54.revision_3.corejava.ch114_interface_segregation;

/**
 * Challenge 114: Interface Segregation Principle (ISP)
 *
 * Problem:
 * Clients should not depend on methods they do not use. Replace a fat
 * 'Worker' interface (work + eat) with segregated interfaces 'Workable'
 * (work) and 'Eatable' (eat). A RobotWorker only implements Workable - it
 * should not be forced to implement eat().
 *
 * Hint:
 * - Fat interface: Worker { work(); eat(); } - Robot has to stub eat()
 * - ISP: split into Workable and Eatable
 * - HumanWorker implements both; RobotWorker implements only Workable
 *
 * Expected Output:
 * Human: Working
 * Human: Eating
 * Robot: Working (no eating needed - good, no fake stub)
 *
 * TODO:
 * 1. Create Workable and Eatable interfaces
 * 2. HumanWorker implements both; RobotWorker implements Workable only
 * 3. Show that Robot never has to implement eat()
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 114: Interface Segregation Principle ===");
    }
}