package com.technoelevate.program.string.stringbuilder;

public class Demo1 {

    public static void main(String[] args){
        String[] input  = {"Abhishek","Singh"};
        System.out.println(name(input));
    }

    public static String name(String[] input){
        StringBuilder builder = new StringBuilder();
        StringBuilder append = builder.append(input[0]).append(" ").append(input[1]);
        return append.toString();
    }
}
