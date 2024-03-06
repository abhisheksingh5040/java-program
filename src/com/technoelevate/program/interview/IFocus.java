package com.technoelevate.program.interview;

import java.util.Arrays;

/*
 Input : [1,3,45,67,10]
 Output : [10,3,45,67,1]
 */
public class IFocus {
    public static void main(String[] args) {
        int[] arr = {1, 3, 46, 67, 10};

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (arr[start] % 2 != 0) {
                start++;
            }else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
