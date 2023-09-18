package com.core.concepts.newfeatures.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {

    public static void main(String[] args) {

        Map<String, Integer> empMap = new HashMap<>();
        empMap.put("Dev 1", 4500000);
        empMap.put("Dev 2", 4100000);
        empMap.put("Dev 3", 4400000);
        empMap.put("Dev 4", 4200000);

        Map.Entry<String, Integer> result = getNthHighestSalaryEmp(1, empMap);

        System.out.println(result);

        System.out.println("=================================================");

        empMap.clear();
        //If the multiple employees have same salaries
        empMap.put("Dev 1", 4400000);
        empMap.put("Dev 2", 4400000);
        empMap.put("Dev 3", 4200000);
        empMap.put("Dev 4", 4200000);
        empMap.put("Dev 5", 4500000);
        empMap.put("Dev 6", 4500000);

        Map.Entry<Integer, List<String>> result2 = getNthHighestSalaryEmpHavingSameSalaries(3, empMap);

        System.out.println(result2);

    }

    private static Map.Entry<Integer, List<String>> getNthHighestSalaryEmpHavingSameSalaries(int indexPosition, Map<String, Integer> empMap) {
        return empMap.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry :: getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(indexPosition - 1);
    }

    private static Map.Entry<String, Integer> getNthHighestSalaryEmp(int indexPosition, Map<String, Integer> empMap) {

        return empMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(indexPosition - 1);
    }
}
