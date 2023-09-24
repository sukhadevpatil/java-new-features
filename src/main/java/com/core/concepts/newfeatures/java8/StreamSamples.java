package com.core.concepts.newfeatures.java8;

import com.core.concepts.newfeatures.java8.helper.Person;
import org.apache.logging.log4j.util.Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSamples {

    public static void main(String[] args) {

        //1. Find the sum of all elements in a list using stream
        List<Integer> list = Arrays.asList(89, 11, 1, 2, 3, 4, 5);

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        System.out.println("=============================================");
        //2. Find Max element from the stream
        int maxVal = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maxVal);

        System.out.println("=============================================");
        //3. Count the strings which are starting with a specific character
        List<String> fruits = Arrays.asList("Banana", "Mango", "Grapes", "Orange", "Coconut", "Cherry");

        Stream<String> stream1 = fruits.stream().filter(fruit -> fruit.startsWith("C"));
        List<String> fruitList = stream1.collect(Collectors.toList());
        fruitList.forEach(System.out::println);

        System.out.println("=============================================");
        //4. Convert the collection of strings to upper case
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("=============================================");
        //5. Filter out the odd numbers
        list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

        System.out.println("=============================================");
        //6. find an average of the floating-numbers collection
        List<Double> values = Arrays.asList(1.2, 3.2, 4.2, 5.2, 6.2);

        Double doubleVal = values.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(doubleVal);

        System.out.println("=============================================");
        //7. concatenate all the Strings

        String concatenatedStr = fruits.stream().collect(Collectors.joining("#"));
        System.out.println(concatenatedStr);

        System.out.println("=============================================");
        //8. Get unique records
        List<Integer> values2 = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7);

        values2.stream().distinct().forEach(System.out::println);

        System.out.println("=============================================");
        // 9. Sort the objects for the complex objects

        List<Person> personList = Arrays.asList(
          new Person("Amit", 29),
          new Person("Rohan", 22),
          new Person("Om", 35),
          new Person("Shourya", 12),
          new Person("Sharad", 31)
        );

        Collections.sort(personList, Comparator.comparing(Person::getName));
        System.out.println(personList);
        //personList.sort((v1, v2) -> v1.getAge().compareTo(v2.getAge()));

        List<Person> sortedPersons = personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        System.out.println(sortedPersons);
    }
}
