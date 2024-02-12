package com.technoelevate.program.recursion.pattern;

import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String candidates = sc.nextLine().trim();


    }

    public static int getMaxDebatePairs(int N, String candidates){
       int maxPairs = 0;

        for (int i = 0; i < N-1; i++) {
            if(candidates.charAt(i)!=candidates.charAt(i+1)){
                maxPairs++;
                i++;
            }
        }
        return maxPairs;
    }

    public static int getMaxDebate(int N, String candidates){
        int maxPairs = 0;
        int i = 0;
        while ( i< N-1){
            if(candidates.charAt(i)!=candidates.charAt(i+1)){
                maxPairs++;
                i += 2;
            }else{
                i++;
            }
        }
        return maxPairs;
    }

    public static int pair(int N, String candidates){
        int maxPairs = 0;
        int i = 0;
        while(i< N-1){
            if(candidates.charAt(i)==candidates.charAt(i+1)){
                maxPairs++;
                i +=2;
            }else{
                i++;
            }
        }
        return maxPairs;
    }
}
