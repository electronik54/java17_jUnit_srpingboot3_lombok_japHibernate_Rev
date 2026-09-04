package com.electronik54.revision_3.corejava.ch235_connection_pooling.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 235: Advanced Connection Pooling ===\n");
        System.out.println("HikariCP tuning: maximumPoolSize=10, minimumIdle=2, connectionTimeout=5000");
        System.out.println("Pool sizing: 2 * (CPU cores) + 1 (I/O bound)");
        System.out.println("  Too small: request queuing, timeout");
        System.out.println("  Too large: context switching, DB connection overhead");
        System.out.println("Leak detection: leakDetectionThreshold=10000 (logs stack trace)");
        System.out.println("Multi-tenancy: Separate pool per tenant (maxTenantPoolSize)");
        System.out.println("Monitoring: /actuator/health, /actuator/metrics/hikaricp.*");
    }
}