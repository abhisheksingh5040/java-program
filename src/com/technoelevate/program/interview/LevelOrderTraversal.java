package com.technoelevate.program.interview;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node {
        int data;
        Node[] child;

        Node(int x) {
            data = x;
            child = new Node[5]; // Assuming each node has at most 5 children
        }
    }

    static void printLevelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            sb.append(node.data).append(" ");

            for (Node child : node.child) {
                if (child != null)
                    queue.add(child);
            }
        }

        // Printing the level order traversal
        System.out.println("Level order: " + sb.toString().trim());
    }

    public static void main(String[] args) {
        // Constructing the tree
        Node root = new Node(1);
        root.child[0] = new Node(2);
        root.child[1] = new Node(3);
        root.child[2] = new Node(4);
        root.child[0].child[0] = new Node(5);
        root.child[0].child[1] = new Node(6);

        // Printing level order traversal
        printLevelOrder(root);
    }
}
