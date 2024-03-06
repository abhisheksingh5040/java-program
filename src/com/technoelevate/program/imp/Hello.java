package com.technoelevate.program.imp;

import java.util.HashSet;
import java.util.Set;

public class Hello {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {2, 4, 5, 7, 8};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int arr : arr1) {
            set1.add(arr);
        }

        for (int arr : arr2) {
            set2.add(arr);
        }

        set1.retainAll(set2);
        System.out.println(set1);
    }
}
