package com.electronik54.revision_3.corejava.ch39_queue_deque.solution;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Solution for Challenge 39: Queue and Deque
 *
 * Demonstrates: FIFO queue, LIFO stack via ArrayDeque, and
 * PriorityQueue ordering with a Comparator.
 */
public class Solution {

    public static void main(String[] args) {
        // FIFO
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.print("Queue order: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

        // LIFO (stack)
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.print("Stack pops: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // PriorityQueue with reversed comparator (HIGH first)
        PriorityQueue<String> pq = new PriorityQueue<>((x, y) -> y.compareTo(x));
        pq.offer("low");
        pq.offer("high");
        pq.offer("medium");
        System.out.print("Priority order (HIGH first): ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }
}