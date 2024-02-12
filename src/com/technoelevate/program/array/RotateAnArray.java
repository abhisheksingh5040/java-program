package com.technoelevate.program.array;

import java.util.Arrays;

public class RotateAnArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(rotate(input, 2)));
    }

    public static int[] rotateRightSide(int[] arr, int k) {
        int[] output = new int[arr.length];
        int n = arr.length;
        int j = 0;
        //last one
        for (int i = n - k; i < n; i++) {
            output[j++] = arr[i];
        }

        //first one
        for (int i = 0; i < n - k; i++) {
            output[j++] = arr[i];
        }
        return output;
    }

    public static int[] rotateLeftSide(int[] arr, int k) {
        int[] output = new int[arr.length];
        int n = arr.length;
        int j = 0;

        //first one
        for (int i = k; i < n; i++) {
            output[j++] = arr[i];
        }

        //last one
        for (int i = 0; i < k; i++) {
            output[j++] = arr[i];
        }
        return output;
    }

    //without using extra space
    public static int[] rotate(int[] arr, int k) {
        //first half
        // rotateFromIndex(arr,0, k-1);

        //second half
        rotateFromIndex(arr, k, arr.length - 1);

        //Rotate Entire
        //rotateFromIndex(arr,0, arr.length-1);

        return arr;
    }

    public static void rotateFromIndex(int[] arr, int fromIndex, int toIndex) {
        int temp = toIndex - fromIndex;
        for (int i = fromIndex; i < temp / 2; i++) {
            arr[i] = arr[i] + arr[toIndex - i];
            arr[toIndex - i] = arr[i] - arr[toIndex - i];
            arr[i] = arr[i] - arr[toIndex - i];
        }
    }
}
