package com.technoelevate.program.functional.programming;

import com.technoelevate.program.functional.programming.database.StudentDatabase;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicate1 = num -> num % 2 == 0;
    static Predicate<Integer> predicate2 = num -> num % 5 == 0;

    public static void predicateAnd() {
        System.out.println(predicate1.and(predicate2).test(10));;
    }

    public static void predicateOr() {
        System.out.println(predicate1.or(predicate2).test(12));;
    }

    public static void predicateNegate() {
        System.out.println(predicate1.or(predicate2).negate().test(12));;
    }

    public static void main(String[] args) {
        System.out.println(predicate1.test(3));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
