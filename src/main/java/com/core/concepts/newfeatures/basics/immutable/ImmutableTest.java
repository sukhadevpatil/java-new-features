package com.core.concepts.newfeatures.basics.immutable;

import java.util.Arrays;
import java.util.Date;

/**
 * to avoid mutation we need to create copy of custom object or collection object
 * for Date object you can clone it directly
 */
public class ImmutableTest {
    public static void main(String[] args) {
        Address address = new Address("Mumbai", "400 001");
        Employee employee = new Employee("Sukhdev", "Patil",
                new Date(), Arrays.asList("Developer", "Team Lead", "Scrum Master"),
                address);
        System.out.println(employee);

        //Trying to mutate
        employee.getDateOfJoining().setTime(1111111); //this would not modify value as we do clone on it
        employee.getRoles().add("Manager");
        employee.getAddress().setCity("Pune");

        System.out.println(employee);
    }
}
