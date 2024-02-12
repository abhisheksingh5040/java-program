package com.technoelevate.program.recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9};
        //System.out.println(search(input,7,0));
        //System.out.println(findAllIndex(input,9,0,new ArrayList<>()));
        System.out.println(findAllIndexWithoutTakingArrayListAsArgument(input, 9, 0));
    }

    /**
     * Time complexity :
     * Best time complexity O(1)
     * Worst time complexity O(N)
     * space complexity : O(1)
     */

    public static int search(int[] arr, int target, int index) {
        //base condition
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return search(arr, target, index + 1);
    }

    public static List<Integer> findAllIndex(int[] arr, int target, int index, List<Integer> list) {
        //base condition
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndex(arr, target, index + 1, list);
    }

    public static List<Integer> findAllIndexWithoutTakingArrayListAsArgument(int[] arr, int target, int index) {
        List<Integer> list = new ArrayList<>();

        //base condition
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        List<Integer> listFromPreviousMethodCalls = findAllIndex(arr, target, index + 1, list);
        list.addAll(listFromPreviousMethodCalls);
        return list;
    }
}
