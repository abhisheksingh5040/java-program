package com.technoelevate.program.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringAccordingToLength {
    public static void main(String[] args) {
        String[] str = {"abc", "amcd", "qwert", "as", "a"};
        List<String> sort = sort(str);
        System.out.println(sort);
    }

    public static List<String> sort(String[] str) {
        return Arrays.stream(str).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
    }
}
