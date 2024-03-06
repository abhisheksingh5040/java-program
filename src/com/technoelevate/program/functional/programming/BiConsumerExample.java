package com.technoelevate.program.functional.programming;

import com.technoelevate.program.functional.programming.database.Student;
import com.technoelevate.program.functional.programming.database.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void getNameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> addition = (int1, int2) -> {
            System.out.println("Addition is :" + (int1 + int2));
        };

        BiConsumer<Integer, Integer> subtraction = (int1, int2) -> {
            System.out.println("Subtraction is :" + (int1 - int2));
        };

        addition.andThen(subtraction).andThen(subtraction).accept(5, 2);

        getNameAndActivities();
    }
}
