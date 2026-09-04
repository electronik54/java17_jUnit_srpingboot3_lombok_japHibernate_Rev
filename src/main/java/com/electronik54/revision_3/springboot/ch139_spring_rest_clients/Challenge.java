package com.electronik54.revision_3.springboot.ch139_spring_rest_clients;

/**
 * Challenge 139: Spring REST Clients
 * 
 * Challenge Statement:
 * Demonstrate Spring Boot's HTTP client options for consuming REST APIs:
 * - RestTemplate (traditional blocking client)
 * - WebClient (reactive non-blocking client from Spring WebFlux)
 * - RestClient (Spring Boot 3.2+ fluent client)
 * Create a client that consumes JSONPlaceholder API (https://jsonplaceholder.typicode.com)
 * to fetch posts and comments. Show error handling and response mapping.
 * 
 * Hint:
 * - RestTemplate with RestTemplateBuilder for configuration
 * - WebClient with webflux dependency (or mock it)
 * - ResponseEntity for response + status handling
 * - @Bean to create RestTemplate and WebClient instances
 * - Exception handling with ResponseErrorHandler
 * 
 * Expected Output (Solution):
 * Fetching posts from JSONPlaceholder API...
 * Post #1: sunt aut facere repellat provident occaecati excepturi optio reprehenderit
 * Post #2: qui est esse
 * ...
 * Status: 200 OK
 */
public class Challenge {

}