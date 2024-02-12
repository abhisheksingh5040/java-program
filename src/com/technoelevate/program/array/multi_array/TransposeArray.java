package com.technoelevate.program.array.multi_array;

import java.util.Arrays;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        //int[][] transpose = transpose(array);
        transposeWithInPlace(array);
        System.out.println(Arrays.deepToString(array));
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

    public static void transposeWithInPlace(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = row; col < arr[row].length; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
    }
}
