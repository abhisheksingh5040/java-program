package com.technoelevate.program.string.practice.daily;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Hello";
        StringBuilder output  = new StringBuilder();
        for (int i = input.length()-1; i >= 0 ; i--) {
            output.append(input.charAt(i));
        }

        System.out.println(output.toString());
    }
}
