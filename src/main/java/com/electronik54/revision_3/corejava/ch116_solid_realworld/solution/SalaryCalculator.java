package com.electronik54.revision_3.corejava.ch116_solid_realworld.solution;

/** SRP: computes gross salary. */
public class SalaryCalculator {

    public double gross(Employee e) {
        return e.getBaseSalary() + (e.getBaseSalary() * e.getBonusPct());
    }
}