package com.technoelevate.program.array.twoPointer;

import java.util.Arrays;

public class Sort01 {

    public static void main(String[] args) {
        int[] input = {0, 0, 1, 1, 0, 0, 1, 0, 1, 1};
        System.out.println(Arrays.toString(sort(input)));
    }

    public static int[] sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }

            if (arr[right] == 1) {
                right--;
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
