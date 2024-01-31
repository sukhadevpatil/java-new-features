package com.core.concepts.newfeatures.basics.challenges;

import java.util.List;

public class LIstOnlyOddNumbers {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,5,7);

        System.out.println(isOnlyOddNumbers(list));
    }

    private static boolean isOnlyOddNumbers(List<Integer> list) {
        return list.stream().parallel().anyMatch(a -> a % 2 == 0);
    }
}
