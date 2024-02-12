package com.technoelevate.program.recursion.college;

public class Factorial {
    public static void main(String[] args) {
        int input = 5;
        System.out.println(fact(input));
    }

    public static int fact(int input) {
        //base condition
        if (input == 0 || input == 1) {
            return 1;
        }

        return input * fact(input - 1);
    }
}
