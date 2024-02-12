package com.technoelevate.program.string.question;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountOccuranceSequence {

    public static void main(String[] args) {
        String input = "aabbbccbbaach";
        String count = count(input);
        System.out.println(count);
    }

    public static String count(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    builder.append(str.charAt(i)).append(count);
                    i = j - 1;
                    break;
                }
            }
        }

        return builder.toString();
    }

}
