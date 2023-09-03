package com.core.concepts.newfeatures.java12;

public class InstanceOfPatternMatching {

    public static void main(String[] args) {
        //Old style - we would have to explicitly typecast the object to access its features
        Object obj = "Hello World!";
        if (obj instanceof String) {
            String s = (String) obj;
            int length = s.length();
            System.out.println(length);
        }

        //we can declare the new typecasted variable directly in the statement
        //compiler will automatically inject the typecasted String s
        if (obj instanceof String s) {
            int length = s.length();
            System.out.println(length);
        }



    }
}
