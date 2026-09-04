package com.electronik54.revision_3.corejava.ch218_spring_boot_docker.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 218: Dockerizing Spring Boot (Advanced) ===\n");
        System.out.println("Layered JAR: Spring Boot 2.3+ supports layered JARs");
        System.out.println("  Layers: dependencies, spring-boot-loader, snapshot-dependencies, application");
        System.out.println("  Benefit: Only changed layers invalidate Docker cache");
        System.out.println("Multi-stage build:");
        System.out.println("  Stage 1 (build): maven:3.9-eclipse-temurin-17, mvn package");
        System.out.println("  Stage 2 (runtime): eclipse-temurin:17-jre-alpine, COPY --from=build");
        System.out.println("Docker Compose: app + postgres + redis in one command");
    }
}