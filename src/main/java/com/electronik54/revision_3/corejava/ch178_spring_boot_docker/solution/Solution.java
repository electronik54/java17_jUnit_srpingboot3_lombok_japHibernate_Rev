package com.electronik54.revision_3.corejava.ch178_spring_boot_docker.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 178: Dockerizing Spring Boot ===\n");
        System.out.println("Multi-stage Dockerfile:");
        System.out.println("  # Build stage");
        System.out.println("  FROM maven:3.9-eclipse-temurin-17 AS build");
        System.out.println("  COPY . /app && cd /app && mvn package");
        System.out.println("  # Runtime stage");
        System.out.println("  FROM eclipse-temurin:17-jre-alpine");
        System.out.println("  COPY --from=build /app/target/*.jar app.jar");
        System.out.println("  EXPOSE 8080");
        System.out.println("  ENTRYPOINT [\"java\", \"-jar\", \"/app.jar\"]");
        System.out.println("\nLayered JAR: Spring Boot 2.3+ supports layered JARs for faster image builds");
    }
}