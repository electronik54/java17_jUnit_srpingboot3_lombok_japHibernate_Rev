package com.electronik54.revision_3.corejava.ch39_queue_deque;

/**
 * Challenge 39: Queue and Deque
 *
 * Problem:
 * Use PriorityQueue (min-heap by default) to process tasks by priority,
 * and ArrayDeque as both a stack (push/pop) and a queue (offer/poll).
 *
 * Hint:
 * - PriorityQueue orders by natural order or a Comparator - NOT FIFO
 * - Deque = double-ended queue: offerFirst/offerLast, pollFirst/pollLast
 * - As a stack: push()/pop() operate on the HEAD of ArrayDeque
 * - Prefer offer/poll (return null/false) over add/remove (throw) in production
 *
 * Expected Output:
 * Queue order: [A, B, C]
 * Stack pops: C, B, A
 * Priority order: [low, medium, high] (natural String order)
 *
 * TODO:
 * 1. Queue<String>: offer A, B, C; poll twice printing each
 * 2. ArrayDeque as stack: push A, B, C; pop all printing each
 * 3. PriorityQueue with custom Comparator to serve HIGH first
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 39: Queue and Deque ===");
    }
}