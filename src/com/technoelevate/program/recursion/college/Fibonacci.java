package com.technoelevate.program.recursion.college;

public class Fibonacci {

    public static void main(String[] args) {
        int input = 4;
        int fibonacci = fibonacci(input);
        System.out.println(fibonacci);
    }

    public static int fibonacci(int input) {
        //base condition
        if (input == 0 || input == 1) {
            return input;
        }

        return fibonacci(input - 1) + fibonacci(input - 2);
    }
}

