package com.technoelevate.program.string.question;

public class RemoveSpecialCharacter {

    public static void main(String[] args) {
        String input = "$ja!va$&st%ar";
        System.out.println(remove(input));
    }

    public static String remove(String input){
        char[] chars = input.toCharArray();
        String output = "";
        for (int i = 0; i < chars.length; i++) {
            int ascii = chars[i];
            if((ascii >=65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) ){
                output = output + chars[i];
            }
        }
        return output;
    }

    public static String replace(String input){
        String s = input.replaceAll("[^a-zA-Z0-9]", "");
        return s;
    }
}
