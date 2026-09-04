# Challenge 11: Records (Java 14+)

## Problem
Create Record classes for Person, Point, and Rectangle. Demonstrate automatic constructor, getters, equals, hashCode, and toString generation.

## Hint
- Records are immutable data carriers
- Cannot extend other classes but can implement interfaces
- All fields are final
- Compiler generates: constructor, getters, equals, hashCode, toString

## Expected Output
Output demonstrating record features.

## Explanation

### Records
Immutable data classes that reduce boilerplate.

```java
public record Person(String name, int age) {}
```

**Auto-generated:**
- Constructor: `Person(String name, int age)`
- Getters: `name()`, `age()` (not getName(), getAge())
- equals(), hashCode(), toString()

### Syntax
```java
public record RecordName(Type field1, Type field2) {
    // Body (optional)
}
```

### Features

**Immutable:**
```java
var person = new Person("Alice", 30);
// person.name = "Bob";  // ERROR: cannot modify final field
```

**Getters (no 'get' prefix):**
```java
person.name();  // Returns "Alice"
person.age();   // Returns 30
```

**toString():**
```
Person[name=Alice, age=30]
```

**equals() and hashCode():**
```java
var p1 = new Person("Alice", 30);
var p2 = new Person("Alice", 30);
p1.equals(p2);  // true
p1.hashCode() == p2.hashCode();  // true
```

### Compact Constructor
For validation:

```java
public record Person(String name, int age) {
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
```

### Custom Methods
```java
public record Point(int x, int y) {
    public double distanceTo(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
```

### Restrictions
- Cannot extend other classes
- Fields are final
- Cannot declare instance fields
- Can implement interfaces
- Can be nested

## Key Takeaways

- **When to Use Records**:
  - Immutable data carriers
  - DTOs (Data Transfer Objects)
  - Value objects
  - API responses

- **Best Practices**:
  - Use for simple data containers
  - Add validation in compact constructor
  - Add custom methods for behavior

- **Common Pitfalls**:
  - Trying to modify fields
  - Expecting getXxx() getters
  - Trying to extend records

- **Interview Tips**:
  - Know records are Java 14+
  - Understand immutability
  - Know auto-generated methods
  - Understand restrictions

## Related Challenges
- Challenge 10: Pattern Matching
- Challenge 12: Sealed Classes
- Challenge 22: Interfaces