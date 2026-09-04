package com.electronik54.revision_3.corejava.ch114_interface_segregation.solution;

/** Human can both work and eat. */
public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human: Working");
    }

    @Override
    public void eat() {
        System.out.println("Human: Eating");
    }
}