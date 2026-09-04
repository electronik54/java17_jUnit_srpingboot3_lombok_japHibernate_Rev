package com.electronik54.revision_3.lombok.ch93_lombok_basics.solution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Immutable-style data holder built with Lombok.
 * @Data gives getters, setters, toString, equals, hashCode.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String email;
}