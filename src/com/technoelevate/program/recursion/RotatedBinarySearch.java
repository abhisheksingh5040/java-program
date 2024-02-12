package com.technoelevate.program.recursion;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] input = {5,6,7,8,9,1,2,3};
        int target = 2;
        System.out.println(search(input,target,0,input.length));

    }

    public static int search(int[] arr, int target,int start,int end){
        //Base condition
        if(start >= end){
            return -1;
        }

        int mid = start + (end - start)/2;
        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            if(target < arr[start]){
               return search(arr,target,mid+1,end);
            }else{
                return search(arr,target,start,mid-1);
            }
        }else{
            if(target < arr[start]){
                return search(arr,target,start,mid-1);
            }else{
                return search(arr,target,mid+1,end);
            }
        }

    }
}
