package com.technoelevate.program.java8;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 2);
        map.put("B", 7);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 8);
        map.put("F", 1);
        // Map<String, Integer> sorted = sortByValue(map);
        Map<String, Integer> sorted = sortByValueUsingSort(map);
        System.out.println(sorted);
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> data) {
        return data.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), LinkedHashMap::putAll);
    }

    public static Map<String, Integer> sortByValueUsingSort(Map<String, Integer> data) {
        return data.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
