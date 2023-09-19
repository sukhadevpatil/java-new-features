package com.core.concepts.newfeatures.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {

        //1. blank String
        Stream<Object> objectStream = Stream.empty();

        //2. Using Stream.of()
        String[] names = {"Amit", "Bunny", "Catherine", "David"};

        Stream<String> namesStream = Stream.of(names);

        namesStream.forEach(System.out::println);

        //3. Using stream.builder
        Stream<Object> buildStream = Stream.builder().build();

        //4. Arrays.stream()
        Stream<String> arraysStream = Arrays.stream(new String[]{"Test", "Best", "West", "Nest"});

        arraysStream.forEach(System.out::println);

        //5 . List, Set
        List<String> list = List.of("First", "Second", "Third", "Fourth");

        list.forEach(System.out::println);
    }
}
