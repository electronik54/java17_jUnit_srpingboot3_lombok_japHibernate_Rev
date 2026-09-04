package com.electronik54.revision_3.corejava.ch45_type_erasure.solution;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Solution for Challenge 45: Type Erasure
 *
 * Demonstrates: erasure at runtime, what you cannot do with generics,
 * and where generic metadata still survives (reflections on declarations).
 */
public class Solution {

    private List<String> genericField;

    public static void main(String[] args) throws Exception {
        List<String> strings = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();

        // 1. One class at runtime
        System.out.println("Same runtime class: " + (strings.getClass() == ints.getClass()));
        System.out.println("Raw class name: " + strings.getClass().getName());

        // 2. What you CANNOT do (all compile errors - kept as comments):
        // if (strings instanceof List<String>) {}   // illegal - only unbounded wildcard allowed
        // T t = new T();                            // illegal in a generic class
        // T[] arr = new T[10];                      // illegal
        System.out.println("Runtime type parameter: erased (raw List)");

        // 3. Declarations DO keep generic info in bytecode metadata
        Field field = Solution.class.getDeclaredField("genericField");
        Type type = field.getGenericType();
        System.out.println("Generic field type survives: " + type.getTypeName());
        if (type instanceof ParameterizedType pt) {
            System.out.println("Raw type: " + pt.getRawType() + ", argument: " + pt.getActualTypeArguments()[0]);
        }
    }
}