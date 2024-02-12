package com.technoelevate.program.string.question;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        System.out.println(sortByChars("Abhishek"));
    }

    public static String sort(String input){
        StringBuilder builder = new StringBuilder();
        Arrays.stream(input.split("")).sorted().forEach(a->builder.append(a));
        return builder.toString();
    }

    public static String sortByChars(String input){
        StringBuilder builder = new StringBuilder();
        input.chars().boxed().sorted().forEach(a->builder.append((a)));
        return builder.toString();
    }
}
