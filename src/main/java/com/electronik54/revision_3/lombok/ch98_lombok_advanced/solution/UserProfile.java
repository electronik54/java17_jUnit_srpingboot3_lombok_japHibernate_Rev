package com.electronik54.revision_3.lombok.ch98_lombok_advanced.solution;

import lombok.experimental.Accessors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.With;

/**
 * @With adds withName(...)/withAge(...) copy methods.
 * @Accessors(chain = true) makes setters return this for chaining.
 * @Setter/@Getter are still required - @Accessors only modifies them.
 */
@AllArgsConstructor
@ToString
@Getter
@Setter
@Accessors(chain = true)
public class UserProfile {
    @With
    private String name;
    @With
    private int age;
}