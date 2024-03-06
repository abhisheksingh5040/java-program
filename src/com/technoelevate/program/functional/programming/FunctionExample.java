package com.technoelevate.program.functional.programming;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> function1 = str -> str.toUpperCase();
    static Function<String, String> function2 = str -> str + " default";

    public static void main(String[] args) {
        System.out.println(function1.apply("java"));
        System.out.println(function1.andThen(function2).apply("java"));  //JAVA default
        System.out.println(function1.compose(function2).apply("java"));  //JAVA DEFAULT -> here first compose execute
    }
}
