package com.technoelevate.program.recursion.college;

public class SumWithAlternateSigh {

    public static void main(String[] args) {
        int input = 10;
        int sum = sum(input);
        System.out.println(sum);
    }

    public static int sum(int input) {
        //base condition
        if (input == 0) {
            return input;
        }

        if (input % 2 == 0) {
            return sum(input - 1) - input;
        } else {
            return sum(input - 1) + input;
        }
    }
}