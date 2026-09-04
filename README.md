# Java 17 Interview Preparation - Revision Project

## 📋 Overview

A comprehensive **235-challenge** project for Java developer interview preparation. Covers everything from Java fundamentals to Spring Boot 3, JPA-Hibernate, Spring AOP, Resilience4J, and more.

## 🚀 Quick Start

```bash
mvnw.cmd compile          # Build the project
mvnw.cmd test             # Run tests
```

### Run a Challenge
```bash
# Navigate to the challenge and run its solution
cd target/classes
java com.electronik54.revision_3.corejava.ch01_variables_datatypes.solution.Solution
```

## 📚 Challenge Structure

```
src/main/java/com/electronik54/revision_3/
  corejava/          | ch01-92, 101-235  | Java, OOP, Collections, Streams, etc.
  lombok/            | ch93-100          | Lombok annotations
  springboot/        | ch123-139, 196-200| Spring Boot 3 + AOP
  jpa_hibernate/     | ch133-141-155     | JPA-Hibernate
  logging/           | ch201-205         | Log4J2
  resilience4j/      | ch206-210         | Circuit Breaker, Retry, Rate Limiter
```

Each challenge has:
```
ch<NN>_<topic>/
  Challenge.java           ← Problem statement + TODO (your workspace)
  solution/
    Solution.java          ← Reference solution (has its own main())
    <HelperClass>.java     ← Custom classes in separate files
```

## 🎯 Learning Path

| Phase | Challenges | Topic |
|-------|-----------|-------|
| 1 | 1-6 | Java Fundamentals |
| 2 | 7-12 | Java 17 Features (Records, Sealed Classes, Pattern Matching) |
| 3 | 13-24 | OOP (Inheritance, Polymorphism, Abstraction) |
| 4 | 25-35 | Advanced Core Java |
| 5 | 36-45 | Collections & Generics |
| 6 | **46-52** | **Optional** |
| 7 | **53-68** | **Stream API** |
| 8 | 69-75 | Functional Programming |
| 9 | 76-85 | Multithreading |
| 10 | 86-92 | Advanced Java 17 |
| 11 | 93-100 | Lombok |
| 12 | 101-110 | Design Patterns |
| 13 | 111-116 | SOLID Principles |
| 14 | 117-122 | Testing (JUnit 5, Mockito) |
| 15 | **123-139** | **Spring Boot 3** |
| 16 | **141-155** | **JPA-Hibernate** |
| 17 | 156-160 | Build Tools (Maven, Gradle, Git) |
| 18 | 161-170 | Interview Coding Challenges |
| 19 | 171-195 | Microservices, Cloud, Performance, Security, DB |
| 20 | **196-200** | **Spring AOP** |
| 21 | **201-205** | **Log4J2** |
| 22 | **206-210** | **Resilience4J** |
| 23 | 211-235 | Advanced Topics |

## 🔧 Tech Stack

- **Java 17** (OpenJDK)
- **Spring Boot 3.x** (Web, Data JPA, AOP, Actuator, Security, Validation)
- **Lombok**
- **JPA-Hibernate** (H2 in-memory/file database)
- **Resilience4J** (Circuit Breaker, Retry, Rate Limiter)
- **Log4J2**
- **JUnit 5 + Mockito**
- **Maven**

## 📖 How to Use

1. **Start with Challenge 1** - read the problem statement in `Challenge.java`
2. **Implement your solution** in the `main()` method
3. **Run it** to test your implementation
4. **Stuck?** Check the reference solution in `solution/Solution.java`
5. **Read explanations.md** (planned) for deeper theory

## 📄 License

This project is for educational purposes. Free to use and modify.