package com.core.concepts.newfeatures.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

public class PseudoRandomNumberGenerators {

    public static void main(String[] args) {
        int streamSize = 0;
        String algorithm = "Random";
        IntStream intStream = RandomGeneratorFactory.of(algorithm)
                .create()
                .ints(streamSize, 0,100);

        System.out.println(intStream);
    }
}
