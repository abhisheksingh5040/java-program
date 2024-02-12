package com.technoelevate.program.array.practice.daily;

public class LongestRepeatedSubstring {

    public static void main(String[] args) {
        String input = "abccdefg";
        String longestSubstring = getLongestSubstring(input);
        System.out.println(longestSubstring);
    }

    public static String getLongestSubstring(String str) {
        String max = "";
        String temp = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                temp = temp + str.charAt(i);
            } else {
                if (max.length() < temp.length()) {
                    temp = temp + str.charAt(i);
                    max = temp;
                }
                temp = "";
            }
        }

        return max;
    }
}
