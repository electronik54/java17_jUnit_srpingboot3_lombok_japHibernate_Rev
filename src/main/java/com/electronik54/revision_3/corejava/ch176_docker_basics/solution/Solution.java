package com.electronik54.revision_3.corejava.ch176_docker_basics.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 176: Docker Basics ===\n");
        System.out.println("Dockerfile: FROM openjdk:17-jdk-slim, COPY target/*.jar app.jar, ENTRYPOINT java -jar app.jar");
        System.out.println("Commands: docker build -t myapp . && docker run -p 8080:8080 myapp");
        System.out.println("Docker Compose: multi-container orchestration (app + DB + cache)");
        System.out.println("Image layers: Each instruction creates a layer; optimize by ordering stable layers first");
    }
}