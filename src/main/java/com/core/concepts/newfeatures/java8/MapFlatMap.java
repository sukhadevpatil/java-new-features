package com.core.concepts.newfeatures.java8;

import com.core.concepts.newfeatures.java8.helper.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMap {

    public static void main(String[] args) {

        //.map() - data transformation

        //.flatMap() - data transformation & flattening

        List<Customer> customers = Stream.of(new Customer(101L, "Ajay", "ajay@gmail.com", Arrays.asList("9988776655", "8899776655")),
                        new Customer(102L, "Amit", "amit@gmail.com", Arrays.asList("1122334455", "5544332211")),
                        new Customer(103L, "Peter", "peter@gmail.com", Arrays.asList("7459677889", "728990675")),
                        new Customer(104L, "John", "john@gmail.com", Arrays.asList("2211223344", "3333334455")))
                .collect(Collectors.toList());

        //map - one to one mapping
        List<String> emailIds = customers.stream().map(Customer::getEmail).collect(Collectors.toList());

        System.out.println(emailIds);

        //without flatMap
        System.out.println(customers.stream().map(Customer::getPhoneNumbers).collect(Collectors.toList()));

        //flatMap - one to many mapping
        List<String> phoneNumbers = customers.stream().flatMap(c -> c.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers);

    }
}
