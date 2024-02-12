package com.technoelevate.program.array.practice.daily.top;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] input = {3, 4, 5, 6, 8, 9};
        System.out.println(missingAnyRandomNumber(input));
    }

    //if number starts from 1
    public static int missingNumber(int[] input) {
        int n = input.length + 1;
        int result = ((n + 1) * n) / 2;

        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return result - sum;
    }

    //if number starts with any random number
    public static int missingAnyRandomNumber(int[] arr) {
        int currentValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != currentValue) {
                return currentValue;
            } else {
                currentValue++;
            }
        }

        return currentValue;
    }
}
