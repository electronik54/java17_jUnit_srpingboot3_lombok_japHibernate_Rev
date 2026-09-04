# Challenge 17: Abstraction

## Problem
Create an abstract class 'Vehicle' with abstract methods (start, stop) and concrete methods (honk). Create concrete classes 'Car' and 'Motorcycle' that extend Vehicle. Also create an interface 'Electric' with method charge(). Demonstrate abstraction with both abstract class and interface.

## Hint
- Abstract class: partial abstraction (can have concrete methods)
- Interface: full abstraction (before Java 8)
- Use 'abstract' keyword for abstract methods
- Use 'implements' keyword for interfaces

## Expected Output
Output demonstrating abstract classes and interfaces.

## Explanation

### Abstraction
Hiding implementation details and showing only essential features.

### Abstract Class
A class that cannot be instantiated and may contain abstract methods.

```java
abstract class Vehicle {
    public abstract void start();  // No body
    public void honk() {           // Concrete method
        System.out.println("Honk!");
    }
}
```

**Characteristics:**
- Cannot be instantiated
- Can have abstract and concrete methods
- Can have constructors
- Can have fields
- Subclass must implement all abstract methods

### Interface
A contract that defines methods a class must implement.

```java
interface Electric {
    void charge();  // Implicitly public abstract
}
```

**Characteristics (Java 8+):**
- All methods are public abstract by default
- Can have default methods (Java 8+)
- Can have static methods (Java 8+)
- Can have private methods (Java 9+)
- Fields are public static final

### Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|---------|---------------|-----------|
| Instantiation | No | No |
| Methods | Abstract + Concrete | Abstract (before Java 8) |
| Fields | Any | public static final |
| Constructors | Yes | No |
| Multiple inheritance | No | Yes |
| Access modifiers | Any | public (default) |

## Key Takeaways

- **When to Use Abstract Class**: IS-A relationship with shared code
- **When to Use Interface**: CAN-DO relationship, multiple behaviors
- **Best Practices**:
  - Use abstract class for template method pattern
  - Use interface for capabilities
  - Prefer interfaces for API design
- **Common Pitfalls**:
  - Trying to instantiate abstract class
  - Not implementing all abstract methods
  - Confusing abstract class with interface
- **Interview Tips**:
  - Know difference between abstract class and interface
  - Understand when to use each
  - Know interface evolution (Java 8, 9, 10)

## Related Challenges
- Challenge 15: Inheritance
- Challenge 16: Polymorphism
- Challenge 22: Interfaces