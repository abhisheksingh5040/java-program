package com.technoelevate.program.array.prefix_sum;

import java.util.Arrays;

public class Sum {

    public static void main(String[] args) {
        int[] input = {2, 1, 3, 4, 5};
        sum(input);
        System.out.println(Arrays.toString(input));
    }

    public static void sum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }
}
