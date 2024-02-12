package com.technoelevate.program.recursion.pattern;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // Input the length of the string
//        int N = scanner.nextInt();
//        scanner.nextLine(); // Consume the newline character
//
//        // Input the string
//        String inputString = scanner.nextLine().trim();
//
//        // Close the scanner
//        scanner.close();
        String inputString = "aabc";
        int trimmedLength = trim(inputString);
        System.out.println(trimmedLength);
    }

    private static int getTrimmedLength(String inputString) {
        int[] lastOccurrence = new int[26]; // Array to store the last occurrence index of each character

        for (int i = 0 ; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            lastOccurrence[currentChar - 'a'] = i;
        }

        boolean[] removed = new boolean[inputString.length()];
        int resultLength = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (!removed[i]) {
                resultLength++;
                int nextOccurrence = lastOccurrence[currentChar - 'a'];

                for (int j = i + 1; j <= nextOccurrence; j++) {
                    if(inputString.charAt(i)==inputString.charAt(j)){
                        removed[j] = true;
                        break;
                    }
                }
            }
        }

        return resultLength;
    }

    public static int getTrimmed(String inputString){
        boolean[] removed = new boolean[inputString.length()];
        int resultLength = 0;
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i+1; j < inputString.length(); j++) {
                if(!removed[i] && inputString.charAt(i)==inputString.charAt(j)){
                    removed[j]= true;
                    break;
                }
            }
            if(removed[i]==false){
                resultLength++;
            }
        }
        return resultLength;
    }

    public static int getTrimmedLengthh(String inputString) {
        boolean[] removed = new boolean[26]; // Assuming only lowercase English letters

        int resultLength = 0;
        for (int i = inputString.length() - 1; i >= 0; i--) {
            char currentChar = inputString.charAt(i);

            if (!removed[currentChar - 'a']) {
                resultLength++;
                removed[currentChar - 'a'] = true;
            }
        }

        return resultLength;
    }

    public static int trim(String inputString){
        boolean[] removed = new boolean[inputString.length()];

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i+1; j < inputString.length(); j++) {
                if(!removed[i] && inputString.charAt(i)==inputString.charAt(j)){
                    removed[j] = true;
                    break;
                }
            }
            if(!removed[i]){
                count++;
            }
        }
        return count;
    }
}
