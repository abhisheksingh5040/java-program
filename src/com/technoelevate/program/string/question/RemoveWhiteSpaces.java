package com.technoelevate.program.string.question;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String input  = "Abhishek Singh ";
        System.out.println(remove(input));
    }

    public static String remove(String input){
        String replace = input.replace("\\s ", "");
        return replace;
    }
}
