package com.technoelevate.program.java8;

import com.technoelevate.program.functional.programming.database.Student;
import com.technoelevate.program.functional.programming.database.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DescendingOrderGroupingBy {
    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();

        TreeMap<Double, List<Student>> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getGpa, () -> new TreeMap<>(Comparator.reverseOrder())
                        , Collectors.toList()));

        Map<Double, Map<String, List<Student>>> collect1 = collect.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream()
                .collect(Collectors.groupingBy(Student::getGender))));

        System.out.println(collect1);

    }

}
