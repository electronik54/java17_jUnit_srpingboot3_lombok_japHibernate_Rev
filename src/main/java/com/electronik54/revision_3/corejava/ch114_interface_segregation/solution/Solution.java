package com.electronik54.revision_3.corejava.ch114_interface_segregation.solution;

/**
 * Solution for Challenge 114: Interface Segregation Principle
 */
public class Solution {

    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();

        RobotWorker robot = new RobotWorker();
        robot.work();
    }
}