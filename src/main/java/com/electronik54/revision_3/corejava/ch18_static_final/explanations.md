# Challenge 18: Static and Final

## Problem
Demonstrate static variables, methods, blocks, and final variables, methods, classes. Create a MathConstants class with static final PI, a Counter class with static count, and a FinalDemo class with final variables and methods.

## Hint
- Static: belongs to class, not instances
- Final: cannot be changed (variables), overridden (methods), extended (classes)
- Static block runs once at class loading
- Final variables must be initialized

## Expected Output
Output demonstrating static and final features.

## Explanation

### Static Keyword
Belongs to the class, not instances. Shared by all objects.

**Static Variable:**
```java
class Counter {
    private static int count = 0;  // Shared by all instances
}
```

**Static Method:**
```java
class MathUtils {
    public static int add(int a, int b) { return a + b; }
}

// Call using class name
MathUtils.add(5, 3);
```

**Static Block:**
```java
class Database {
    static {
        // Runs once when class is loaded
        System.out.println("Database initialized");
    }
}
```

**Static Import (Java 5+):**
```java
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

double area = PI * radius * radius;
double root = sqrt(16);
```

### Final Keyword
Makes something unchangeable.

**Final Variable (Constant):**
```java
// Must be initialized
final int MAX_VALUE = 100;

// Cannot be reassigned
// MAX_VALUE = 200;  // Error!

// Final local variable
final int x;
x = 10;  // OK - first assignment
// x = 20;  // Error!
```

**Final Method:**
```java
class Parent {
    public final void display() {
        System.out.println("Cannot override");
    }
}

class Child extends Parent {
    // @Override
    // public void display() { }  // Error! Cannot override final method
}
```

**Final Class:**
```java
final class Utility {
    // Cannot be extended
}

// class ExtendedUtility extends Utility { }  // Error!
```

### Static Final (Constants)
The most common use case for constants.

```java
public static final double PI = 3.14159;
```

**Naming Convention:** ALL_CAPS_WITH_UNDERSCORES

## Key Takeaways

- **When to Use Static**:
  - Utility methods (Math.abs(), Collections.sort())
  - Shared counters
  - Constants (static final)
  - Factory methods

- **When to Use Final**:
  - Constants (static final)
  - Immutable objects
  - Security (prevent overriding)
  - Performance (compiler optimizations)

- **Best Practices**:
  - Use static final for constants
  - Use ALL_CAPS for constant names
  - Initialize final variables immediately
  - Use final for immutable classes

- **Common Pitfalls**:
  - Trying to modify final variables
  - Overriding final methods
  - Extending final classes
  - Forgetting to initialize final variables

- **Interview Tips**:
  - Understand static vs instance
  - Know final variable initialization rules
  - Understand static block execution order
  - Know why String is immutable (final)

## Related Challenges
- Challenge 13: Classes and Objects
- Challenge 14: Encapsulation
- Challenge 22: Records (immutable data classes)