package com.technoelevate.program.string.practice.daily;

public class PalindromeCheck {

    public static void main(String[] args) {
        String input = "Madam";

        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String input){
        for (int i = 0; i < input.length()/2; i++) {
            if(input.toLowerCase().charAt(i)!=input.toLowerCase().charAt(input.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
