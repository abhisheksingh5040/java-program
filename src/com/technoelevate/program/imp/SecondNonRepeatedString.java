package com.technoelevate.program.imp;

public class SecondNonRepeatedString {

    public static void main(String[] args) {
        String s = "asdsdesddek";
       // System.out.println(firstRepeatingCharacter(s));
       // System.out.println(firstNonRepeatingCharacter(s));
        // System.out.println(secondRepeatingCharacter(s));
        System.out.println(nRepeatingCharacter(s,3));
    }

    public static char firstRepeatingCharacter(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length() ; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    return s.charAt(i);
                }
            }
        }
        return ' ';
    }

    public static char firstNonRepeatingCharacter(String s){
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i+1; j < s.length() ; j++) {
                if(s.charAt(i)!=s.charAt(j)){
                   count++;
                }
            }
            if(count==0){
                return s.charAt(i);
            }
        }
        return ' ';
    }

    public static char secondRepeatingCharacter(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int count1 = 0;
            for (int j = i+1; j < s.length() ; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    count1++;
                }
            }
            if(count1!=0){
                count++;
            }

            if(count==2){
                return s.charAt(i);
            }
        }
        return '-';
    }

    public static char nRepeatingCharacter(String s,int N){
        int count = 0;
        boolean[] val = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int count1 = 0;
            for (int j = i+1; j < s.length() ; j++) {
                if(s.charAt(i) == s.charAt(j) && val[j]==false){
                    val[j] = true;
                    count1++;
                }
            }
            if(count1!=0){
                count++;
            }

            if(count==N){
                return s.charAt(i);
            }
        }
        return '-';
    }

}
