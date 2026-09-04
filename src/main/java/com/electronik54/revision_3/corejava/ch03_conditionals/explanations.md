# Challenge 3: Conditionals

## Problem
Implement if-else, nested if-else, and switch statements. Check if a number is positive/negative/zero, even/odd, and print day name for number 1-7.

## Hint
- Use if-else for range checks
- Use switch for discrete values
- Don't forget break in traditional switch

## Expected Output
Output showing conditional checks and switch case results.

## Explanation

### if-else Statement
```java
if (condition1) {
    // code block 1
} else if (condition2) {
    // code block 2
} else {
    // default code block
}
```

**When to Use:**
- Range checks (e.g., `x > 0 && x < 100`)
- Complex conditions
- Boolean expressions

### Nested if-else
```java
if (condition1) {
    if (condition2) {
        // nested code
    }
}
```

**Best Practice:** Avoid deep nesting (max 2-3 levels). Use early returns or extract methods.

### Ternary Operator
```java
variable = (condition) ? valueIfTrue : valueIfFalse;
```

**When to Use:**
- Simple conditional assignments
- Return values based on condition

**Example:**
```java
String status = (age >= 18) ? "Adult" : "Minor";
int max = (a > b) ? a : b;
```

### Traditional Switch Statement
```java
switch (expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // default code
}
```

**Important Notes:**
- `break` is required to prevent fall-through
- Without `break`, execution continues to next case
- `default` is optional
- Expression types: byte, short, char, int, String (Java 7+), enums

### Switch Expressions (Java 12+)
```java
// Arrow syntax (no break needed)
String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid";
};

// Yield for blocks
String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> {
        String result = "Tuesday";
        yield result;
    }
    default -> "Invalid";
};
```

**Benefits:**
- No fall-through
- Can return values
- More concise
- Compiler checks exhaustiveness

## Key Takeaways

- **When to Use if-else:**
  - Range checks
  - Complex boolean conditions
  - Floating-point comparisons

- **When to Use switch:**
  - Discrete values (int, String, enum)
  - Multiple equality checks
  - Menu selections, state machines

- **Best Practices:**
  - Use switch for >3 discrete values
  - Always use break in traditional switch
  - Consider switch expressions (Java 12+)
  - Avoid deep nesting
  - Use early returns to simplify

- **Common Pitfalls:**
  - Forgetting break in switch
  - Using = instead of == in conditions
  - Deep nesting (arrow anti-pattern)
  - Floating-point equality checks

- **Interview Tips:**
  - Know difference between & and &&
  - Understand short-circuit evaluation
  - Know switch expression syntax (Java 12+)
  - Understand fall-through behavior

## Related Challenges
- Challenge 2: Operators
- Challenge 4: Loops
- Challenge 9: Switch Expressions (Java 17 Feature)