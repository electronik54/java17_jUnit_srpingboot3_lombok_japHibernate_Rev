package com.electronik54.revision_3.corejava.ch159_gradle_basics.solution;

/**
 * Solution 159: Gradle Basics
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 159: Gradle Basics ===\n");
        System.out.println("Gradle vs Maven Comparison:");
        System.out.println("  Aspect        | Maven              | Gradle");
        System.out.println("  Config file  | pom.xml (XML)      | build.gradle(.kts)");
        System.out.println("  DSL          | XML (verbose)      | Groovy/Kotlin (concise)");
        System.out.println("  Build model  | Lifecycle phases   | Task DAG");
        System.out.println("  Performance  | Full builds        | Incremental (cached)");
        System.out.println("  Wrapper      | mvnw.cmd           | gradlew.bat");
        System.out.println("  Dependency   | Pom-driven         | Configuration-driven");
        System.out.println("\nSample build.gradle.kts:");
        System.out.println("  plugins { id('org.springframework.boot') version '3.2.0' }");
        System.out.println("  dependencies { implementation('org.springframework.boot:spring-boot-starter-web') }");
        System.out.println("  tasks.test { useJUnitPlatform() }");
    }
}