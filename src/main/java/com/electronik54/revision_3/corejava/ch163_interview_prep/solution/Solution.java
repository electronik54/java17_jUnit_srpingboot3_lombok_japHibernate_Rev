package com.electronik54.revision_3.corejava.ch163_interview_prep.solution;

import java.util.*;

public class Solution {
    static class Node {
        int val; Node next;
        Node(int v) { this.val = v; }
        Node(int v, Node n) { this.val = v; this.next = n; }
    }

    public static void main(String[] args) {
        System.out.println("=== Solution 163: Linked List Problems ===\n");

        Node list = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));

        System.out.print("Original: "); print(list);
        System.out.print("Reversed: "); print(reverse(list));

        Node list2 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
        System.out.println("Middle: " + middle(list2).val);

        Node noCycle = new Node(1, new Node(2, new Node(3)));
        System.out.println("Has cycle: " + hasCycle(noCycle));

        Node a = new Node(1, new Node(3, new Node(5)));
        Node b = new Node(2, new Node(4, new Node(6)));
        System.out.print("Merged sorted: "); print(merge(a, b));

        Node list3 = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))));
        System.out.println("2nd from end: " + nthFromEnd(list3, 2).val);
    }

    static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) { Node next = curr.next; curr.next = prev; prev = curr; curr = next; }
        return prev;
    }

    static Node middle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
        return slow;
    }

    static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; if (slow == fast) return true; }
        return false;
    }

    static Node merge(Node a, Node b) {
        Node dummy = new Node(0), curr = dummy;
        while (a != null && b != null) {
            if (a.val < b.val) { curr.next = a; a = a.next; } else { curr.next = b; b = b.next; }
            curr = curr.next;
        }
        curr.next = a != null ? a : b;
        return dummy.next;
    }

    static Node nthFromEnd(Node head, int n) {
        Node fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        while (fast != null) { slow = slow.next; fast = fast.next; }
        return slow;
    }

    static void print(Node head) {
        List<String> vals = new ArrayList<>();
        while (head != null) { vals.add(String.valueOf(head.val)); head = head.next; }
        System.out.println(String.join("→", vals));
    }
}