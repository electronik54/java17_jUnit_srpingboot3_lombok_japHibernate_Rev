package com.electronik54.revision_3.corejava.ch40_comparable_comparator.solution;

/** Employee with natural ordering by id. */
public class Employee implements Comparable<Employee> {

    private final int id;
    private final String name;
    private final int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getSalary() { return salary; }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "E" + id + " " + name + "(" + salary + ")";
    }
}