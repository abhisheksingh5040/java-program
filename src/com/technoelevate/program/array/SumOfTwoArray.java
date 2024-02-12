package com.technoelevate.program.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class SumOfTwoArray {

    public static void main(String[] args) {
        int[] input = {-1,2,-4,-10,20,57,100,-70};
        int[] ints = sumOfArrayUsingDSA(input);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] sumOfArray(int[] arr){
        int sum  = Integer.MIN_VALUE;
        int[] val = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if((arr[i] + arr[j]) > sum){
                   sum = arr[i] + arr[j];
                   val[0] = arr[i];
                   val[1] = arr[j];
                }
            }
        }
        return val;
    }

    public static int[] sumOfArrayWithBigON(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int[] val = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && secondMax != max){
                secondMax = arr[i];
            }
            val[0] = max;
            val[1] = secondMax;
        }
        return val;
    }

    public static int[] sumOfArrayReduceTime(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int[] val = new int[2];
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = maxSum - arr[i];
            if (indexMap.containsKey(complement)) {
                int complementIndex = indexMap.get(complement);
                if (arr[i] + arr[complementIndex] > maxSum) {
                    maxSum = arr[i] + arr[complementIndex];
                    val[0] = arr[i];
                    val[1] = arr[complementIndex];
                }
            }
            indexMap.put(arr[i], i);
        }
        return val;
    }

    public static int[] sumOfArrayUsingDSA(int[] arr) {
        // Create a priority queue with a comparator to reverse the natural ordering
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Add all elements of the array to the priority queue
        for (int num : arr) {
            maxHeap.offer(num);
        }

        int[] val = new int[2];

        // Extract the maximum and second maximum values from the priority queue
        val[0] = maxHeap.poll();
        val[1] = maxHeap.poll();

        return val;
    }
}
