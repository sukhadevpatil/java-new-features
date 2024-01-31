package com.core.concepts.newfeatures.basics.challenges;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortMapByValue {

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);

        System.out.println(scores);

        sortByValue(scores);

    }

    private static void sortByValue(Map<String, Integer> scores) {
        scores.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        //Reverse order by value

        scores.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(System.out::println);

    }
}
