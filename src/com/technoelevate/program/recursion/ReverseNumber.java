package com.technoelevate.program.recursion;

public class ReverseNumber {

    public static void main(String[] args) {
        reverse(1357);
        System.out.println(sum);

        reverseViaString(1256798);
        System.out.println(rev);
    }

    static int sum = 0;
    static String rev = "";

    public static void reverse(int num){
        if(num==0){
            return ;
        }

        int rem  = num % 10;
        sum = sum * 10 + rem;
        reverse(num/10);
    }

    public static String reverseViaString(int num){
        if(num==0){
            return "";
        }
        int digit = num % 10;
        rev = rev + digit;
        return reverseViaString(num/10);
    }

}
