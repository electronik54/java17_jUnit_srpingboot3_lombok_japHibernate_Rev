# Challenge 6: String Basics

## Problem
Demonstrate String creation (literal vs new), common methods (length, charAt, substring, indexOf, concat, replace, split, toUpperCase, toLowerCase, trim), and String immutability.

## Hint
- String literals are stored in String Pool
- new String() creates heap object
- Strings are immutable - every modification creates new String

## Expected Output
Output showing String methods and immutability demonstration.

## Explanation

### String Creation

**Using Literal (String Pool):**
```java
String s1 = "Hello";  // Stored in String Pool
String s2 = "Hello";  // Reuses same object from Pool
s1 == s2;  // true (same reference)
```

**Using new Keyword (Heap):**
```java
String s3 = new String("Hello");  // New object in heap
s1 == s3;  // false (different objects)
s1.equals(s3);  // true (same content)
```

### String Pool
- Special memory area for String literals
- Saves memory by reusing identical strings
- Only works with literals, not `new String()`

### Common String Methods

| Method | Description | Example |
|--------|-------------|---------|
| length() | Returns length | "Hello".length() → 5 |
| charAt(int) | Character at index | "Hello".charAt(0) → 'H' |
| substring(int, int) | Substring | "Hello".substring(0,3) → "Hel" |
| indexOf(String) | First index of | "Hello".indexOf("l") → 2 |
| concat(String) | Concatenate | "Hello".concat(" World") |
| replace(CharSequence, CharSequence) | Replace | "Hello".replace("l","L") |
| toUpperCase() | Upper case | "Hello".toUpperCase() → "HELLO" |
| toLowerCase() | Lower case | "Hello".toLowerCase() → "hello" |
| trim() | Remove whitespace | "  Hello  ".trim() → "Hello" |
| split(String) | Split by regex | "a,b,c".split(",") → ["a","b","c"] |
| contains(CharSequence) | Contains check | "Hello".contains("ell") → true |
| startsWith(String) | Prefix check | "Hello".startsWith("He") → true |
| endsWith(String) | Suffix check | "Hello".endsWith("lo") → true |

### String Immutability
Strings cannot be modified after creation.

```java
String s = "Hello";
s.concat(" World");  // Returns NEW String, s unchanged
System.out.println(s);  // Still "Hello"

// To modify, reassign:
s = s.concat(" World");  // s now points to new String
```

**Why Immutable?**
1. String Pool safety
2. Security (cannot be changed)
3. Thread safety
4. Performance (hashcode caching)

## Key Takeaways

- **When to Use String**: Text data that won't change frequently
- **Best Practices**:
  - Use literals for better performance
  - Use .equals() for comparison, not ==
  - Use StringBuilder for frequent modifications
- **Common Pitfalls**:
  - Using == instead of .equals()
  - Creating unnecessary String objects
  - Using String in loops for concatenation
- **Interview Tips**:
  - Understand String Pool
  - Know why String is immutable
  - Understand difference between String, StringBuilder, StringBuffer

## Related Challenges
- Challenge 26: String Advanced
- Challenge 27: StringBuilder
- Challenge 8: Text Blocks (Java 15+)