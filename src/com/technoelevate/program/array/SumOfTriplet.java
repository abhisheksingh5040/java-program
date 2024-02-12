package com.technoelevate.program.array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfTriplet {

    public static void main(String[] args) {
       int[] input = {1,2,3,4,5,6,7,8,9};
       int target = 8;
       sumOfTripletOptimize(input,target);
    }

    public static void sumOfTriplet(int[] input, int target){
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                for (int k = j+1; k < input.length; k++) {
                    if(input[i]+input[j]+input[k]==target)
                        System.out.println(input[i] + " - " + input[j] + " - " + input[k]);
                }
            }
        }
    }

    public static void sumOfTripletOptimize(int[] arr,int target) {

        for (int i = 0; i < arr.length - 2; i++) {
            int first = arr[i];
            Set<Integer> set = new HashSet<>();
            int newTarget = target - first;

            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];
                int third = newTarget - second;
                if (set.contains(third)) {
                    System.out.println(first + " - " + second + " - " + third);
                }
                set.add(second);
            }
        }
    }
}
