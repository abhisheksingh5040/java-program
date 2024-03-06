package com.technoelevate.program.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMap {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("sagar");
        list.add("ankush");
        list.add("akash");
        list.add("rajkesh");
        Map<Integer, String> collect = IntStream.rangeClosed(0, list.size()-1)
                .boxed()
                .collect(Collectors.toMap(i -> i + 1, list::get));

        System.out.println(collect);
    }
}
