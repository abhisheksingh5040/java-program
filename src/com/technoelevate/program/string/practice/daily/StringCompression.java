package com.technoelevate.program.string.practice.daily;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCompression {

    public static void main(String[] args) {
        String input = "aabbbcaabkk";
        System.out.println(compression(input));
    }

    public static String compression(String input) {
        StringBuilder builder = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                builder.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        //to print the last character
        builder.append(currentChar).append(count);
        return builder.toString();
    }

    //output is :  a4b4c1k2
    public static String compressionUsingJava8(String input) {
        return input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .map(entry -> entry.getKey() + String.valueOf(entry.getValue()))
            .collect(Collectors.joining());
    }

}
