package com.technoelevate.program.dsa.stack;

import java.util.Stack;

public class MoveStackInSameWay {

    public static void main(String[] args) {
        Stack<Integer> inputStack = new Stack<>();
        inputStack.push(1);
        inputStack.push(2);
        inputStack.push(3);
        inputStack.push(4);
        inputStack.push(5);

        //5->4->3->2->1
        Stack<Integer> tempStack = new Stack<>();
        while (inputStack.size() > 0) {
            tempStack.push(inputStack.pop());
        }

        //1->2->3->4->5
        Stack<Integer> stack = new Stack<>();
        while (tempStack.size() > 0) {
            stack.push(tempStack.pop());
        }

        System.out.println(stack);
    }
}
