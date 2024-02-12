package com.technoelevate.program.array.multi_array;

import java.util.Arrays;

public class Rotate90Degree {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        //first transpose
        int[][] transpose = transpose(array);

        //Second reverse
        for (int i = 0; i < transpose.length; i++) {
            reverse(transpose[i]);
        }
        System.out.println(Arrays.deepToString(transpose));
    }

    public static int[][] transpose(int[][] arr) {
        int[][] output = new int[arr.length][arr.length];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                output[row][col] = arr[col][row];
            }
        }
        return output;
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
