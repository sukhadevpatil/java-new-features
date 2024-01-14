package com.core.concepts.newfeatures.basics.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Employee {
    private final String firstName;
    private final String lastName;

    private final Date dateOfJoining;

    private final List<String> roles;

    private final Address address;


    public Employee(String firstName, String lastName, Date dateOfJoining, List<String> roles, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfJoining = dateOfJoining;
        this.roles = roles;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfJoining() {
        //return dateOfJoining;
        //cloning would prevent the value mutation of date object
        return (Date) dateOfJoining.clone();
    }

    public List<String> getRoles() {
        //return roles;
        return new ArrayList<>(roles); //creates copy of collection to avoid mutation
    }

    public Address getAddress() {
        //return address;
        return new Address(address.getCity(), address.getZip()); //to avoid mutation we need to create copy of custom object
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", roles=" + roles +
                ", address=" + address +
                '}';
    }
}
