package com.electronik54.revision_3.lombok.ch98_lombok_advanced.solution;

/**
 * Solution for Challenge 98: Lombok Advanced
 */
public class Solution {

    public static void main(String[] args) {
        UserProfile alice = new UserProfile("Alice", 30);
        System.out.println("Original:  " + alice);

        // @With - returns a NEW copy with age 31
        UserProfile alice31 = alice.withAge(31);
        System.out.println("With age:  " + alice31);

        // @Accessors(chain=true) - setters return this for chaining
        UserProfile bob = new UserProfile("x", 0).setName("Bob").setAge(30);
        System.out.println("Fluent:    " + bob);

        // @SneakyThrows + @Cleanup
        DemoResource demo = new DemoResource();
        demo.closeResource();  // internally try/catches the SneakyThrows IOException
        demo.writeWithCleanup();
    }
}