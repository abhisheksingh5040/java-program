package com.technoelevate.program.recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        //Base Condition
        if(n <= 0)
            return;
        System.out.println(n);
        print(n-1);
    }
}
