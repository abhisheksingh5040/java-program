package com.technoelevate.program.recursion.college;

public class MultipleOfNum {

    public static void main(String[] args) {
        int num = 12;
        int k = 10;
        multiples(num, k);
    }

    public static void multiples(int num, int k) {
        //base condition
        if (k == 0) {
            return;
        }
        multiples(num, k - 1);
        //self work
        System.out.print(num * k + "  ");
    }
}
