package com.core.concepts.newfeatures.basics.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable - useful for single field & have to implement/customization in the main object
 * which is not feasible every time e.g. if that object is from some third provider, i.e. not in our control
 */
public class TestComparable {

    public static void main1(String[] args) {
        Student s1 = new Student(91, "Dev");
        Student s2 = new Student(12, "Charlie");
        Student s3 = new Student(1, "Tango");
        Student s4 = new Student(10, "Amit");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        Collections.sort(studentList);
        System.out.println(studentList);
    }

    public static void main(String[] args) {
        Student s1 = new Student(91, "Dev");
        Student s2 = new Student(12, "Charlie");
        Student s3 = new Student(1, "Tango");
        Student s4 = new Student(10, "Amit");
        Student s5 = new Student(1, "Tommy");
        Student s6 = new Student(1, "Tab");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        Collections.sort(studentList, new IdComparator()); //if need to sort based on rollNo && name as well
        //Collections.sort(studentList, new NameComparator()); // if need to sort based on name
        System.out.println(studentList);
    }
}
