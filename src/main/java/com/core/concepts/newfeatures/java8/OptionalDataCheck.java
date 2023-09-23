package com.core.concepts.newfeatures.java8;

import com.core.concepts.newfeatures.java8.helper.Customer;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class OptionalDataCheck {

    public static void main(String[] args) throws Exception {
        System.out.println("Optional.empty() :: " + Optional.empty());

        Customer customer = new Customer(111L, "Dev", null, null);

        try {
            System.out.println("Optional.of :: " + Optional.of(customer.getEmail()));
        } catch (Exception exc) {
            log.error("Exception :: ", exc);
        }

        System.out.println("Optional.ofNullable :: " + Optional.ofNullable(customer.getEmail()));


        List<Customer> customers = Stream.of(new Customer(101L, "Ajay", "ajay@gmail.com", Arrays.asList("9988776655", "8899776655")),
                        new Customer(102L, "Amit", "amit@gmail.com", Arrays.asList("1122334455", "5544332211")),
                        new Customer(103L, "Peter", "peter@gmail.com", Arrays.asList("7459677889", "728990675")),
                        new Customer(104L, "John", "john@gmail.com", Arrays.asList("2211223344", "3333334455")))
                .collect(Collectors.toList());

        //orElseThrow
        Customer customer1 = customers.stream().filter(c -> c.getEmail().equals("amit@gmail.com")).findAny().orElseThrow(() -> new Exception("customer email id is null, check for findAny"));

        System.out.println(customer1);

    }
}
