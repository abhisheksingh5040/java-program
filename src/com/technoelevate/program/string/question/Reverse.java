package com.technoelevate.program.string.question;

public class Reverse {

    public static void main(String[] args) {
        String input = "Abhishek";
        System.out.println(reverse(input));
    }

    public static String reverse(String input){
        char[] chars = input.toCharArray();
        String reverse = "";
        for (int i = chars.length-1; i >=0 ; i--) {
            reverse = reverse + chars[i];
        }

        return reverse;
    }

}
