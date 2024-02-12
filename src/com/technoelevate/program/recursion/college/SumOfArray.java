package com.technoelevate.program.recursion.college;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        int i = 0;
        System.out.println(sum(arr,i,sum));
    }

    public static int sum(int[] arr, int i, int sum) {
        //base condition
        if (i == arr.length) {
            return sum;
        }
        sum = sum + arr[i];
        return sum(arr, i + 1, sum);
    }
}
