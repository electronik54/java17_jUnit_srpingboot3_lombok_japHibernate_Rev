# Master Prompt — Java 17 Interview Revision Challenge Project

Copy everything below the line into a fresh session on the new system. Keep `docs/Index.md` next to this prompt file — it contains the full ordered list of challenges (1-235).

---

## THE PROMPT

I want you to build a **Java 17 interview-preparation challenge project** (similar to codingbat.com challenges). The complete ordered list of challenges and topics is in **`docs/Index.md`** — read it first and treat it as the single source of truth for challenge numbers, package names, and topics.

### 1. Project Setup (do this once)

Create a Maven project with:

- **Java 17**, **Spring Boot 3.x** (parent `spring-boot-starter-parent`)
- Dependencies:
  - `spring-boot-starter-web`
  - `spring-boot-starter-data-jpa`
  - `spring-boot-starter-actuator`
  - `spring-boot-starter-aop`
  - `spring-boot-starter-security`
  - `spring-boot-devtools` (optional)
  - `lombok` (annotation processor)
  - `spring-boot-starter-validation`
  - `io.github.resilience4j:resilience4j-spring-boot-3:2.2.0`
  - `spring-boot-starter-log4j2` (exclude default logback where needed)
  - `h2` (runtime scope)
  - `spring-boot-starter-test`, `junit-jupiter-api`, `junit-jupiter-engine`, `mockito-core`, `mockito-junit-jupiter` (test scope)
- `src/main/resources/`:
  - `application.yaml` (common config: H2 console, JPA show-sql, actuator exposure of all endpoints, active profile `dev`)
  - `application-dev.yaml` (dev profile: H2 in-memory, ddl-auto update)
  - `application-prod.yaml` (prod profile: stricter settings)
  - `log4j2.xml` (Console + RollingFile appenders)
- Main application class with `@SpringBootApplication`.
- Make sure the project compiles with `mvnw.cmd compile` (or `./mvnw compile`) before creating any challenges.

### 2. Package Structure (MANDATORY - follow exactly)

```
src/main/java/com/<yourpackage>/revision_3/
  corejava/                        <- challenges 1-92, 101-235
  lombok/                          <- challenges 93-100
  springboot/                      <- challenges 123-139, 196-200
  jpa_hibernate/                   <- challenges 133-134, 141-155
  logging/                         <- challenges 201-205
  resilience4j/                    <- challenges 206-210
  runner/                          <- ChallengeRunner.java
```

For each challenge listed in `docs/Index.md`, create this structure:

```
  <toppackage>/                      <- one of the above
    ch<NN>_<topic_slug>/             <- e.g. ch01_variables_datatypes, ch46_optional_creation
      Challenge.java
      solution/
        Solution.java                <- has its OWN independent main() method
        <HelperClass>.java           <- one separate .java file per custom class
```

Rules:

- Package name: `com.<yourpackage>.revision_3.<toppackage>.ch<NN>_<topic_slug>` (prefix `ch` + zero-padded 2-digit number; numbers 100+ use 3 digits).
- `Challenge.java` is the **user's workspace**:
  - Contains a Javadoc header with: **Challenge statement** (the problem, in simple language), **Hint** (2-4 bullet points), **Expected Output** (exact console output).
  - `main()` prints a one-line header like `=== Challenge 13: Classes and Objects ===` and is left **empty for the user to implement. Do NOT write any `// TODO:` comment inside the main method body.**
  - Challenge.java must NOT import or call the Solution class.
- `solution/Solution.java` is the **reference solution**:
  - Has its own `public static void main(String[] args)` so it runs **independently** and prints the exact expected output from the challenge statement.
  - Code is clean and commented - it is the "expected end result" the user compares against.
- **Every custom/auxiliary class goes in its own `.java` file** inside the `solution/` package (e.g. `Student.java`, `BankAccount.java`, `Animal.java`, `Dog.java`) - never as inner classes inside Solution.java, exactly like classes are separated in a real project.
- **Java 17 compliance:** never use preview features (e.g. pattern matching in `switch` is preview in Java 17 - use pattern matching for `instanceof` instead; sealed classes are fine).
- Challenge and Solution are in **different packages** - no import between them is required or allowed.

### 3. explanations.md (SECOND PASS - create after ALL Java files)

Create `explanations.md` inside the challenge folder (NOT in solution/) only after the entire project's Java source files compile and all solutions are verified. Each file should contain:
- Brief explanation of the solution: **why the API/concept exists, its advantages, when to use it, and any theory** (especially for design patterns, SOLID, Java 17 features).
- Plain prose with class names and method names for reference; keep it short and interview-focused.
- Add an "Interview Takeaways" section.

### 4. Workflow (IMPORTANT - to avoid running out of context)

- Work in **batches of 5 challenges at a time**, strictly following the challenge order in `docs/Index.md`.
- After each batch: **compile the project** and **run each Solution's main** to verify the output matches the Expected Output in Challenge.java. Fix any errors before moving on.
- Then show a short summary of what was created and ask: "Continue with the next batch?".
- Never create more than one batch without compiling.
- **Skip challenges that already exist** in the file system; resume from the first missing `ch<NN>_` folder. This allows resuming from a previous session's token limit.
- Do not create Python or other generator scripts - create the files directly.

### 5. Content Quality

- Problems should be practical, interview-style exercises (like codingbat), not trivia.
- Core Java, Optional, Streams, and Collections challenges are the focus - make these deep and numerous (see Index.md phases 5-8).
- For Spring Boot / JPA / AOP / Resilience4J / Log4J challenges, the Solution may be demonstration code that runs standalone (bootstrap a minimal Spring context with `@SpringBootApplication` + `CommandLineRunner` where annotations require it) - it must compile and run without external services.
- Expected Output must be realistic and match exactly what the Solution's main produces.

Start now: read `docs/Index.md`, set up the project skeleton (step 1), then create the first batch of 5 challenges.