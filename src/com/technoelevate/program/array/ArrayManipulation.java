package com.technoelevate.program.array;

import java.util.HashMap;
import java.util.Map;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(arrayManipulation(input));
    }

    public static int arrayManipulation(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 0) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int arrayManipulationOptimized(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                Integer count = map.get(arr[i]);
                count += 1;
                map.put(arr[i], count);
            } else {
                map.put(arr[i], 1);
            }
        }

        return -1;
    }
}
