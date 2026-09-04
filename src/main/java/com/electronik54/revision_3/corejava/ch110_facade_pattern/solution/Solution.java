package com.electronik54.revision_3.corejava.ch110_facade_pattern.solution;

/**
 * Solution for Challenge 110: Facade Pattern
 */
public class Solution {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        computer.shutdown();
    }
}