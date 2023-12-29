package com.core.concepts.newfeatures.basics;

public class Child extends Parent {

    @Override
    public void hello() {
        System.out.println("Child hello()...");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.hello();
    }
}

class Parent {
    public void hello() {
        System.out.println("Parent hello()...");
    }
}