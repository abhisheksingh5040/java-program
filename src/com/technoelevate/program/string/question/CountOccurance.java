package com.technoelevate.program.string.question;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountOccurance {

    public static void main(String[] args) {
        String input = "aabbbc";
        String count = count(input);
        System.out.println(count);
    }

    public static String count(String str) {
        char[] chars = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }

        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            builder.append(set.getKey()).append(set.getValue());
        }

        return builder.toString();
    }
}
