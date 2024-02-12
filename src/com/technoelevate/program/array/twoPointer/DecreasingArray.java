package com.technoelevate.program.array.twoPointer;

import java.util.Arrays;

public class DecreasingArray {

    public static void main(String[] args) {
        int[] input = {-10, -5, -2, 1, 3, 6, 9};
        int[] ints = sortInDecreasingOrder(input);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] sortInDecreasingOrder(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int[] output = new int[arr.length];
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                output[k++] = arr[left] * arr[left];
                left++;
            } else {
                output[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return output;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
