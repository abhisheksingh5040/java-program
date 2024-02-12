package com.technoelevate.program.string.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String input  = "asdfghjkasdfghsdfghjksdfgh";
        System.out.println(duplicate(input));
    }

    public static String output(String input){
        List<String> strings = Arrays.asList(input.split(""));
        LinkedHashSet linkedHashSet = new LinkedHashSet(strings);
        return linkedHashSet.toString();
    }

    public static String duplicate(String string){
        String s = new String();
        for (int i = 0; i < string.length(); i++) {
            if(string.indexOf(string.charAt(i),i+1) == -1){
                s = s + string.charAt(i);
            }
        }
        return s;
    }
}
