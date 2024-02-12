package com.technoelevate.program.array;

import java.util.Arrays;

public class SortNew {

    public static void main(String[] args) {
        int[] input = {1, 5, 3, 0, -1, -5, -2, -3};
        int[] ints1 = sortLeftSide(input);
        int[] ints2 = sortRightSide(ints1);
        System.out.println(Arrays.toString(ints2));
    }

    private static int[] sortRightSide(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                int max = 0;
                if (input[i] <= 0) {
                    break;
                } else if (input[max] < input[i]) {
                    swap(input, i, max);
                }
            }
        }
        return input;
    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    private static int[] sortLeftSide(int[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                int min = 0;
                if (input[i] > 0) {
                    break;
                } else if (input[min] < input[i]) {
                    swap(input, i, min);
                }
            }
        }
        return input;
    }
}
