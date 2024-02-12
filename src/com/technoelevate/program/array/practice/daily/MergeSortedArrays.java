package com.technoelevate.program.array.practice.daily;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] input1 = {1, 3, 5,7};
        int[] input2 = {2, 4, 6};

        System.out.println(Arrays.toString(sort(input1, input2)));
    }

    public static int[] sort(int[] arr1, int[] arr2) {
        int[] output = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                output[k] = arr1[i];
                i++;
            } else {
                output[k] = arr2[j];
                j++;
            }
            k++;
        }

        //for remaining element of arr1
        while (i < arr1.length) {
            output[k] = arr1[i];
            i++;
            k++;
        }

        //for remaining element of arr2
        while (j < arr2.length) {
            output[k] = arr2[j];
            j++;
            k++;
        }

        return output;
    }
}
