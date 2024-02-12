package com.technoelevate.program.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = {1,4,6,8,9,2,4,6};
        System.out.println(Arrays.toString(sorted(input)));

    }

    public static int[] sorted(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }
}
