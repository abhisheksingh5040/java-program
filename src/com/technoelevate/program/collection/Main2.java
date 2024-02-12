package com.technoelevate.program.collection;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = i; j < arr.length; j++) {
                builder.append("[").append(arr[j]).append("]");
                System.out.println(builder);
            }
        }
    }
}
