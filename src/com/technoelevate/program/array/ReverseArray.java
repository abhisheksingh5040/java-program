package com.technoelevate.program.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(swapValues(input)));
    }

    public static int[] array(int[] arr){
        int[] output = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            output[j++] = arr[i];
        }
        return output;
    }

    public static int[] swapValues(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            swap(arr,i, arr.length-1-i);
        }
        return arr;
    }

    public static int[] swap(int[] arr, int index1,int index2){
        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
        return arr;
    }
}
