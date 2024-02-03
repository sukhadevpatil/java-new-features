package com.core.concepts.newfeatures.java11;

public class StringFeatures {

    public static void main(String[] args) {
        System.out.println(" ".isBlank()); //true

        System.out.println(" ".isEmpty()); //false

        System.out.println("Geekfic\nGeekfic".lines().toList()); //["Geekfic", "Geekfic"]

        System.out.println(" Like ".strip());
        System.out.println(" Subscribe ".stripLeading());
        System.out.println(" Subscribe ".stripTrailing());
        System.out.println(" Subscribe ".stripIndent());

        System.out.println("Sukhdev ".repeat(3));
    }
}
