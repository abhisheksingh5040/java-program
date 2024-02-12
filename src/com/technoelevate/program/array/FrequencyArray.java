package com.technoelevate.program.array;

public class FrequencyArray {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9};

        int target = 11;
        int[] ints = makeFrequency(input);
        System.out.println(ints[target]==0 ? "NO" : "YES");
    }

    public static int[] makeFrequency(int[] arr){
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
}
