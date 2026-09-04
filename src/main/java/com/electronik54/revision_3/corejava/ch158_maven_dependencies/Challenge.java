package com.electronik54.revision_3.corejava.ch158_maven_dependencies;

/**
 * Challenge 158: Maven Dependencies & Scopes
 * 
 * Challenge Statement:
 * Understand Maven dependency scopes and transitive dependency management.
 * Scopes: compile (default), provided, runtime, test, system, import.
 * Explain exclusions, optional dependencies, and dependency mediation.
 * Show how to exclude a transitive dependency.
 * 
 * Hint:
 * - compile: available everywhere (spring-boot-starter-web)
 * - provided: available at compile, not at runtime (servlet-api)
 * - test: only for test compilation and execution (JUnit)
 * - runtime: not needed for compilation, needed at runtime (JDBC driver)
 * - Use <exclusions> to exclude conflicting transitive dependencies
 * - mvn dependency:tree shows full dependency tree
 * 
 * Expected Output (Solution):
 * Dependency scope examples from this project's pom.xml:
 * spring-boot-starter-web (compile) - web applications
 * h2 (runtime) - database driver
 * lombok (compile) - annotation processing
 * JUnit (test) - testing framework
 * Exclusion prevents version conflicts
 */
public class Challenge {

}