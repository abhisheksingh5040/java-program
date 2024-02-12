package com.technoelevate.program.recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] input = {1, 3, 5, 7, 9};
        System.out.println(search(input, 15, 0, input.length - 1));
    }

    public static int search(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        } else if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        } else {
            return search(arr, target, start, mid - 1);
        }
    }

}
