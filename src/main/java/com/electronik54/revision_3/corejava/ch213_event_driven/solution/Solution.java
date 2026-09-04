package com.electronik54.revision_3.corejava.ch213_event_driven.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 213: Event-Driven Architecture ===\n");
        System.out.println("Event: Something that happened (OrderPlaced, PaymentReceived)");
        System.out.println("Producer: Publishes events to broker (no knowledge of consumers)");
        System.out.println("Consumer: Subscribes to events and processes them");
        System.out.println("Broker: Kafka, RabbitMQ, AWS SQS/SNS");
        System.out.println("Kafka: Durable, replayable, high throughput, partitioning");
        System.out.println("RabbitMQ: Routing, flexible, lower latency");
        System.out.println("Eventual consistency: System becomes consistent over time");
    }
}