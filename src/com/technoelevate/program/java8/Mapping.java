package com.technoelevate.program.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapping {

    public static void main(String[] args) {
        List<Persons> persons = Arrays.asList(
                new Persons("Alice", 25),
                new Persons("Bob", 30),
                new Persons("Charlie", 25),
                new Persons("David", 30));

        Map<Integer, List<String>> collect = persons.stream().collect(Collectors.groupingBy(Persons::getAge, Collectors.mapping(Persons::getName, Collectors.toList())));
        System.out.println(collect);
    }

}

class Persons {
    private String name;
    private int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
