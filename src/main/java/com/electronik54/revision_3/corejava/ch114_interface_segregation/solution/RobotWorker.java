package com.electronik54.revision_3.corejava.ch114_interface_segregation.solution;

/** Robot only needs Workable - no fake eat() stub. */
public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot: Working");
    }
}