package com.core.concepts.newfeatures.java8;

import java.util.Arrays;
import java.util.List;

public class SortElements {

    public static void main(String[] args) {
        String[] cities = {"Mumbai", "Pune", "Nagpur", "Sangli", "Ch. Sambhji Nagar"};

        List<String> places = Arrays.stream(cities).sorted().toList();

        System.out.println(places);

    }
}
