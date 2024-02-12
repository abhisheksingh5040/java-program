package com.technoelevate.program.geekforgeek;

import java.util.Arrays;

/*
Array reverse or reverse a array means changing the position of each number of the given array to its opposite position from end, i.e. if a number is at position 1 then its new position will be Array.length, similarly if a number is at position 2 then its new position will be Array.length – 1, and so on.
 */
public class Question3 {

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2};

        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr,i,arr.length-1-i);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
