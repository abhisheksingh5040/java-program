package com.technoelevate.program.recursion;

import java.util.ArrayList;
import java.util.List;

public class SumHasToN {
    public static void main(String[] args) {
        int[] input  = {1,4,7,8,0,2,4,6,7};
        System.out.println(sumOfDigit(input,new ArrayList<>(),0,1));
    }

    public static List<int[]> sumOfDigit(int[] arr,List<int[]> list,int index1,int index2){
        //base condition
        if(arr.length-1 == index1 && arr.length-1 == index2)
            return list;

        return sumOfDigit(arr,list,index1+1,index2+2);
    }
}
