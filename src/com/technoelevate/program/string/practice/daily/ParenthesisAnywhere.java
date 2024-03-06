package com.technoelevate.program.string.practice.daily;

import java.util.Stack;

public class ParenthesisAnywhere {
    public static void main(String[] args) {
        String input = "{([}])";
        System.out.println(checkBalance(input));
    }

    public static String checkBalance(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if (!isMatching(stack, ch)) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    private static boolean isMatching(Stack<Character> stack, Character ch) {
        for (Character c : stack) {
            if ((ch == '}' && c == '{') || (ch == ')' && c == '(') || (ch == ']' && c == '[')) {
                return true;
            }
        }
        return false;
    }

//    private static boolean isMatching(Stack<Character> stack, Character ch) {
//        if (stack.isEmpty()) {
//            return false; // If the stack is empty, there is no matching opening parenthesis
//        }
//        char open = stack.pop(); // Get the topmost opening parenthesis
//        if ((ch == '}' && open == '{') || (ch == ')' && open == '(') || (ch == ']' && open == '[')) {
//            return true; // If the current closing parenthesis matches the topmost opening parenthesis, return true
//        } else {
//            return isMatching(stack, ch); // Recursively check for matches with the remaining elements on the stack
//        }
//    }

}
