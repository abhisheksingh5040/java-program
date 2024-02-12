package com.technoelevate.program.recursion;

public class Print1ToN {

    public static void main(String[] args) {
        print(10,1);
    }

    public static void print(int n,int a){
        if(a > n){
            return;
        }
        System.out.println(a);
        print(n,a+1);
    }
}
