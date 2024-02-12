package com.technoelevate.program.imp;

public class Question5 {
    public static void main(String[] args) {
       String str = "a&&&01";
        System.out.println(removeSpecialCharacter(str));
    }

    public static String removeSpecialCharacter(String str){
        String s = str.replaceAll("[^A-Za-z0-9]", "");
        return s;
    }
}
