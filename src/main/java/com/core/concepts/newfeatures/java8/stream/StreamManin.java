package com.core.concepts.newfeatures.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamManin {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 5, 7, 9, 10, 15, 20, 40);
        System.out.println(list);

        //to get even elements from above list
        List<Integer> result = new ArrayList<>();
        for(Integer el : list) {
            if(el % 2 == 0) {
                result.add(el);
            }
        }
        System.out.println(result);

        //================================Using Stream API============================
        List<Integer> result2 = list.stream().filter(el -> el % 2 == 0).collect(Collectors.toList());
        result2.forEach(System.out::println);
        System.out.println("=================");

        //================================Array to Stream============================
        String[] names = {"Anny", "Antony", "Steve", "John", "Flenn"};
        Stream<String> arrStream = Stream.of(names);
        arrStream.filter(el -> el.startsWith("A")).forEach(System.out::println);

        System.out.println("===========Use Map to manipulate data=======");
        Stream<Integer> nums = Stream.of(2,9,15,4,6,7);
        List<Integer> resList = nums.map(i -> i * i).collect(Collectors.toList());
        System.out.println(resList);

        System.out.println("==================Sorted Result==============");
        resList.stream().sorted().forEach(System.out::println);

        System.out.println("==================Max/Min Value==============");
        System.out.println(resList.stream().max(Comparator.naturalOrder()).get());
        System.out.println(resList.stream().min(Comparator.naturalOrder()).get());


    }
}
