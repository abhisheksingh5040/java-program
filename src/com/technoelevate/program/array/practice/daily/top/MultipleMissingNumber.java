package com.technoelevate.program.array.practice.daily.top;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MultipleMissingNumber {

    public static void main(String[] args) {
//        int[] input = {1,2,4,5,7,8,9};
//        System.out.println(missingNumber(input));

        int[] input = {1, 2, 3, 4, 5};
        System.out.println(sum(input));
    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr)
            .boxed()
            .reduce(0, (res, currentValue) -> {
                if (currentValue % 2 == 0) {
                    return res + currentValue * 2;
                } else {
                    return res + currentValue * 5;
                }
            });
    }
}
