package com.electronik54.revision_3.corejava.ch164_interview_prep.solution;

import java.util.*;

public class Solution {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { this.val = v; }
    }

    static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    public static void main(String[] args) {
        System.out.println("=== Solution 164: Tree & Graph Problems ===\n");

        TreeNode bst = null;
        for (int v : new int[]{10, 5, 15, 3, 7, 12}) bst = insert(bst, v);

        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(bst, inorder);
        System.out.println("In-order: " + inorder);
        System.out.println("Max depth: " + maxDepth(bst));
        System.out.println("Balanced: " + isBalanced(bst));
        System.out.println("Level-order: " + levelOrder(bst));

        Map<String, List<String>> graph = new LinkedHashMap<>();
        graph.put("A", List.of("B", "C"));
        graph.put("B", List.of("A", "D"));
        graph.put("C", List.of("A", "E"));
        graph.put("D", List.of("B"));
        graph.put("E", List.of("C"));

        System.out.println("Graph DFS from A: " + graphDFS(graph, "A"));
    }

    static void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

    static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    static boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }

    static int checkBalance(TreeNode root) {
        if (root == null) return 0;
        int l = checkBalance(root.left), r = checkBalance(root.right);
        if (l == -1 || r == -1 || Math.abs(l - r) > 1) return -1;
        return 1 + Math.max(l, r);
    }

    static List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.offer(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            result.add(n.val);
            if (n.left != null) q.offer(n.left);
            if (n.right != null) q.offer(n.right);
        }
        return result;
    }

    static List<String> graphDFS(Map<String, List<String>> graph, String start) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        dfs(graph, start, visited, result);
        return result;
    }

    static void dfs(Map<String, List<String>> graph, String node, Set<String> visited, List<String> result) {
        visited.add(node);
        result.add(node);
        for (String neighbor : graph.getOrDefault(node, List.of()))
            if (!visited.contains(neighbor)) dfs(graph, neighbor, visited, result);
    }
}