package com.technoelevate.program.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class RemoveDuplicateFromNumber {

    public static void main(String[] args) {
        int num = 1234321;
        int s = removeDuplicate(num);
        System.out.println(s);

        int[] input  = {1,2,3,4,5,6,7,8,9};

        int check = check(input);
        System.out.println(check);

    }

    private static int check(int[] input) {
       // return Arrays.stream(input).boxed().sorted(Comparator.reverseOrder()).limit(1).findFirst().get();

        int reduce = Arrays.stream(input).reduce(0, (i, j) -> i > j ? i : j);

//        return reduce;
        final int sum =0;
        return Arrays.stream(input).sum();
    }

    public static int removeDuplicate(int num) {
        return Integer.valueOf(Arrays.stream(String.valueOf(num).split(""))
                .distinct()
                .collect(Collectors.joining()));
    }


}
