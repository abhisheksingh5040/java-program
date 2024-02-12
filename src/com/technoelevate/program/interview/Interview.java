package com.technoelevate.program.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Interview {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
    }

    public static int[] length(int[] arr, int input) {
        int[] output = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != input) {
                output[j] = arr[i];
                j++;
            }
        }

        for (int i = j; i < arr.length; i++) {
            output[i] = input;
        }
        return output;
    }

    public static void array(int[] arr, int input) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (arr[start] == input) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
            } else {
                start++;
            }
        }
    }

    public static void get(){
        String a = "akkas";
        boolean b = IntStream.rangeClosed(0, a.length() / 2).anyMatch(i -> a.toLowerCase().charAt(i) == a.toLowerCase().charAt(a.length() - 1 - i));
        System.out.println(b);
    }
}
