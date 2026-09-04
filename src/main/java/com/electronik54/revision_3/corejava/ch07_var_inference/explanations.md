# Challenge 7: Var Inference (Java 10+)

## Problem
Use var (local variable type inference) to declare variables in different scenarios: with primitives, objects, collections, and streams. Show when var can and cannot be used.

## Hint
- var can only be used for local variables with initializer
- Cannot be used for fields, method parameters, or return types
- Compiler infers type from initializer

## Expected Output
Output showing var usage with different types.

## Explanation

### Var Keyword (Java 10+)
Local variable type inference - compiler infers type from initializer.

```java
var name = "Hello";     // Inferred as String
var number = 42;        // Inferred as int
var list = new ArrayList<String>();  // Inferred as ArrayList<String>
```

### When to Use Var

**Local Variables:**
```java
var list = new ArrayList<String>();  // OK
```

**For-Each Loops:**
```java
for (var item : list) {  // OK
    System.out.println(item);
}
```

**Try-With-Resources:**
```java
try (var input = new FileInputStream("file.txt")) {  // OK
    // ...
}
```

### When NOT to Use Var

**Fields (Class Members):**
```java
class MyClass {
    private var name;  // ERROR: cannot use for fields
}
```

**Method Parameters:**
```java
public void method(var param) {  // ERROR: cannot use for parameters
}
```

**Return Types:**
```java
public var getValue() {  // ERROR: cannot use for return type
    return 42;
}
```

**Without Initializer:**
```java
var x;  // ERROR: cannot infer type without initializer
```

**Null Initializer:**
```java
var x = null;  // ERROR: cannot infer type from null
```

**Array Initializer:**
```java
var arr = {1, 2, 3};  // ERROR: need explicit type
var arr = new int[]{1, 2, 3};  // OK
```

### Type Inference Examples

| Declaration | Inferred Type |
|-------------|---------------|
| var x = 42; | int |
| var x = 42L; | long |
| var x = 3.14; | double |
| var x = 3.14f; | float |
| var x = 'A'; | char |
| var x = "Hello"; | String |
| var x = new ArrayList<>(); | ArrayList<Object> |
| var x = List.of(1,2,3); | List<Integer> |

## Key Takeaways

- **When to Use Var**:
  - Type is obvious from context
  - Reduces verbosity (especially with generics)
  - Local variables with clear initializers

- **When NOT to Use Var**:
  - Type is not obvious
  - Fields, parameters, return types
  - Without initializer

- **Best Practices**:
  - Use when type is clear from right-hand side
  - Avoid when it reduces readability
  - Use for complex generic types

- **Common Pitfalls**:
  - Using var for fields
  - Using var without initializer
  - Using var when type is unclear

- **Interview Tips**:
  - Know var is NOT dynamic typing (type is fixed at compile time)
  - Understand limitations (local variables only)
  - Know when to use and when to avoid

## Related Challenges
- Challenge 8: Text Blocks (Java 15+)
- Challenge 9: Switch Expressions (Java 12+)
- Challenge 10: Pattern Matching (Java 16+)
- Challenge 11: Records (Java 14+)
- Challenge 12: Sealed Classes (Java 17+)