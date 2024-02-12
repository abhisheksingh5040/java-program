package com.technoelevate.program.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n){
        //Base Condition
        if(n==0|| n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
