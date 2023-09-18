package com.core.concepts.newfeatures.java8;

import java.util.stream.IntStream;

public class SkipLimit {

    //Skip particular elements - 1,10 & print (2 to 9)

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);
    }
}
