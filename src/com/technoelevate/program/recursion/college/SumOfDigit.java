package com.technoelevate.program.recursion.college;

public class SumOfDigit {

    public static void main(String[] args) {
        int input  = 123456;
        int sum = sumOfDigit(input);
        System.out.println(sum);
    }

    public static int sumOfDigit(int input) {
        //base condition
        if (input <= 9 && input >= 0) {
            return input;
        }

        return sumOfDigit(input / 10) + input % 10;
    }
}
