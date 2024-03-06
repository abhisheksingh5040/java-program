package com.technoelevate.program.recursion.array;

public class AllPossibleCombination {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 2;
        int n = arr.length;
        printCombination(arr, n, target);
    }

    private static void printCombination(int[] arr, int n, int target) {
        int[] data = new int[target];
        combinationUtil(arr, data, 0, n - 1, 0, target);
    }

    private static void combinationUtil(int[] arr, int[] data, int start, int end, int index, int target) {
        if(index == target){
            for (int j = 0; j < index; j++) {
                System.out.print(data[j]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i <= end ; i++) {
            
        }
    }


}
