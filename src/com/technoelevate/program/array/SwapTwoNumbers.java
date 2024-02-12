package com.technoelevate.program.array;

import java.util.Arrays;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        swap(arr,2,8);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] swap(int[] arr ,int a,int b){
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==a){
                index1 = i;
            }

            if(arr[i]==b){
                index2 = i;
            }
        }

        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
        return arr;
    }
}
