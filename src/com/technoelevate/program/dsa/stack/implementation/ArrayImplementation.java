package com.technoelevate.program.dsa.stack.implementation;

public class ArrayImplementation {
    public static class Stack {
        private int[] arr = new int[5];
        private int index = 0;

        public void push(int data) {
            arr[index] = data;
            index++;
        }

        public int peek() {
            if (index == 0) {
                System.out.println("Stack is Empty!!");
                return -1;
            }
            return arr[index - 1];
        }

        public int pop() {
            if (index == 0) {
                System.out.println("Stack is Empty!!");
                return -1;
            }

            int data = arr[index - 1];
            arr[index - 1] = 0;
            index--;
            return data;
        }

        public void display() {
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public int size() {
            return index;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.display();
        System.out.println();
        System.out.println(stack.size());
    }
}
