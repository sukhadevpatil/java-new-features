package com.core.concepts.newfeatures.java8.stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {
    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(v -> System.out.print(v + ","));
        System.out.println("");
        IntStream.rangeClosed(0, 10).forEach(v -> System.out.print(v + ","));
        System.out.println("");

        LongStream.range(0, 10).forEach(v -> System.out.print(v + ","));
        System.out.println("");
        LongStream.rangeClosed(0, 10).forEach(v -> System.out.print(v + ","));
        System.out.println("");

        IntStream.rangeClosed(0, 10).asDoubleStream().forEach(v -> System.out.print(v + ","));
    }
}
