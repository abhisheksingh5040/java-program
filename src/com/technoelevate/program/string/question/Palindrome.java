package com.technoelevate.program.string.question;

public class Palindrome {

    public static void main(String[] args) {
        String input  = "Madam";
        System.out.println(isPalindrome(input));
    }

    public static String isPalindrome(String input){
        String[] split = input.split("");
        for (int i = 0; i < (split.length-1)/2; i++) {
            if(!split[i].equalsIgnoreCase(split[split.length-1-i])){
                return "String is not palindrome";
            }
        }
        return "String is palindrome";
    }
}
