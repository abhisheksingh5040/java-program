package com.technoelevate.program.recursion.pattern;

import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Process each test case
        for (int t = 0; t < T; t++) {
            // Input the number of diamonds in each pile and the target diamond counts in two piles
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Check if it is possible to achieve the target arrangement
            boolean possible = isRedistributionPossible(A, B, C, X, Y);

            // Output the result for the current test case
            System.out.println(possible ? "YES" : "NO");
        }

        // Close the scanner
        scanner.close();
    }


    private static boolean isRedistributionPossible(int A, int B, int C, int X, int Y) {
        // Check if the target diamond counts are achievable
        return (A>=X && B>=Y) || (A>=Y && B>=X) || (B>=X && C>=Y) || (C>=Y && B>=X) || (A>=X && C>=Y) || (C>=Y && A>=X);
    }
}
