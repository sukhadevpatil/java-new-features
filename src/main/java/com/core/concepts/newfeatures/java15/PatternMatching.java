package com.core.concepts.newfeatures.java15;

public class PatternMatching {

    /**
     * The pattern matching feature was previewed in Java 14,
     * and Java 15 aims to continue its preview status with no new enhancements.
     * @param args
     */
    public static void main(String[] args) {

        Employee employee = new Employee("Dev", 38, "Mumbai");

        Object object = employee;

        //JVM automatically casts the variable
        if (object instanceof Employee emp) {
            String name = employee.name;
            System.out.println(name + "\n" + emp.age + "\n" + emp.city);
        }

    }

    public record Employee(String name, int age, String city) { };
}
