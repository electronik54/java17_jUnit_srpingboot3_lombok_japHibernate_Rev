# Challenge 8: Text Blocks (Java 15+)

## Problem
Create multi-line strings using text blocks (triple quotes). Demonstrate JSON, HTML, SQL query, and formatted text templates.

## Hint
- Text blocks start and end with triple quotes (""")
- No need for escape sequences for quotes inside
- Incidental whitespace is removed automatically

## Expected Output
Output showing multi-line text blocks.

## Explanation

### Text Blocks (Java 15+)
Multi-line strings using triple quotes.

```java
String text = """
    Line 1
    Line 2
    Line 3
    """;
```

### Syntax
- Start with `"""`
- Content on following lines
- End with `"""`
- Closing `"""` determines indentation

### Benefits
1. No escape sequences for quotes
2. Preserves formatting
3. Readable JSON/SQL/HTML
4. Automatic indentation removal

### Examples

**JSON:**
```java
var json = """
    {
      "name": "John",
      "age": 30
    }
    """;
```

**HTML:**
```java
var html = """
    <html>
      <body>
        <h1>Hello</h1>
      </body>
    </html>
    """;
```

**SQL:**
```java
var sql = """
    SELECT id, name
    FROM users
    WHERE age > 18
    """;
```

### Escape Sequences

| Escape | Description |
|--------|-------------|
| \n | Line break |
| \t | Tab |
| \" | Double quote (optional) |
| \\ | Backslash |
| \s | Space (preserves trailing space) |
| \<newline> | Line continuation |

### String.formatted()
Text blocks work with formatted():

```java
var message = """
    Hello %s,
    You have %d messages.
    """.formatted("Alice", 5);
```

### Indentation Rules
- Closing `"""` determines base indentation
- Incidental whitespace is removed
- Relative indentation is preserved

```java
// These are equivalent:
var s1 = """
    Hello
    World
    """;

var s2 = """
        Hello
        World
        """;
```

## Key Takeaways

- **When to Use Text Blocks**:
  - Multi-line strings
  - JSON, XML, HTML, SQL templates
  - Preserving formatting

- **Best Practices**:
  - Use for strings > 2 lines
  - Align closing `"""` with code
  - Use \s to preserve trailing spaces

- **Common Pitfalls**:
  - Forgetting closing `"""`
  - Not understanding indentation rules
  - Using for single-line strings

- **Interview Tips**:
  - Know text blocks are Java 15+
  - Understand indentation rules
  - Know escape sequences

## Related Challenges
- Challenge 6: String Basics
- Challenge 7: Var Inference
- Challenge 9: Switch Expressions