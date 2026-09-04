package com.electronik54.revision_3.lombok.ch99_lombok_val_var.solution;

import lombok.val;

/**
 * Solution for Challenge 99: Lombok val vs Java var
 *
 * Note: Lombok's own @var cannot be used as a normal import because 'var'
 * is a restricted type name in Java 10+. This project therefore compares
 * Lombok @val (final, immutable) with Java's native var (mutable).
 */
public class Solution {

    public static void main(String[] args) {
        // Lombok @val -> final, immutable inferred type
        val value = 10;
        System.out.println("val value = " + value + " (int, final)");

        // Java native var -> mutable inferred type
        var count = 5;
        count++; // OK, var is mutable
        System.out.println("var count = " + count + " (int, mutable)");

        var demo = new InferenceDemo();
        System.out.println("var name = " + demo.getClass().getSimpleName());
    }
}