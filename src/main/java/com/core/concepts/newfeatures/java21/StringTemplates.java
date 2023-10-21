package com.core.concepts.newfeatures.java21;

import java.text.MessageFormat;

public class StringTemplates {

    /**
     * Have various string composition in Java
     * 1. Concatenation e.g. "My name is " + name
     *
     * 2. StringBuffer & StringBuilder
     * e.g. new StringBuilder().append("My name is ").append(name)
     *
     * 3. String Formatter
     * e.g. String.format("My name is  %s", name)
     *
     * 4. MessageFormat -
     * MessageFormat.format("My name is {0}, and age is {1}", name, 30);
     */
    public static void main(String[] args) {
        String name = "Sukhdev Patil";
        Integer age = 41;
        System.out.println(MessageFormat.format("My name is {0}, and age is {1}", name, age));

        //STR Template Processor

    }
}
