package com.technoelevate.program.recursion;

public class CountNumberOfZeros {

    public static void main(String[] args) {
        int input  = 1020304050;
        System.out.println(count(0,input));
    }

    public static int count(int count,int number){
        int digit = number % 10;

        if(number==0){
            return count;
        }
        if(digit == 0){
            count++;
        }
        return count(count,number/10);
    }
}
