package com.technoelevate.program.array.java8;

import java.util.Arrays;
import java.util.Optional;

public class Reduce {

    public static void main(String[] args) {
        int[] input = {1, 3, 5, 7, 8, 9, 89};
        max(input);
        min(input);
        sum(input);
        sumOfEven2odd4(input);
    }

    public static void max(int[] input) {
        Optional<Integer> max = Arrays.stream(input)
            .boxed()
            .reduce((result, currentValue) -> result > currentValue ? result : currentValue);

        System.out.println("max : " + max.get());
    }

    public static void min(int[] input) {
        Optional<Integer> min = Arrays.stream(input)
            .boxed()
            .reduce((result, currentValue) -> result < currentValue ? result : currentValue);

        System.out.println("min : " + min.get());
    }

    public static void sum(int[] input) {
        Optional<Integer> sum = Arrays.stream(input)
            .boxed()
            .reduce((result, currentValue) -> result + currentValue);

        System.out.println("sum : " + sum.get());
    }

    public static void sumOfEven2odd4(int[] input) {
        Optional<Integer> sum = Arrays.stream(input)
            .boxed()
            .reduce((result, currentValue) -> {
                if (currentValue % 2 == 0) {
                    return result + currentValue * 2;
                } else {
                    return result + currentValue * 4;
                }
            });

        System.out.println("sum : " + sum.get());
    }
}
