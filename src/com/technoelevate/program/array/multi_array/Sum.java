package com.technoelevate.program.array.multi_array;

public class Sum {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = calculateSum(array);
        System.out.println("Sum of the 2D array: " + sum);
    }

    public static int calculateSum(int[][] arr) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
        }
        return sum;
    }
}
