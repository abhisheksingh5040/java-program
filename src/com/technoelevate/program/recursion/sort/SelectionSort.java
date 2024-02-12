package com.technoelevate.program.recursion.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = {3,1,5,2,4};
        System.out.println(Arrays.toString(sort1(input)));
    }

    public static int[] sort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            boolean swap = false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[smallest]){
                    smallest = j;
                    swap = true;
                }
            }
            if(swap){
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }
        return arr;
    }
}
