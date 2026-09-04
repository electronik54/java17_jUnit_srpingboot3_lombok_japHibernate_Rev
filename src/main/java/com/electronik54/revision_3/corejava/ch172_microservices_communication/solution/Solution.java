package com.electronik54.revision_3.corejava.ch172_microservices_communication.solution;

/**
 * Solution 172: Microservices Communication
 *
 * Synchronous: REST, gRPC
 * Asynchronous: Message brokers (Kafka, RabbitMQ)
 *
 * REST: HTTP/JSON, simple, stateless, caching
 * gRPC: Protocol Buffers, streaming, high performance
 * Kafka: Event streaming, durable, replayable
 * RabbitMQ: Message queuing, routing, reliable delivery
 *
 * Service Discovery: Eureka, Consul
 * Load Balancing: Spring Cloud LoadBalancer, Ribbon
 *
 * API Gateway: Spring Cloud Gateway, Zuul
 *   - Routing, filtering, rate limiting, authentication
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 172: Microservices Communication ===\n");
        System.out.println("Synchronous: REST (HTTP/JSON), gRPC (Protobuf)");
        System.out.println("Asynchronous: Kafka (streaming), RabbitMQ (queuing)");
        System.out.println("Service Discovery: Eureka, Consul");
        System.out.println("API Gateway: Spring Cloud Gateway");
    }
}