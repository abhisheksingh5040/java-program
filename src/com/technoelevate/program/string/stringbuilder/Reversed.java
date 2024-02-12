package com.technoelevate.program.string.stringbuilder;

public class Reversed {
    public static void main(String[] args) {
        System.out.println(insert());
    }

    public static String reverse(String input){
        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        return builder.toString();
    }

    public static String appendToCode(String input){
        StringBuilder builder = new StringBuilder(input);
        builder.appendCodePoint(44);
        return builder.toString();
    }

    public static String insert(){
        StringBuilder builder = new StringBuilder();
        builder.append("Abhishek").append(" ").append("Singh");
        builder.insert(9,"Chandrabhushan ");
        return builder.toString();
    }



}
