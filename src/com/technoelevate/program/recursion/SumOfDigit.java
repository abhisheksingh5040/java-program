package com.technoelevate.program.recursion;

public class SumOfDigit {

    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int num){
        //Base condition
        if(num==0||num==1){
            return num;
        }

        return num + sum(num-1);
    }
}
