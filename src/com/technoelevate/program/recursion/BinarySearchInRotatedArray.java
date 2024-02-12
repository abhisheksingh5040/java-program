package com.technoelevate.program.recursion;

public class BinarySearchInRotatedArray {

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int target = 5;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {//left half sorted
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1; // Target lies in the left half
                } else {
                    low = mid + 1; // Target lies in the right half
                }
            } else { // right half sorted
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1; // Target lies in the right half
                } else {
                    high = mid - 1; // Target lies in the left half
                }
            }
        }
        return -1;
    }
}
