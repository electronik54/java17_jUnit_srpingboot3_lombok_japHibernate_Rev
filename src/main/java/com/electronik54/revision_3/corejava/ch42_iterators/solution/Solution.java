package com.electronik54.revision_3.corejava.ch42_iterators.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Solution for Challenge 42: Iterators
 *
 * Demonstrates: safe removal via Iterator.remove, fail-fast behavior,
 * removeIf, and bidirectional ListIterator traversal.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Safe removal with Iterator
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println("Iterator removal: " + list);

        // 2. Fail-fast demo
        List<Integer> copy = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        try {
            for (Integer n : copy) {
                if (n % 2 == 0) {
                    copy.remove(n);              // structural change during iteration!
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("For-each + remove threw ConcurrentModificationException");
        }

        // 3. Idiomatic removal
        List<Integer> idiomatic = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        idiomatic.removeIf(n -> n % 2 == 0);
        System.out.println("removeIf: " + idiomatic);

        // 4. Bidirectional traversal
        ListIterator<Integer> lit = list.listIterator();
        System.out.print("Forward: ");
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
        System.out.print("/ Backward: ");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();
    }
}