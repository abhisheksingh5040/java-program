package com.technoelevate.program.functional.programming;

import com.technoelevate.program.functional.programming.database.Student;
import com.technoelevate.program.functional.programming.database.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = student -> student.getGradeLevel() >= 3.0;
    Predicate<Student> p2 = student -> student.getGpa() >= 3.0;

    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> consumer = student -> biConsumer.accept(student.getName(), student.getActivities());

    public void getNameAndActivities(List<Student> students) {
        students.forEach(consumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();
        new PredicateAndConsumerExample().getNameAndActivities(students);
    }
}
