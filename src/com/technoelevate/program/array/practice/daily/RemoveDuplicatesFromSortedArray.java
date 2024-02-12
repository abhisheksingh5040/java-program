package com.technoelevate.program.array.practice.daily;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9,2,3,4,5};

        System.out.println(removeDuplicatesUsingDsa(input));
    }

    //use dsa
    public static Set<Integer> removeDuplicatesUsingDsa(int[] arr){
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        return set;
    }
}
