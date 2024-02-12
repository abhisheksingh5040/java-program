package com.technoelevate.program.imp;

import java.util.Arrays;
import java.util.Scanner;

/*
Once upon a time, a King ventured into a forest and stumbled upon various types of diamonds, each with a unique
value. The values of these diamonds could be positive, negative, or zero. However, due to limited space in his bag,
the King can only carry three diamonds with him.
The King&#39;s objective is to select three diamonds in such a way that the product of their values is maximized. In other
words, he wants to choose the three diamonds with the highest possible product of their values.
Your task is to help the King determine which three diamonds he should pick to achieve the maximum product The
King has to pick the three diamonds mandatory

Input format
First Line contains an integer N, which represents number of diamonds Second Line contain N space-separated
Integers, representing the value of diamonds.
Output forma
Print the maximum possible product value
Contrylene
3-N104
-1000 diamondali] &lt; 1000
Nota: There is always atleast one non-negative integer.
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] input  = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(max(input,5));
    }

    public static int max(int[] input,int N){
        Arrays.sort(input);

        //Max Value product
        int max1 = input[N - 1] * input[N - 2] * input[N - 3];
        int max2 = input[0] * input[1] * input[N - 1];

       return Math.max(max1, max2);
    }
}
