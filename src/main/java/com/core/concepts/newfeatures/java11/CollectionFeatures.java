package com.core.concepts.newfeatures.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionFeatures {
    public static void main(String[] args) {
        //unmodifiableCopy();
        //collectorsUnmodifiableList();
        toArrayMethod();
        predicateNotMethod();
        orElseThrowMethod();
    }

    /**
     * unmodifiableCopy - List.copyOf() will make an unmodifiableCopy
     */
    public static void unmodifiableCopy() {
        List<Integer> integerList = new ArrayList<>();

        List<Integer> copyList = List.copyOf(integerList);

        copyList.add(100);
    }

    /**
     * collectorsUnmodifiableList - Collectors.toUnmodifiableList() - this will convert to the unmodifiable list
     */
    public static void collectorsUnmodifiableList() {
        List<Integer> integerList = new ArrayList<>();

        List<Integer> evenNumbers = integerList.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        evenNumbers.add(12);
    }

    /**
     * Collection toArray
     * The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.
     * toArrayMethod - new method to convert list to toArray()
     */
    public static void toArrayMethod() {
        List<String> list = Arrays.asList("Like", "and", "Subscribe");

        String [] arr = list.toArray(String[]::new);

        Arrays.stream(arr).forEach(System.out::println);
    }

    /**
     * predicateNotMethod - we can use predicate in filters
     * A static not method has been added to the Predicate interface.
     * We can use it to negate an existing predicate, much like the negate method:
     */
    public static void predicateNotMethod() {
        List<String> list = Arrays.asList("Like", " ", "\n", "and", "Subscribe");

        List<String> withoutBlankStr = list.stream()
                .filter(Predicate.not(String::isBlank))
                .toList();

        System.out.println(withoutBlankStr);
    }

    /**
     * This method will thro exception if all values are blank or empty
     */
    public static void orElseThrowMethod() {
        List<String> list = Arrays.asList("Like", " ", "\n", "and", "Subscribe");

        String strVal = list.stream()
                .filter(Predicate.not(String::isBlank))
                .findFirst()
                .orElseThrow();

        System.out.println(strVal);
    }
}
