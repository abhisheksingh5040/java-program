package com.technoelevate.program.string.practice.daily;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String input = "abccadcbb";
        System.out.println(longestSubString(input));
    }

    public static int longestSubString(String input) {
        int longestStringCount = 0;
        String longestString = "";
        Map<Character, Integer> map = new LinkedHashMap();

        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.getOrDefault(input.charAt(i),0));
            } else {
                map.clear();
            }
            if (longestStringCount < map.size()) {
                longestStringCount = map.size();
                longestString = map.keySet().toString();
            }
        }
        System.out.println(longestString);
        return longestStringCount;
    }

}