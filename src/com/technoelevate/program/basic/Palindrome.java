package com.technoelevate.program.basic;

public class Palindrome {

    public static void main(String[] args) {
        int input = 1221;
        int reverse = reverse(input);
        if (reverse == input) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }

    public static int reverse(int num) {
        if (num % 10 == num) {
            return num;
        }

        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum * 10 + digit;
            num = num / 10;
        }
        return sum;
    }
}
