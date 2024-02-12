package com.technoelevate.program.array.practice.daily.top;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        reverse(input);
        System.out.println(Arrays.toString(input));
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - 1 - i);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
