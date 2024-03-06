package com.technoelevate.program.dsa.stack.implementation;

public class LinkedListImplementation {

    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class CustomLinkedList {

        private Node head;
        private Node tail;
        int size = 0;

        public void push(int data) {
            Node node = new Node(data);
            if (head == null) {
                node.next = head;
                head = node;
                tail = head;
                size++;
            } else {
                node.next = tail;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                System.out.print(temp.data + " ");
            }
        }

        public int pop() {
            int data = head.data;
            head = head.next;
            return data;
        }

        public int peek() {
            int data = head.data;
            return data;
        }

        public static void main(String[] args) {
            CustomLinkedList list = new CustomLinkedList();
            list.push(1);
            // list.display();
        }
    }

}
