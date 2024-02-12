package com.technoelevate.program.array.multi_array;

import java.util.Arrays;

public class PascalTriangle {

    public static void main(String[] args) {
        int input = 6;
        int[][] ints = pascalTriangle(6);
        System.out.println(Arrays.deepToString(ints));
    }

    public static int[][] pascalTriangle(int input) {
        int[][] output = new int[input][];

        for (int row = 0; row < input; row++) {
            //make new array
            output[row] = new int[row + 1];

            //first and last element have to be 1
            output[row][0] = output[row][row] = 1;

            for (int col = 1; col < row; col++) {
                output[row][col] = output[row - 1][col] + output[row - 1][col - 1];
            }
        }
        return output;
    }
}
