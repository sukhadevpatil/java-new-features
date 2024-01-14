package com.core.concepts.newfeatures.basics.failFastAndSafe;

import java.util.*;

public class FailFastTest {

    public static void main1(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four");

        for (String s : list) {
            System.out.println(s);
            list.add("Ten"); //this is adding an element while iterating over list, which cause ConcurrentModificationException
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
            map.put("4", "Four"); // creates ConcurrentModificationException
        }
    }
}
