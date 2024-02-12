package com.technoelevate.program.recursion.college;

public class PrintNTo1 {

    public static void main(String[] args) {
        int input = 5;
        print(input);
    }

    public static void print(int input) {
        //base condition
        if (input == 0) {
            return;
        }
        System.out.println(input);
        print(--input);
    }
}
