package com.technoelevate.program.recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] input = {1,4,10,8,9};
        System.out.println(isSorted(input,0));
    }

    public static boolean isSorted(int[] arr,int index){
        //base condition
        if(index == arr.length-1)
            return true;

        if(arr[index] > arr[index+1] )
            return false;

        return isSorted(arr,index+1);

    }
}
