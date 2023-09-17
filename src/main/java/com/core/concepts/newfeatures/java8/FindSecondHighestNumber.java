package com.core.concepts.newfeatures.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
        int[] num = {5, 9, 11, 2, 8, 21, 1};

        List<Integer> data = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).toList();

        System.out.println(data);

        Integer secondHighestNum = Arrays.stream(num).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();

        System.out.println(secondHighestNum);
    }
}
