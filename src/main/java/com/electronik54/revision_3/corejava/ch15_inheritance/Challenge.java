package com.electronik54.revision_3.corejava.ch15_inheritance;

/**
 * Challenge 15: Inheritance
 * 
 * Problem:
 * Create a parent class 'Animal' with fields (name, age) and methods (eat, sleep).
 * Create child classes 'Dog' and 'Cat' that extend Animal and add their own methods (bark, meow).
 * Demonstrate method overriding and super keyword usage.
 * 
 * Hint:
 * - Use 'extends' keyword for inheritance
 * - Use @Override annotation for method overriding
 * - Use super() to call parent constructor
 * - Use super.method() to call parent method
 * 
 * Expected Output:
 * === Animal Info ===
 * Name: Buddy, Age: 3
 * Buddy is eating...
 * Buddy is sleeping...
 * Buddy says: Woof!
 * 
 * === Cat Info ===
 * Name: Whiskers, Age: 2
 * Whiskers is eating...
 * Whiskers is sleeping...
 * Whiskers says: Meow!
 * 
 * TODO:
 * 1. Create Animal class with fields: name, age
 * 2. Add constructor to initialize name and age
 * 3. Add methods: eat() and sleep()
 * 4. Create Dog class extending Animal
 * 5. Add method bark() to Dog class
 * 6. Create Cat class extending Animal
 * 7. Add method meow() to Cat class
 * 8. Create instances and demonstrate inheritance
 * 
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 15: Inheritance ===");
        
    }
}