package com.electronik54.revision_3.corejava.ch116_solid_realworld.solution;

/** SRP: just data. */
public class Employee {
    private final long id;
    private final String name;
    private final double baseSalary;
    private final double bonusPct;

    public Employee(long id, String name, double baseSalary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonusPct = bonusPct;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonusPct() {
        return bonusPct;
    }
}