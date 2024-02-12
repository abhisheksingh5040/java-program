package com.technoelevate.program.array.practice.daily;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ints = rotateWithExtraSpace(input, 2);
        System.out.println(Arrays.toString(ints));
    }

    //with using extra spcae
    public static int[] rotateWithExtraSpace(int[] arr, int k) {
        int out = 0;
        int[] output = new int[arr.length];
        //right side
        for (int i = arr.length - k; i < arr.length; i++) {
            output[out] = arr[i];
            out++;
        }

        //left side
        for (int i = 0; i < arr.length - k; i++) {
            output[out] = arr[i];
            out++;
        }
        return output;
    }

}
