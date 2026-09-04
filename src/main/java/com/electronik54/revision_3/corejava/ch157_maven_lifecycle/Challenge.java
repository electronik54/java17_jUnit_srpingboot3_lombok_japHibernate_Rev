package com.electronik54.revision_3.corejava.ch157_maven_lifecycle;

/**
 * Challenge 157: Maven Lifecycle
 * 
 * Challenge Statement:
 * Understand Maven's three built-in build lifecycles:
 * default (main), clean, and site.
 * Default lifecycle phases (in order):
 * validate, compile, test, package, verify, install, deploy.
 * Explain what each phase does and the order of execution.
 * 
 * Hint:
 * - Phases are executed sequentially (validate → compile → test → ...)
 * - Each phase is bound to plugin goals (e.g., compile → compiler:compile)
 * - mvn package runs all phases up to package
 * - Plugins can bind goals to specific phases
 * 
 * Expected Output (Solution):
 * Default Lifecycle Phases:
 * 1. validate - checks project configuration
 * 2. compile - compiles source code
 * 3. test - runs unit tests
 * 4. package - creates JAR/WAR
 * 5. verify - runs integration tests
 * 6. install - copies JAR to local repo
 * 7. deploy - uploads to remote repository
 */
public class Challenge {

}