package com.technoelevate.program.string.practice.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondMaximumOccurance {

    public static void main(String[] args) {
        String input = "abhbisheksinghzz";
        List<Character> characters = secondMaxOccurance(input);
        System.out.println(characters);
    }

    public static List<Character> secondMaxOccurance(String input) {
        List<Character> list = new ArrayList<>();
        //calculate maximum frequency
        int[] occurance = new int[26];
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < input.length(); i++) {
            int count = occurance[input.charAt(i) - 'a'];
            count++;
            occurance[input.charAt(i) - 'a'] = count;

            if (max1 < count) {
                max2 = max1;
                max1 = count;
            } else if (max2 < count && max2 != max1) {
                max2 = count;
            }
        }

        for (int i = 0; i < occurance.length; i++) {
            if(occurance[i]==max2){
                int l1 = 'a' + i;
                char value = (char) l1;
                list.add(value);
            }
        }
        return list;
    }



}
