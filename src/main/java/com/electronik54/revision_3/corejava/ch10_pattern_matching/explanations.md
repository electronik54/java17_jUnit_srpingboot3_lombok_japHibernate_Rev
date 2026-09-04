# Challenge 10: Pattern Matching for instanceof (Java 16+)

## Problem
Use pattern matching for instanceof to eliminate explicit casting. Check if object is String, Integer, or List and process accordingly.

## Hint
- Pattern matching combines instanceof check and cast
- Variable is in scope after check
- Eliminates explicit casting

## Expected Output
Output demonstrating pattern matching with different types.

## Explanation

### Traditional Approach
Before Java 16, we had to check type and then cast:

```java
if (obj instanceof String) {
    String s = (String) obj;  // Explicit cast needed
    System.out.println(s.length());
}
```

### Pattern Matching (Java 16+)
Combines type check and cast in one step:

```java
if (obj instanceof String s) {
    // s is automatically cast to String
    System.out.println(s.length());
}
```

### Syntax
```java
if (obj instanceof Type variable) {
    // variable is in scope here
    // variable is automatically cast to Type
}
```

### Benefits
1. Eliminates explicit casting
2. Reduces boilerplate
3. Prevents ClassCastException
4. Cleaner code

### Examples

**String:**
```java
if (obj instanceof String s) {
    System.out.println("Length: " + s.length());
}
```

**Integer:**
```java
if (obj instanceof Integer i) {
    System.out.println("Value: " + i + 100);
}
```

**List:**
```java
if (obj instanceof List<?> list) {
    System.out.println("Size: " + list.size());
}
```

### Scope of Pattern Variable
The pattern variable is in scope where the instanceof check is true:

```java
if (obj instanceof String s && s.length() > 5) {
    // s is in scope here
    System.out.println(s);
}
// s is NOT in scope here
```

## Key Takeaways

- **When to Use Pattern Matching**:
  - Type checking with casting
  - Eliminating explicit casts
  - Cleaner instanceof checks

- **Best Practices**:
  - Always use pattern matching instead of instanceof + cast
  - Use meaningful variable names
  - Combine with conditions

- **Common Pitfalls**:
  - Trying to use pattern variable outside scope
  - Not understanding when variable is in scope

- **Interview Tips**:
  - Know pattern matching is Java 16+
  - Understand scope of pattern variable
  - Know it prevents ClassCastException

## Related Challenges
- Challenge 7: Var Inference
- Challenge 9: Switch Expressions
- Challenge 11: Records