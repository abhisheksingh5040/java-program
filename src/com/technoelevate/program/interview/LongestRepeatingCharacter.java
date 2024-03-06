package com.technoelevate.program.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestRepeatingCharacter {
    public static void main(String[] args) {
        String input = "abcaazcbcccddddddd";
        char character = getLongestRepeatingCharacter(input);
        System.out.println(character);
    }

    public static char getLongestRepeatingCharacter(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int max = 0;
        char character = ' ';

        // Iterate through the string, including the last character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (map.containsKey(str.charAt(i))) {
                map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            }
            // Update max and character if current character count is greater
            if (map.get(currentChar) > max) {
                max = map.get(currentChar);
                character = currentChar;
            }
        }
        return character;
    }
}
