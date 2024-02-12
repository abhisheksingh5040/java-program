package com.technoelevate.program.recursion;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] input = {1, 4, 9, 7, 8, 9};
        System.out.println(isSorted(input, 0));
    }

    public static boolean isSorted(int[] input, int index) {
        if (index == input.length - 1 || input.length == 0 || input.length == 1) {
            return true;
        }

        if (input[index] > input[index + 1]) {
            return false;
        }

        return isSorted(input, index + 1);
    }
}
