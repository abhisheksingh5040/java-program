package com.technoelevate.program.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> map = separateEvenOdd(list);
        System.out.println(map);
    }

    public static Map<Boolean, List<Integer>> separateEvenOdd(List<Integer> list) {
        return list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
    }
}
