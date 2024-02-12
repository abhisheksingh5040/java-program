package com.technoelevate.program.array.practice.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

        System.out.println(productOfArray(input,60));
    }

    public static List<List<Integer>> productOfArray(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] * arr[j] == target) {
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.add(arr[i]);
                    integers.add(arr[j]);

                    list.add(integers);
                }
            }
        }

        return list;
    }
}
