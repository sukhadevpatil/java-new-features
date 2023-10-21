package com.core.concepts.newfeatures.java21;

import java.text.MessageFormat;

import static java.lang.StringTemplate.RAW;
import static java.lang.StringTemplate.STR;
import static java.util.FormatProcessor.FMT;

public class StringTemplates {

    /**
     * Have various string composition in Java
     * 1. Concatenation e.g. "My name is " + name
     * <p>
     * 2. StringBuffer & StringBuilder
     * e.g. new StringBuilder().append("My name is ").append(name)
     * <p>
     * 3. String Formatter
     * e.g. String.format("My name is  %s", name)
     * <p>
     * 4. MessageFormat -
     * MessageFormat.format("My name is {0}, and age is {1}", name, 30);
     */
    public static void main(String[] args) {
        String name = "Sukhdev Patil";
        Integer age = 41;
        System.out.println(MessageFormat.format("My name is {0}, and age is {1}", name, age));

        //STR Template Processor

        String result1 = STR. "My name is \{ name }, and age is \{ age }" ;
        System.out.println(result1);


        //FMT Template Processor
        String result2 = FMT
                . """
                  {
                    "name": "%1s\{ name }",
                    "age": "%2.2s\{ age }"
                  }
                  """ ;
        System.out.println(result2);


        StringTemplate stringTemplate = RAW. "I am \{ getName() }, and age is \{ getAge() }" ;
        String result3 = STR.process(stringTemplate);
        System.out.println(result3);
    }

    private static String getName() {
        return "Stranger";
    }

    private static int getAge() {
        return 40;
    }
}
