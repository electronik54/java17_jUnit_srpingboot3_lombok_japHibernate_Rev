# Challenge 15: Inheritance

## Problem
Create a parent class 'Animal' with fields (name, age) and methods (eat, sleep). Create child classes 'Dog' and 'Cat' that extend Animal and add their own methods (bark, meow). Demonstrate method overriding and super keyword usage.

## Hint
- Use 'extends' keyword for inheritance
- Use @Override annotation for method overriding
- Use super() to call parent constructor
- Use super.method() to call parent method

## Expected Output
Output showing Dog and Cat instances demonstrating inherited and own methods.

## Explanation

### Inheritance
Inheritance allows a class to inherit properties and methods from another class.

```java
class Child extends Parent {
    // Child inherits from Parent
}
```

### 'extends' Keyword
Used to create a subclass that inherits from a superclass.

```java
class Dog extends Animal {
    // Dog inherits all non-private members of Animal
}
```

### 'super' Keyword
Used to refer to the parent class.

**Call parent constructor:**
```java
public Dog(String name, int age) {
    super(name, age);  // Must be first statement
}
```

**Call parent method:**
```java
@Override
public void eat() {
    super.eat();  // Call parent's eat method
    System.out.println("Dog eats kibble");
}
```

### Method Overriding
Redefining a parent method in the child class.

```java
@Override  // Annotation (optional but recommended)
public void eat() {
    // New implementation
}
```

### Rules for Overriding
1. Method name must be same
2. Parameters must be same
3. Return type must be same or covariant
4. Access modifier cannot be more restrictive
5. Cannot override final or static methods

## Key Takeaways

- **When to Use Inheritance**: IS-A relationship (Dog IS-A Animal)
- **Best Practices**:
  - Use @Override annotation
  - Call super() as first statement in constructor
  - Favor composition over inheritance
- **Common Pitfalls**:
  - Forgetting super() call
  - Overriding private methods (not possible)
  - Deep inheritance hierarchies
- **Interview Tips**:
  - Understand IS-A vs HAS-A relationships
  - Know difference between overloading and overriding
  - Understand why multiple inheritance is not supported in Java

## Related Challenges
- Challenge 13: Classes and Objects
- Challenge 16: Polymorphism
- Challenge 17: Abstraction