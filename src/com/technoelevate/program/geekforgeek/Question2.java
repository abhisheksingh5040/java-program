package com.technoelevate.program.geekforgeek;

/*
The most simplest way to find min and max value of an element is to use inbuilt
 function sort() in java. So, that value at 0th position will min and value at nth position will be max.
 */
public class Question2 {

    public static void main(String[] args) {
        int[] a = {1, 423, 6, 46, 34, 23, 13, 53, 4};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            // for minimum
            if (min > a[i]) {
                min = a[i];
            }

            //for maximun
            if (max < a[i]) {
                max = a[i];
            }
        }

        System.out.println("min : " + min);
        System.out.println("max : " + max);
    }

}
