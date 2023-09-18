package com.core.concepts.newfeatures;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String test = "test";

        System.out.println(new StringBuilder(test).reverse());

        List<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Delhi");

        List<String> newCities = cities.stream().filter(val -> !val.equals("Bangalore")).toList();
        System.out.println(newCities);
    }
}
