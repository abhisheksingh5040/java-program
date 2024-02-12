package com.technoelevate.program.imp;

public class Question4 {

    public static void main(String[] args) {
        String a = "Abhishekabhu=i";
        System.out.println(removeDuplicate(a));
    }

    public static String removeDuplicate(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(builder.indexOf(String.valueOf(currentChar))==-1){
                builder.append(currentChar);
            }
        }
        return builder.toString();
    }
}
