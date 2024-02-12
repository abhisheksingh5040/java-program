package com.technoelevate.program.array.multi_array;

import java.util.Arrays;

public class SquareOfDiagnal {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        square(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void square(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row == col || (row + col) == arr.length - 1) {
                    arr[row][col] = arr[row][col] * arr[row][col];
                }
            }
        }
    }
}
