package com.technoelevate.program.recursion.college;

public class PRatioQ {

    public static void main(String[] args) {
        int p = 5;
        int q = 2;
        int sum = 1;

        //int ratio = ratio(p, q, sum);
        int ratio = pow(p, q);
        System.out.println(ratio);
    }

    public static int ratio(int p, int q, int sum) {
        //base condition
        if (q == 0) {
            return sum;
        }
        sum = sum * p;
        return ratio(p, q - 1, sum);
    }

    public static int pow(int p, int q) {
        //base condition
        if (q == 0) {
            return 1;
        }
        return p * pow(p, q - 1);
    }
}
