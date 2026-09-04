package com.electronik54.revision_3.springboot.ch126_spring_annotations_advanced;

/**
 * Challenge 126: Spring Annotations - Advanced (@Qualifier, @Primary, @Scope)
 *
 * Problem:
 * When multiple beans of the same type exist, Spring needs help resolving
 * which to inject. Create two MessageService beans (EmailMessageService,
 * SmsMessageService). Inject @Primary's qualifier. Show @Qualifier selecting
 * a specific one, and demonstrate @Scope as note.
 *
 * Hint:
 * - @Primary marks the default candidate when several beans match a type
 * - @Qualifier("beanName") overrides @Primary and selects an explicit bean
 * - Bean scopes: singleton (default) vs prototype (new instance per injection)
 *
 * Expected Output (console via test/context):
 * Primary service: Sending via Email
 * Qualified service: Sending via SMS
 * SmsMessageService is a prototype bean (two injections differ or same depending on scope)
 *
 * TODO:
 * 1. Create MessageService interface + Email/Sms implementations
 * 2. Mark Email with @Primary; both named beans
 * 3. Create a Client with @Qualifier injection for Sms
 * 4. Verify with a Spring context wiring
 *
 * Refer to solution package for the wiring demo.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 126: Spring Advanced Annotations ===");
    }
}