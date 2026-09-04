# Challenge 4: Loops

## Problem
Demonstrate for, while, do-while, and enhanced for-each loops. Print numbers 1-10, sum of array elements, and iterate over a List.

## Hint
- Use for for known iterations
- Use while for condition-based
- Use do-while for at least once execution
- Use for-each for collections/arrays

## Expected Output
Output showing loop iterations and calculations.

## Explanation

### for Loop
```java
for (initialization; condition; update) {
    // code block
}
```

**Execution Order:**
1. Initialization (once)
2. Condition check
3. Code block execution
4. Update
5. Repeat from step 2

**When to Use:**
- Known number of iterations
- Counter-based loops
- Arrays/collections with index

**Example:**
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

### while Loop
```java
while (condition) {
    // code block
}
```

**When to Use:**
- Unknown number of iterations
- Condition-based loops
- Reading until EOF, user input, etc.

**Example:**
```java
while (scanner.hasNext()) {
    String line = scanner.nextLine();
}
```

### do-while Loop
```java
do {
    // code block
} while (condition);
```

**Key Difference:** Executes at least once (condition checked after)

**When to Use:**
- Menu systems
- Input validation
- When at least one execution is required

**Example:**
```java
int choice;
do {
    choice = showMenu();
} while (choice != 0);
```

### for-each Loop (Enhanced for)
```java
for (Type variable : collection) {
    // code block
}
```

**When to Use:**
- Iterating over arrays or collections
- No need for index
- Read-only iteration

**Example:**
```java
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

**Limitations:**
- No access to index
- Cannot modify collection during iteration (ConcurrentModificationException)
- Cannot iterate in reverse

### break Statement
- Exits the loop immediately
- Used to terminate loop early

**Example:**
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;  // Exit at 5
}
```

### continue Statement
- Skips current iteration
- Continues with next iteration

**Example:**
```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) continue;  // Skip evens
    System.out.println(i);
}
```

### Nested Loops
```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.println(i + "," + j);
    }
}
```

**Complexity:** O(n²) for two nested loops

## Key Takeaways

- **When to Use for:**
  - Known iteration count
  - Need index access
  - Arrays/collections

- **When to Use while:**
  - Unknown iterations
  - Condition-based
  - Reading streams

- **When to Use do-while:**
  - At least once execution
  - Menu systems

- **When to Use for-each:**
  - Simple iteration
  - No index needed
  - Read-only

- **Best Practices:**
  - Prefer for-each for simple iteration
  - Use meaningful variable names
  - Avoid deep nesting
  - Use break/continue judiciously

- **Common Pitfalls:**
  - Off-by-one errors (i <= 10 vs i < 10)
  - Infinite loops (forgetting update)
  - Modifying collection during for-each
  - Using wrong loop type

- **Interview Tips:**
  - Know time complexity of nested loops
  - Understand break vs continue
  - Know for-each limitations
  - Be able to convert between loop types

## Related Challenges
- Challenge 3: Conditionals
- Challenge 5: Arrays
- Challenge 42: Iterators