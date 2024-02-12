package com.technoelevate.program.array.practice.daily.top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort012 {

    public static void main(String[] args) {
        int[] input = {0, 1, 2, 0, 2, 1, 1, 2, 0, 1};
//        List<Integer> integers = sort1(input);
//        System.out.println(integers);

        sort3(input);
        System.out.println(Arrays.toString(input));
    }

    public static List<Integer> sort1(int[] input) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            map.put(input[i], map.getOrDefault(input[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                list.add(key);
            }
        }
        return list;
    }

    //time complexity O(2 * N)
    public static void sort2(int[] arr) {

        int[] output = new int[3];
        for (int i = 0; i < arr.length; i++) {
            output[arr[i]]++;
        }

        int j = 0;

        //adding zero
        for (int i = 0; i < output[0]; i++) {
            arr[j] = 0;
            j++;
        }

        //adding one
        for (int i = 0; i < output[1]; i++) {
            arr[j] = 1;
            j++;
        }

        //adding two
        for (int i = 0; i < output[2]; i++) {
            arr[j] = 2;
            j++;
        }
    }

    //Time complexity : O(N)
    public static void sort3(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
