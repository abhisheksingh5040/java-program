package com.technoelevate.program.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElement {

    public static void main(String[] args) {
       int[] arr1 = {2,4,3,2,1};
       int[] arr2 = {3,1,2,5};

        for (int i = 0; i < arr2.length; i++) {
//            if(isPresent(arr1,arr2[i])){
//                System.out.println(arr2[i]);
//            }

//            OR

            List<Integer> collect = Arrays.stream(arr1).boxed().collect(Collectors.toList());
            if(collect.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
        }

    }

    public static boolean isPresent(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

}
