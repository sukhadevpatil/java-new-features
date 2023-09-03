package com.core.concepts.newfeatures.java11;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;

public class NestMates {

    /**
     * A nest of classes in Java implies both the outer/main class and all its nested classes
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(NestMates.class.isNestmateOf(NestMates.NestedClass.class));

        Set<String> nestedMembers = Arrays.stream(NestMates.NestedClass.class.getNestMembers())
                .map(Class::getName)
                .collect(Collectors.toSet());

        System.out.println(nestedMembers);
        System.out.println((nestedMembers).contains(NestMates.class.getName()));
    }

    class NestedClass {

    }
}
