package com.technoelevate.program.recursion.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
         int[] input = {5, 4, 3, 2, 1};
        int[] sort = sort(input);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] arr) {
        //Base condition
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] leftSide = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightSide = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftSide, rightSide);
    }

    public static int[] merge(int[] leftSide, int[] rightSide) {
        int[] newArray = new int[leftSide.length + rightSide.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSide.length && j < rightSide.length) {
            if (leftSide[i] < rightSide[j]) {
                newArray[k] = leftSide[i];
                i++;
            } else {
                newArray[k] = rightSide[j];
                j++;
            }
            k++;
        }

        while (i < leftSide.length) {
            newArray[k] = leftSide[i];
            i++;
            k++;
        }

        while (j < rightSide.length) {
            newArray[k] = rightSide[j];
            j++;
            k++;
        }
        return newArray;
    }
}
