package com.technoelevate.program.imp;

import java.util.Arrays;
import java.util.Scanner;

/*
You are developing a shopping application that helps users find the best deals on products. One of
the features you want to implement is a pair finder that identifies products with a total price equal to
a given target price. For example, if the target price is $50, the pair finder should identity a pair of
products that, when combined, amount to $50. Write a program that takes as input an array of
product prices and a target price and return the number of pairs that sum up to the target price.
Remember, each element of the array can be part of a single pair only, and cannot be used multiple
times.
 */
public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Target:");
        int target  = scanner.nextInt();

        System.out.print("Enter the number of N: ");
        int N = scanner.nextInt();
        System.out.print("Enter your products: ");
        int[] products = new int[N];
        for (int i = 0; i < N; i++) {
            products[i] = scanner.nextInt();
        }

        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if(products[i]+products[j]==target){
                    int[] result = {products[i],products[j]};
                    System.out.println(Arrays.toString(result));
                }
            }
        }
    }

}
