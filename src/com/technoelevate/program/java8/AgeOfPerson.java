package com.technoelevate.program.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfPerson {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1995, 04, 05);
        LocalDate date = LocalDate.now();

        long between = ChronoUnit.YEARS.between(birthDate, date);
        System.out.println(between);

    }
}
