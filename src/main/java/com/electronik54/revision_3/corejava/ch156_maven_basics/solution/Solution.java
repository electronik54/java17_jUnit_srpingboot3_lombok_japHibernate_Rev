package com.electronik54.revision_3.corejava.ch156_maven_basics.solution;

/**
 * Solution 156: Maven Basics
 *
 * Maven uses pom.xml (Project Object Model) to manage builds.
 *
 * Key pom.xml elements:
 * - modelVersion: POM format version (always 4.0.0)
 * - groupId: reverse domain (com.electronik54)
 * - artifactId: project name (revision_3)
 * - version: project version (1.0.0)
 * - packaging: jar, war, pom (default: jar)
 *
 * Standard directory layout:
 *   src/main/java     → production code
 *   src/main/resources → properties, XML, YAML
 *   src/test/java     → test code
 *   target/           → compiled output
 *
 * Key commands:
 *   mvn clean      → delete target/
 *   mvn compile    → compile sources
 *   mvn test       → run tests
 *   mvn package    → create JAR/WAR
 *   mvn install    → install to local .m2 repo
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 156: Maven Basics ===\n");
        System.out.println("Maven Project Structure:");
        System.out.println("  pom.xml - Project Object Model");
        System.out.println("  src/main/java/ - Production source code");
        System.out.println("  src/main/resources/ - Config files (YAML, properties, XML)");
        System.out.println("  src/test/java/ - Test code (JUnit, Mockito)");
        System.out.println("  target/ - Compiled .class files and JARs");
        System.out.println("\nGAV Coordinates:");
        System.out.println("  groupId: com.electronik54");
        System.out.println("  artifactId: revision_3");
        System.out.println("  version: 1.0.0");
        System.out.println("  packaging: jar");
        System.out.println("\nLifecycle commands:");
        System.out.println("  mvn clean compile package install");
    }
}