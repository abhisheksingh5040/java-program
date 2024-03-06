package com.technoelevate.program.dsa.stack;

import java.util.Stack;

public class InsertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> inputStack = new Stack<>();
        int index = 10;
        int data = 10;
        inputStack.push(1);
        inputStack.push(2);
        inputStack.push(3);
        inputStack.push(4);
        inputStack.push(5);

        insertAtIndex(inputStack,index,data);
    }

    public static void insertAtIndex(Stack<Integer> stack, int index, int data) {

        if (index > stack.size()) {
            System.out.println("cannot be inserted");
            return;
        }

        Stack<Integer> tempStack = new Stack<>();
        while (stack.size() > index) {
            tempStack.push(stack.pop());
        }

        //add data at index
        stack.push(data);

        while (tempStack.size() > 0) {
            stack.push(tempStack.pop());
        }
        System.out.println(stack);
    }
}
