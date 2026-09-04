# Challenge 12: Sealed Classes (Java 17)

## What are Sealed Classes?

Sealed classes (JEP 409, finalized in Java 17) let a class or interface **control which other classes may extend or implement it**. This brings "sum types" (algebraic data types) to Java.

## Why does this API exist?

Before Java 17, inheritance was all-or-nothing:
- `final` class → nobody can extend it
- non-final class → **anybody** can extend it

Sealed classes give a middle ground: only the classes listed in the `permits` clause can extend the sealed class.

## Syntax

```java
public sealed class Shape permits Circle, Rectangle, Triangle { }
```

## Rules

1. Every permitted subclass **must** be exactly one of:
   - `final` — hierarchy ends here (e.g. `Circle`, `Rectangle`)
   - `sealed` — restricts its own hierarchy further (e.g. `Triangle permits RightTriangle`)
   - `non-sealed` — re-opens this branch to any subclass
2. Permitted subclasses must be in the same module (or same package if unnamed module).
3. The `permits` clause can be omitted if subclasses are in the same file.

## Key Advantage: Exhaustive Type Handling

The compiler **knows the complete hierarchy**, so it can verify that all permitted subtypes are handled. In Java 17, combine sealed classes with **pattern matching for instanceof** (final since Java 16):

```java
if (shape instanceof Circle c) { ... }
else if (shape instanceof Rectangle r) { ... }
else if (shape instanceof Triangle t) { ... }
```

> **Note:** Pattern matching for `switch` (`case Circle c ->`) is only a **preview feature in Java 17** and is finalized in Java 21. With it, switching over a sealed type can be exhaustive **without a default branch** — and the compiler flags missing cases when new subclasses are added.

## When to Use

- Domain models with a **fixed, known set of variants** (payment types, shape types, AST nodes)
- Modelling **business outcomes**: `sealed interface Result permits Success, Failure`
- Replacing boolean/enumeration flags that try to describe many states

## Related Concepts

- **Pattern matching for instanceof** (Java 16): `if (shape instanceof Circle c)`
- **Pattern matching for switch** (Java 21): combined with sealed classes for full ADT support
- **Records** (Java 16): often used as the final leaf nodes of a sealed hierarchy

## Interview Takeaways

- Sealed classes + records + pattern matching = algebraic data types in Java
- Permitted subclasses must be `final`, `sealed`, or `non-sealed` — no other option compiles
- Exhaustive switch without `default` only works when switching over a sealed type
- `non-sealed` intentionally re-opens a branch of the hierarchy
