package com.technoelevate.program.recursion;

public class Print1ToNAndNTo1 {

    public static void main(String[] args) {
        print(5);
    }

    private static void print(int n) {
        //Base condition
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
}
