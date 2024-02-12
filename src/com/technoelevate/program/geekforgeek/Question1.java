package com.technoelevate.program.geekforgeek;

import java.util.ArrayList;
import java.util.List;

/*
Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.

Note: If the array is increasing then just print the last element will be the maximum value.
 */
public class Question1 {

    public static void main(String[] args) {
        int[] input = {10, 20, 15, 2, 23, 90, 67};
        System.out.println(peakValue(input));
    }

    private static List<Integer> peakValue(int[] input) {
        List<Integer> list  = new ArrayList<>();
        for (int i = 1; i < input.length-1; i++) {
            if(input[i]>input[i-1] && input[i]>input[i+1]){
               list.add(input[i]);
            }
        }
        return list;
    }
}
