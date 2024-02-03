package com.core.concepts.newfeatures.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamDropWhile {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,7,8, null);

        System.out.println(list.stream().takeWhile(x -> x % 2 == 0).toList());
        System.out.println(list.stream().dropWhile(x -> x % 2 == 0).toList());
        System.out.println(list.stream().flatMap(Stream::ofNullable).toList());
        System.out.println(list.stream().filter(Objects::nonNull).toList());

    }
}
