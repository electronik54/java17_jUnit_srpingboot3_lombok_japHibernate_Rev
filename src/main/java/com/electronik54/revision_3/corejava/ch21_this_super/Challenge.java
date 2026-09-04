package com.electronik54.revision_3.corejava.ch21_this_super;

/**
 * Challenge 21: this and super
 *
 * Problem:
 * Create an 'Employee' class and a 'Manager' subclass. Demonstrate:
 * this (current instance), this(...) (constructor chaining), super
 * (parent members), and super(...) (parent constructor call).
 *
 * Hint:
 * - this.field distinguishes an instance field from a same-named parameter
 * - this(...) must be the FIRST statement in a constructor
 * - super.method() calls the parent's overridden version
 *
 * Expected Output:
 * Employee constructor
 * Manager constructor (chains to Employee)
 * Manager [name=Alice, dept=IT, teamSize=5]
 * Employee work (from super)
 * Manager work (overrides)
 *
 * TODO:
 * 1. Employee: fields name, dept; constructor prints "Employee constructor"
 * 2. Employee: getDetails() returns name and dept
 * 3. Employee: work() prints "Employee work (from super)"
 * 4. Manager extends Employee: extra field teamSize
 * 5. Manager constructor chains with super(name, dept) and prints chaining message
 * 6. Manager overrides work() and calls super.work() first
 * 7. Override toString() in Manager; demonstrate this vs super usage
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 21: this and super ===");
    }
}