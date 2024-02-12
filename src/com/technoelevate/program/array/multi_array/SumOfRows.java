package com.technoelevate.program.array.multi_array;

import java.util.Arrays;

public class SumOfRows {

    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] array2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] sum = calculateSum(array1, array2);
        System.out.println("Sum of the 2D array: " + Arrays.deepToString(sum));
    }

    public static int[][] calculateSum(int[][] arr1, int[][] arr2) {
        int[][] output = new int[arr1.length][arr1[0].length]; // Assuming both arrays have the same dimensions

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                output[row][col] = arr1[row][col] + arr2[row][col];
            }
        }

        return output;
    }
}
