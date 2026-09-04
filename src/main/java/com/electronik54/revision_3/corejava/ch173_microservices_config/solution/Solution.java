package com.electronik54.revision_3.corejava.ch173_microservices_config.solution;

/**
 * Solution 173: Microservices Configuration
 *
 * Spring Cloud Config Server:
 *   - Centralized configuration for all services
 *   - Git-backed or native file system
 *   - Environment-specific configs (dev, prod)
 *   - @RefreshScope for runtime config refresh
 *
 * Config sources (priority order):
 *   1. Command line arguments
 *   2. Environment variables
 *   3. Config server (remote)
 *   4. application-{profile}.yaml
 *   5. application.yaml
 *
 * Spring Cloud Bus:
 *   - Broadcasts config changes across services
 *   - Uses RabbitMQ or Kafka
 *   - POST /actuator/busrefresh to refresh all services
 *
 * HashiCorp Vault: Secret management (DB passwords, API keys)
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 173: Microservices Configuration ===\n");
        System.out.println("Spring Cloud Config Server: centralized, Git-backed");
        System.out.println("@RefreshScope for runtime refresh");
        System.out.println("Spring Cloud Bus: broadcast config changes");
        System.out.println("Vault: secure secret management");
    }
}