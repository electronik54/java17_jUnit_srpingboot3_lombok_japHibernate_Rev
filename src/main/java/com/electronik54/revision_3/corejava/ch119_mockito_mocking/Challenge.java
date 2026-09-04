package com.electronik54.revision_3.corejava.ch119_mockito_mocking;

/**
 * Challenge 119: Mockito Mocking
 *
 * Problem:
 * Write a unit test for an OrderService that depends on an EmailService and
 * a PaymentService. Use Mockito's @Mock and @InjectMocks to mock the
 * dependencies, stub PaymentService.charge() with when().thenReturn(), and
 * verify() that email is sent.
 *
 * Hint:
 * - @Mock creates a mock; @InjectMocks injects it into the SUT
 * - when(mock.method()).thenReturn(value) stubs behavior
 * - verify(mock).method(...) asserts the method was called
 * - Pure unit test = no real DB / network
 *
 * Expected Output (test run):
 * Mockito verifies payment + email interactions, no real services used
 *
 * TODO:
 * 1. Create EmailService and PaymentService (interfaces/classes) in solution
 * 2. Create OrderService depending on them
 * 3. Create OrderServiceTest under src/test/java using Mockito
 * 4. Run mvn -Dtest=OrderServiceTest test
 *
 * The solution package holds the real services + OrderService. The TEST lives
 * under src/test/java.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 119: Mockito Mocking ===");
    }
}