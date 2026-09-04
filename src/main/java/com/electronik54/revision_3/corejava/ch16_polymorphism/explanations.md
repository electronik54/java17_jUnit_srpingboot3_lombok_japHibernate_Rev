# Challenge 16: Polymorphism

## Problem
Demonstrate compile-time polymorphism (method overloading) and runtime polymorphism (method overriding). Create a Calculator class with overloaded add methods and a Shape hierarchy with overridden draw methods.

## Hint
- Overloading: same method name, different parameters
- Overriding: same method signature in subclass
- Use @Override annotation for overriding
- Parent reference can hold child objects

## Expected Output
Output demonstrating both method overloading and overriding.

## Explanation

### Polymorphism
Polymorphism means "many forms". In Java, it allows objects to take different forms.

### Compile-time Polymorphism (Method Overloading)
Same method name with different parameters (different signature).

```java
class Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }
}
```

**Rules:**
- Different number of parameters
- Different types of parameters
- Different order of parameters

### Runtime Polymorphism (Method Overriding)
Same method signature in parent and child class.

```java
class Animal {
    public void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    @Override
    public void sound() { System.out.println("Bark"); }
}
```

### Dynamic Method Dispatch
Parent reference can hold child object, and method call is resolved at runtime.

```java
Animal animal = new Dog();
animal.sound();  // Outputs "Bark" (not "Animal sound")
```

### Abstract Classes
Cannot be instantiated. Used as base classes.

```java
abstract class Shape {
    public abstract void draw();  // No body
}
```

## Key Takeaways

- **When to Use Overloading**: Same operation with different inputs
- **When to Use Overriding**: Different behavior in subclass
- **Best Practices**:
  - Use @Override annotation
  - Keep overloaded methods consistent
  - Use abstract classes for common behavior
- **Common Pitfalls**:
  - Confusing overloading with overriding
  - Forgetting @Override annotation
  - Overriding static methods (not true overriding)
- **Interview Tips**:
  - Understand difference between compile-time and runtime polymorphism
  - Know that constructors cannot be overridden
  - Understand dynamic method dispatch

## Related Challenges
- Challenge 15: Inheritance
- Challenge 17: Abstraction
- Challenge 22: Interfaces