package com.technoelevate.program.array.twoPointer;

import java.util.Arrays;

public class EvenSorting {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(sort(input)));
    }

    public static int[] sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int leftVal = arr[left] % 2;
            int rightVal = arr[right] % 2;
            if (leftVal != 0 && rightVal == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (leftVal == 0) {
                left++;
            }

            if (rightVal != 0) {
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
