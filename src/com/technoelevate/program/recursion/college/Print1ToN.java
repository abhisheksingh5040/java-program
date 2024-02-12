package com.technoelevate.program.recursion.college;

public class Print1ToN {

    public static void main(String[] args) {
        int input = 10;
        print(input);
    }

    public static void print(int n) {
        //base condition
        if (n == 1) {
            System.out.println(n);
            return;
        }

        print(n - 1);
        System.out.println(n);
    }

}
