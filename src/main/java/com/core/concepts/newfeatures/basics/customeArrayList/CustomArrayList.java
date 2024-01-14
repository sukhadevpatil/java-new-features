package com.core.concepts.newfeatures.basics.customeArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Create custom ArrayList to maintain unique values
 */
public class CustomArrayList<T> extends ArrayList<T> {
    @Override
    public boolean add(T t) {
        if(this.contains(t)) { //here duplication avoids
            return false;
        }
        return super.add(t);
    }

    public static void main(String[] args) {
        List<String> list = new CustomArrayList<>();
        list.add("Developer");
        list.add("Lead");
        list.add("Manager");

        list.add("Manager"); // trying to add duplicate value

        System.out.println(list);
    }
}
