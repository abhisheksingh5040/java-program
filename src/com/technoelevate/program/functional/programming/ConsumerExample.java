package com.technoelevate.program.functional.programming;

import com.technoelevate.program.functional.programming.database.Student;
import com.technoelevate.program.functional.programming.database.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> consumer1 = student -> System.out.println(student);
    static Consumer<Student> consumer2 = student -> System.out.print(student.getName());
    static Consumer<Student> consumer3 = student -> System.out.println(student.getActivities());

    public static void printName() {
        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(consumer1);
    }

    public static void printNameAndActivity() {
        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(consumer2.andThen(consumer3)); // this is called as consumer chaining
    }

    public static void printNameAndActivityUsingCondition() {
        List<Student> students = StudentDatabase.getAllStudents();
        students.forEach(student -> {
            if (student.getGradeLevel() > 3) {
                consumer2.andThen(consumer3).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());
        consumer.accept("java");

        //printName();
        //printNameAndActivity();
        printNameAndActivityUsingCondition();
    }
}
