# Challenge 9: Switch Expressions (Java 12+)

## Problem
Convert traditional switch statements to modern switch expressions using arrow syntax and yield. Demonstrate with day-of-week and calculator examples.

## Hint
- Use arrow syntax (->) for expressions
- Use yield for returning values from blocks
- No fall-through with arrow syntax
- Compiler checks exhaustiveness

## Expected Output
Output demonstrating traditional switch and switch expressions.

## Explanation

### Traditional Switch Statement
```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}
```

**Problems:**
- Verbose syntax
- Fall-through behavior (forgetting break causes bugs)
- Cannot return values

### Switch Expressions (Java 12+)

**Arrow Syntax:**
```java
String result = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid";
};
```

**With Blocks:**
```java
int result = switch (op) {
    case '+' -> a + b;
    case '/' -> {
        if (b == 0) yield 0;
        yield a / b;
    }
    default -> 0;
};
```

### yield Keyword
Used to return a value from a block in switch expression.

```java
int result = switch (value) {
    case 1 -> 100;
    case 2 -> {
        int temp = 200;
        yield temp;  // Return from block
    }
    default -> 0;
};
```

### Key Differences

| Feature | Traditional Switch | Switch Expression |
|---------|-------------------|-------------------|
| Syntax | colon (:) | arrow (->) |
| Fall-through | Yes | No |
| Return values | No | Yes |
| Exhaustiveness | Not checked | Checked |
| break needed | Yes | No |

### Benefits
1. No fall-through bugs
2. Can return values
3. More concise
4. Compiler checks exhaustiveness
5. Works with enums, strings, integers

## Key Takeaways

- **When to Use Switch Expressions**:
  - Value-returning scenarios
  - Mapping values
  - Replacing if-else chains

- **Best Practices**:
  - Use arrow syntax for simplicity
  - Use yield for complex blocks
  - Ensure all cases covered (exhaustiveness)

- **Common Pitfalls**:
  - Forgetting yield in blocks
  - Mixing arrow and colon syntax
  - Not handling all cases

- **Interview Tips**:
  - Know difference between switch statement and expression
  - Understand yield keyword
  - Know exhaustiveness checking

## Related Challenges
- Challenge 3: Conditionals
- Challenge 10: Pattern Matching
- Challenge 11: Records