package com.core.concepts.newfeatures.java14;

public class NullPointerExceptions {
    public static void main(String[] args) {
        //Java has made this easier by adding the capability to point out what exactly was null in a given line of code

        int[] arr = null;
        arr[0] = 1;

        //Throw exceptions -
        //java.lang.NullPointerException: Cannot store to int array because "arr" is null
        //which is more precise, where it occurred
    }
}
