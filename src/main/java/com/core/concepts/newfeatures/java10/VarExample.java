package com.core.concepts.newfeatures.java10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class VarExample {
    public static void main(String[] args) {
        var val = 10;
        //z = "test"; //can not reassign with different data type
        val = 1;
        System.out.println(val);

        //can define Map as var
        Map<String, List<String>> map = new HashMap<>();
        var map2 = new HashMap<String, List<String>>();


        Consumer<Integer> consumer = (i) -> {
            var z = 10;
            System.out.println(z);

            System.out.println(i);
        };

        consumer.accept(20);

        //We can define collection as var
        List<String> list = new ArrayList<>();
        var list2 = new ArrayList<String>();

        //list2.add(10); // generic type will not allow
        list2.add("test");
        System.out.println(list2);


    }
}
