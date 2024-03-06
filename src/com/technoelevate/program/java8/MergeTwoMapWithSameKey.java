package com.technoelevate.program.java8;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMapWithSameKey {
    public static void main(String[] args) {
        //Map-1
        Map<String, Integer> subjectToStudentCountMap1 = new HashMap<>();

        subjectToStudentCountMap1.put("Maths", 45);
        subjectToStudentCountMap1.put("Physics", 57);
        subjectToStudentCountMap1.put("Chemistry", 52);
        subjectToStudentCountMap1.put("History", 41);

        Map<String, Integer> subjectToStudentCountMap2 = new HashMap<>();

        subjectToStudentCountMap2.put("Economics", 49);
        subjectToStudentCountMap2.put("Maths", 42);
        subjectToStudentCountMap2.put("Biology", 41);
        subjectToStudentCountMap2.put("History", 55);

        Map<String, Integer> mergedMap = new HashMap<>(subjectToStudentCountMap1);
        subjectToStudentCountMap2.forEach((key, value) -> mergedMap.merge(key, value, Integer::sum));

        System.out.println(mergedMap);

    }
}
