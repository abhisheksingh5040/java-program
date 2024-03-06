package com.technoelevate.program.dsa.stack;

import java.util.Stack;

public class PrintDataAsPerIndex {
    public static void main(String[] args) {
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(1);
        inputStack.push(2);
        inputStack.push(3);
        inputStack.push(4);
        inputStack.push(5);

        print(inputStack);
        System.out.println(inputStack);
    }

    //stack also works on pass by reference
    public static void print(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Integer pop = stack.pop();
        print(stack);
        stack.push(pop);
    }
}
