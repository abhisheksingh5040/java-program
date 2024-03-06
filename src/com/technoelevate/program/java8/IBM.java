package com.technoelevate.program.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IBM {
    public static void main(String[] args) {
        String[] arr = {"oracle", "well", "honey", "done"};
        String input = "wellhoneydone";

        String collect = Arrays.stream(arr).filter(str -> input.contains(str))
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
