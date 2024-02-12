package com.technoelevate.program.array.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveRepeatedCharacter {

    public static void main(String[] args) {
        String input = "asdfgghhjjkklla";
        String s = removeDuplicates(input);
        System.out.println(s);
    }

    public static String removeDuplicates(String str) {
        return str.chars()
//            .mapToObj(c->(char)c)
//            .map(String::valueOf)
            .mapToObj(Character::toString)
            .distinct()
            .collect(Collectors.joining());
    }

    public static String removeDuplicatesUsingSet(String str) {
        StringBuilder builder = new StringBuilder();
        char[] chars = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (set.add(chars[i])) {
                builder.append(chars[i]);
            }
        }
        return builder.toString();
    }

    public static String removeDuplicatesWithoutUsingSet(String str) {
        StringBuilder builder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                builder.append(chars[i]);
            }
        }
        return builder.toString();
    }
}
