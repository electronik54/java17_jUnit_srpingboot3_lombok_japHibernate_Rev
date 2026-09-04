package com.electronik54.revision_3.corejava.ch21_this_super.solution;

public class Employee {
    protected String name;
    protected String dept;

    public Employee(String name, String dept) {
        // 'this.' distinguishes the field from the same-named parameter
        this.name = name;
        this.dept = dept;
        System.out.println("Employee constructor");
    }

    public String getDetails() {
        return "name=" + name + ", dept=" + dept;
    }

    public void work() {
        System.out.println("Employee work (from super)");
    }
}