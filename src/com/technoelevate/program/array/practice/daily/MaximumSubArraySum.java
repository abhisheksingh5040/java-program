package com.technoelevate.program.array.practice.daily;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSubArraySum {

    public static void main(String[] args) {
        int[] input = {2, 1, 4, 57, 7, 3, 7, 0, 9, 89, -12, 28, -56};
        int[] ints = getIndex(input);
        System.out.println(Arrays.toString(ints));
    }

    //with using dsa
    public static int[] maximumSubArraySum(int[] arr) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        for (int val : arr) {
            queue.add(val);
        }

        Integer max1 = queue.poll();
        Integer max2 = queue.poll();

        return new int[]{max1, max2};
    }

    public static int[] maximumSubArraySumWithOn(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            } else if (max2 < arr[i] && max2 != max1) {
                max2 = arr[i];
            }
        }

        return new int[]{max1, max2};
    }

    public static int[] getIndex(int[] arr) {
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[max1] < arr[i]) {
                max2 = max1;
                max1 = i;
            } else if (arr[max2] < arr[i] && max2 != max1) {
                max2 = i;
            }
        }

        return new int[]{max1, max2};
    }
}
