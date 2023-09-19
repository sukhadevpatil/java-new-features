package com.core.concepts.newfeatures.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ConcurrentExceptionFix {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(4);
        integers.add(2);
        integers.add(3);

        //This will throw exception
        /*for (Integer integer : integers) {
            integers.remove(1);
        }*/

        List<Integer> toRemove = new ArrayList<>();

        for (Integer integer : integers) {
            if(integer == 1) {
                toRemove.add(integer);
            }
        }
        integers.removeAll(toRemove);

        System.out.println(integers);

        System.out.println("==================================================");

        for(Iterator<Integer> iterator = integers.iterator(); iterator.hasNext();) {
            Integer integer = iterator.next();
            if(integer == 2) {
                iterator.remove();
            }
        }

        //integers.removeIf(integer -> integer == 2);

        System.out.println(integers);

        System.out.println("============================================");
        integers.add(1);
        integers.add(2);

        List<Integer> list = integers.stream().filter(val -> val != 4).toList();

        System.out.println(list);

        System.out.println("===============================================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // Iterating over object elements using iterator
        Iterator<Integer> iterator = list1.iterator();

        while(iterator.hasNext()) {
            Integer value = iterator.next();

            // If element equals certain value
            if (value.equals(2)) {
                iterator.remove();
            }
        }
    }
}
