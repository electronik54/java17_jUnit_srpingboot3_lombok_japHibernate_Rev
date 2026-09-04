package com.electronik54.revision_3.lombok.ch100_lombok_best_practices.solution;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * Best-practice entity: selective getters, @NonNull validation,
 * derived field excluded from toString.
 */
@Getter
@AllArgsConstructor
@ToString(exclude = "bonusPct")
public class Employee {
    @NonNull
    private String name;
    private double baseSalary;
    private double bonusPct = 0.05;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonusPct = 0.05;
    }

    public double bonus() {
        return baseSalary * bonusPct;
    }

    public double totalCompensation() {
        return baseSalary + bonus();
    }
}