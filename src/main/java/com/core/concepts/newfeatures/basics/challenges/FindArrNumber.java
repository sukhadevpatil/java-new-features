package com.core.concepts.newfeatures.basics.challenges;

import java.util.HashSet;
import java.util.Set;

public class FindArrNumber {

    public static boolean findNum(int [] arr, int targetNUm) {
        if(arr == null) {
            throw new IllegalArgumentException("Please provide non null input");
        }

        Set<Integer> targetSet = new HashSet<>();

        for(int i = 0; i <= arr.length; i++) {
            int requiredNum = targetNUm - arr[i];

            if(targetSet.contains(requiredNum)) {
                System.out.println(requiredNum);
                System.out.println(arr[i]);
                return true;
            } else {
                targetSet.add(arr[i]);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        boolean num = FindArrNumber.findNum(new int[]{10, 20, 30, 40, 50}, 70);
        System.out.println(num);
    }
}
