package com.technoelevate.program.array.practice.daily.top;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraySubset {

    public static void main(String[] args) {
        Integer[] input = {11, 1, 13, 21, 3, 7};
        Integer[] subset = {11, 1, 17, 3};

        boolean b = usingSetApproach(input, subset);
        System.out.println(b);
    }

    //brutal approach -> Time complexity: O(N^2)
    public static boolean brutalApproach(int[] arr, int[] subset) {
        for (int i = 0; i < subset.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (subset[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }

    //optimized way
    public static boolean usingSetApproach(Integer[] arr, Integer[] subset) {
        HashSet<Integer> setArr = new HashSet<>(Arrays.asList(arr));
        HashSet<Integer> setSubset = new HashSet<>(Arrays.asList(subset));

        return setArr.addAll(setSubset);
    }
}
