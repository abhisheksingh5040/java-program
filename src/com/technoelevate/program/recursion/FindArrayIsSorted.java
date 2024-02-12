package com.technoelevate.program.recursion;

public class FindArrayIsSorted {

    public static void main(String[] args) {
        int[] input = {1,3,5,6,7,8,9};
        System.out.println(isSorted(input,0,input.length-1)?"Sorted Array":"Not a Sorted Array");;
    }

    private static boolean isSorted(int[] arr,int start,int end) {
         //base condition
        if(start > end -1 ){
            return false;
        }
        if(arr[start]>arr[start+1]){
            return true;
        }
        return isSorted(arr,start+1,end);

    }
}
