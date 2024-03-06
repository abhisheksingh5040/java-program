package com.technoelevate.program.dsa.stack;

import java.util.Stack;

public class RemoveFromIndex {

    public static void main(String[] args) {
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(1);
        inputStack.push(2);
        inputStack.push(3);
        inputStack.push(4);
        inputStack.push(5);

        delete(inputStack, 4);
        System.out.println(inputStack);
    }

    //stack also works on pass by reference
    public static void delete(Stack<Integer> stack, int index) {
        if (stack.isEmpty()) {
            return;
        }
        Integer pop = stack.pop();
        delete(stack, index);
        stack.push(pop);
        if (stack.size() - 1 == index) {
            stack.pop();
        }
    }
}
