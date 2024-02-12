package com.technoelevate.program.string.question;

import java.util.HashMap;
import java.util.Map;

public class LeastOccuranceDuplicateCharacter {
    public static void main(String[] args) {
        String input = "MALAYALAM";
        int leastOccurrences = input.length();

        Map<Character,Integer> map = new HashMap<>();

        //count the occurrence of each character

        for (char ch : input.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        //find the least occurrence
        for (int count : map.values()) {
        }
    }
}
