package com.core.concepts.newfeatures.basics.challenges;

import java.util.LinkedList;
import java.util.List;

public class DescendingIterator {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> list2 = new LinkedList<>();
        list.descendingIterator().forEachRemaining(list2::add);

        System.out.println(list2);
    }
}
