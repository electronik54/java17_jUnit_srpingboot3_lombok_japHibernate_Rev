package com.electronik54.revision_3.corejava.ch195_connection_pooling.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 195: Connection Pooling ===\n");
        System.out.println("HikariCP: Default in Spring Boot, fastest pool");
        System.out.println("Pool sizing: 2 * CPU cores + 1 (for I/O heavy)");
        System.out.println("Key config: maximumPoolSize, minimumIdle, connectionTimeout");
        System.out.println("Leak detection: leakDetectionThreshold=10000 (10s)");
        System.out.println("Monitoring: /actuator/metrics/hikaricp.connections.active");
        System.out.println("\napplication.yaml:");
        System.out.println("  spring.datasource.hikari.maximum-pool-size=10");
        System.out.println("  spring.datasource.hikari.connection-timeout=5000");
    }
}