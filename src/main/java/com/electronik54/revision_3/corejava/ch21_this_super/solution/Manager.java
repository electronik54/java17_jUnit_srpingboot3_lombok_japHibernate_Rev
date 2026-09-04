package com.electronik54.revision_3.corejava.ch21_this_super.solution;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String dept, int teamSize) {
        super(name, dept);                       // parent constructor FIRST
        System.out.println("Manager constructor (chains to Employee)");
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        super.work();                            // parent's version
        System.out.println("Manager work (overrides)");
    }

    @Override
    public String toString() {
        // 'this' refers to the current object; super.getDetails() reuses parent logic
        return "Manager [" + super.getDetails() + ", teamSize=" + this.teamSize + "]";
    }
}