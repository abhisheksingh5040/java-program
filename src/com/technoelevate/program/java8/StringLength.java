package com.technoelevate.program.java8;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringLength {
    public static void main(String[] args) {
        List<String> str = List.of("abc", "abcd", "qwerty", "poutyiop", null, " ");
        // String maxLength = getMaxLength(str);
        // List<String> sorted = sorted(str);
        // System.out.println(sorted);
        List<String> strings = removeNull(str);
        System.out.println(strings);
    }

    public static List<String> removeNull(List<String> string) {
        return string.stream()
                .filter(str -> str != null)
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());
    }

    public static List<Integer> getCount(List<String> string) {
        return string.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());
    }

    public static String getMaxLength(List<String> string) {
        return string.stream()
                .min((o1, o2) -> o1.length() - o2.length())
                .get();
    }

    public static List<String> sorted(List<String> string) {
        return string.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
    }
}
