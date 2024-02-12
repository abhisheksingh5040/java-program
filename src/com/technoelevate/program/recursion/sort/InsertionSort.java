package com.technoelevate.program.recursion.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] input = {3,1,5,2,4};
        System.out.println(Arrays.toString(sort(input)));
    }

    public static int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]<current){
                    current = arr[j];
                }
            }
            int temp = current;
        }
        return arr;
    }
}
