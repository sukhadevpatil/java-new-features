package com.core.concepts.newfeatures.basics.comparableComparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getRollNo() == o2.getRollNo()) {
            return o1.getName().compareTo(o2.getName());
        } else if(o1.getRollNo() > o2.getRollNo()) {
            return 1;
        }
        return -1;
    }
}
