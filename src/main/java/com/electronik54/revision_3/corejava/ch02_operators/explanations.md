# Challenge 2: Operators

## Problem
Demonstrate arithmetic (+, -, *, /, %), relational (==, !=, <, >, <=, >=), logical (&&, ||, !), and bitwise (&, |, ^, ~, <<, >>, >>>) operators with examples.

## Hint
- Use parentheses for operator precedence
- Bitwise operators work on integer types only
- && and || are short-circuit operators

## Expected Output
Output showing results of all operator types with sample values.

## Explanation

### Arithmetic Operators
| Operator | Name | Example | Result |
|----------|------|---------|--------|
| + | Addition | 10 + 3 | 13 |
| - | Subtraction | 10 - 3 | 7 |
| * | Multiplication | 10 * 3 | 30 |
| / | Division | 10 / 3 | 3 (integer division) |
| % | Modulus | 10 % 3 | 1 |

**Important Notes:**
- Integer division truncates decimal: `10 / 3 = 3`, not `3.33`
- Modulus returns remainder: `10 % 3 = 1`
- Use `%%` in printf to print literal `%`

### Relational Operators
| Operator | Name | Example | Result |
|----------|------|---------|--------|
| == | Equal to | 10 == 3 | false |
| != | Not equal to | 10 != 3 | true |
| > | Greater than | 10 > 3 | true |
| < | Less than | 10 < 3 | false |
| >= | Greater than or equal | 10 >= 3 | true |
| <= | Less than or equal | 10 <= 3 | false |

**Important Notes:**
- Returns `boolean` (true/false)
- Use `==` for primitives, `.equals()` for objects
- Never use `==` to compare Strings (use `.equals()`)

### Logical Operators
| Operator | Name | Description |
|----------|------|-------------|
| && | Logical AND | true if both true |
| \|\| | Logical OR | true if either true |
| ! | Logical NOT | inverts boolean |

**Short-Circuit Evaluation:**
- `&&`: If left is false, right is not evaluated
- `||`: If left is true, right is not evaluated
- Use `&` and `|` for non-short-circuit (always evaluates both)

### Bitwise Operators
| Operator | Name | Example | Binary | Result |
|----------|------|---------|--------|--------|
| & | AND | 5 & 3 | 0101 & 0011 | 0001 (1) |
| \| | OR | 5 \| 3 | 0101 \| 0011 | 0111 (7) |
| ^ | XOR | 5 ^ 3 | 0101 ^ 0011 | 0110 (6) |
| ~ | NOT | ~5 | ~0101 | 1010 (-6) |
| << | Left shift | 5 << 1 | 0101 << 1 | 1010 (10) |
| >> | Right shift | 5 >> 1 | 0101 >> 1 | 0010 (2) |
| >>> | Unsigned right shift | 5 >>> 1 | 0101 >>> 1 | 0010 (2) |

**Important Notes:**
- Work on integer types (byte, short, int, long)
- `<<` shifts bits left, fills with 0
- `>>` shifts bits right, fills with sign bit
- `>>>` shifts bits right, fills with 0
- Left shift by n = multiply by 2^n
- Right shift by n = divide by 2^n

### Operator Precedence (Highest to Lowest)
1. Postfix: `expr++`, `expr--`
2. Unary: `++expr`, `--expr`, `+expr`, `-expr`, `~`, `!`
3. Multiplicative: `*`, `/`, `%`
4. Additive: `+`, `-`
5. Shift: `<<`, `>>`, `>>>`
6. Relational: `<`, `>`, `<=`, `>=`, `instanceof`
7. Equality: `==`, `!=`
8. Bitwise AND: `&`
9. Bitwise XOR: `^`
10. Bitwise OR: `|`
11. Logical AND: `&&`
12. Logical OR: `||`
13. Ternary: `?:`
14. Assignment: `=`, `+=`, `-=`, etc.

## Key Takeaways

- **When to Use**: 
  - Arithmetic for calculations
  - Relational for comparisons
  - Logical for boolean conditions
  - Bitwise for low-level operations
- **Best Practices**:
  - Use parentheses for clarity
  - Use short-circuit operators (&&, ||) for efficiency
  - Never use == for String comparison
- **Common Pitfalls**:
  - Integer division truncation
  - Using == instead of .equals() for objects
  - Forgetting short-circuit behavior
  - Confusing & (bitwise) with && (logical)
- **Interview Tips**:
  - Know operator precedence
  - Understand short-circuit evaluation
  - Know difference between >> and >>>
  - Understand two's complement for negative numbers

## Related Challenges
- Challenge 1: Variables and Data Types
- Challenge 3: Conditionals
- Challenge 4: Loops