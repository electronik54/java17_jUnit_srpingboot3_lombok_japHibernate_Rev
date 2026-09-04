# Challenge 13: Classes and Objects

## Problem
Create a class 'Student' with fields (name, age, grade), methods (study, getInfo), constructors (default and parameterized), and static members (schoolName, getSchoolName). Demonstrate object creation and method invocation.

## Hint
- Use private fields with public getters/setters
- Static members belong to class, not instances
- Use 'this' keyword to refer to current object

## Expected Output
Output showing Student objects with their info and school name.

## Explanation

### Class
A class is a blueprint for creating objects. It defines:
- **Fields/Attributes**: State of the object
- **Methods**: Behavior of the object
- **Constructors**: Initialize objects

```java
public class ClassName {
    // Fields
    // Constructors
    // Methods
}
```

### Object
An object is an instance of a class, created using the `new` keyword.

```java
ClassName obj = new ClassName();
```

### Fields (Attributes)
Variables that hold the state of an object.

```java
public class Student {
    private String name;  // Instance field
    private int age;
}
```

### Methods
Functions that define the behavior of an object.

```java
public void study(String subject) {
    System.out.println(name + " is studying " + subject);
}
```

### Constructors
Special methods called when an object is created.

**Default Constructor:**
```java
public Student() {
    this.name = "Unknown";
    this.age = 0;
}
```

**Parameterized Constructor:**
```java
public Student(String name, int age) {
    this.name = name;
    this.age = age;
}
```

### 'this' Keyword
Refers to the current object instance.

```java
public void setName(String name) {
    this.name = name;  // this.name = field, name = parameter
}
```

### Static Members
Belong to the class, not instances. Shared by all objects.

```java
private static String schoolName = "Java High School";

public static String getSchoolName() {
    return schoolName;
}

// Call using class name
Student.getSchoolName();
```

### Access Modifiers
| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| public | ✓ | ✓ | ✓ | ✓ |
| protected | ✓ | ✓ | ✓ | ✗ |
| default | ✓ | ✓ | ✗ | ✗ |
| private | ✓ | ✗ | ✗ | ✗ |

## Key Takeaways

- **When to Use Classes**: To model real-world entities with state and behavior
- **Best Practices**:
  - Make fields private
  - Provide public getters/setters
  - Use constructors to initialize objects
  - Use 'this' to distinguish fields from parameters
- **Common Pitfalls**:
  - Forgetting to use 'this' when parameter name matches field
  - Making fields public (breaks encapsulation)
  - Creating multiple instances when one would suffice (singleton pattern)
- **Interview Tips**:
  - Understand difference between class and object
  - Know when to use static vs instance members
  - Understand constructor chaining

## Related Challenges
- Challenge 14: Encapsulation
- Challenge 15: Inheritance
- Challenge 16: Polymorphism
- Challenge 18: Static Final