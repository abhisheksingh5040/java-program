package com.technoelevate.program.string.practice.daily;

import java.util.Stack;

public class Parenthesis {

    public static void main(String[] args) {
        String input = "{([])}";
        System.out.println(checkBalance(input));
    }

    public static String checkBalance(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || !isMatching(stack.pop(), ch)) {
                    return "NO";
                }
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }
        return "YES";
    }

    private static boolean isMatching(Character open, Character close) {
        return (open == '{' && close == '}') || (open == '(' && close == ')') || (open == '[' && close == ']');
    }
}
