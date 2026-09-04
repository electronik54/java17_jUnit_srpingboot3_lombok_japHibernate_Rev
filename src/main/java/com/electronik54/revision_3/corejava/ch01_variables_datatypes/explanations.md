# Challenge 1: Variables and Data Types

## Problem
Create variables of all primitive types (byte, short, int, long, float, double, char, boolean) and reference types (String, arrays). Print each variable with its type and value.

## Hint
- Use L suffix for long literals, f suffix for float literals
- Reference types include String and arrays
- Use System.out.printf() for formatted output

## Expected Output
Output showing all primitive types with values, plus String and array examples.

## Explanation

### Primitive Types
Java has 8 primitive data types stored directly on the stack:

| Type | Size | Range | Default |
|------|------|-------|---------|
| byte | 8-bit | -128 to 127 | 0 |
| short | 16-bit | -32,768 to 32,767 | 0 |
| int | 32-bit | -2^31 to 2^31-1 | 0 |
| long | 64-bit | -2^63 to 2^63-1 | 0L |
| float | 32-bit | ~7 decimal digits | 0.0f |
| double | 64-bit | ~15 decimal digits | 0.0d |
| char | 16-bit | 0 to 65535 (Unicode) | '\u0000' |
| boolean | 1 bit | true/false | false |

**Important Notes:**
- Use `L` suffix for long literals: `long l = 123L;`
- Use `f` suffix for float literals: `float f = 3.14f;`
- Use `d` suffix for double literals (optional): `double d = 3.14d;`
- char uses single quotes: `char c = 'A';`
- String uses double quotes: `String s = "Hello";`

### Reference Types
Reference types store memory addresses (references) to objects on the heap:
- **String**: Immutable sequence of characters
- **Arrays**: Fixed-size collection of same type
- **Objects**: Instances of classes

**Default value**: `null` for all reference types

### Type Casting
1. **Widening (Implicit)**: Smaller type → Larger type (automatic)
   - byte → short → int → long → float → double
   - No data loss

2. **Narrowing (Explicit)**: Larger type → Smaller type (manual)
   - double → float → long → int → short → byte
   - May cause data loss

## Key Takeaways

- **When to Use Primitives**: For simple values, better performance, no null needed
- **When to Use References**: For complex objects, need null capability, use methods
- **Best Practices**: 
  - Use int for whole numbers (default choice)
  - Use double for decimal numbers (default choice)
  - Use long for very large numbers
  - Use BigDecimal for precise financial calculations
- **Common Pitfalls**: 
  - Forgetting L suffix for long
  - Forgetting f suffix for float (causes compilation error)
  - Integer division truncation
- **Interview Tips**: 
  - Know the sizes and ranges of all primitive types
  - Understand widening vs narrowing
  - Know that String is immutable
  - Understand stack vs heap memory

## Related Challenges
- Challenge 2: Operators
- Challenge 28: Wrapper Classes
- Challenge 29: Autoboxing