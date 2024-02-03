package com.core.concepts.newfeatures.java10;

import java.util.Arrays;
import java.util.List;

public class UnmodifieableCollection {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> list2 = list.stream().filter(i -> i % 3 == 0).toList();

        //ImmutableCollections - trying to modify collection will throw an exception
        //list2.add(100);

        System.out.println(list2);
    }
}
