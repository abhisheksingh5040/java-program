package com.technoelevate.program.array.practice.daily.top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 3, 4, 5, 6, 6, 6, 7, 8, 8, 9};

//        int length = getLength(input);
//        System.out.println(length);

//        List<Integer> list = removeDuplicates(input);
//        System.out.println(list);
    }

    public static int getLength(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return ++j;
    }

    public static List<Integer> removeDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length - 1]);
        return list;
    }
}
