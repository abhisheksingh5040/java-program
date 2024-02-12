package com.technoelevate.program.geekforgeek;

import java.util.Arrays;

/*
Move all negative numbers to beginning and positive to end with constant extra space
 */
public class Question4 {

    public static void main(String[] args) {
        int[] input = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        System.out.println(Arrays.toString(sort(input)));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
