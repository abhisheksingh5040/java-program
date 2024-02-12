package com.technoelevate.program.recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int output = fibo(10);
        System.out.println(output);
    }

    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
