package com.core.concepts.newfeatures.java8;

public class StringJoin {

    //String join
    public static void main(String[] args) {
        String[] cities = {"Mumbai", "Pune", "Nashik", "Nagpur"};

        String places = String.join("-", cities);
        System.out.println(places);
    }
}
