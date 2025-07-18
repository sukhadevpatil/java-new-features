package com.core.concepts.newfeatures;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<Student2> student2List = List.of(
                new Student2("A", "1", "A", List.of("A1", "A2", "A3")),
                new Student2("B", "2", "B", List.of("B1", "B2", "B3", "A1", "A2", "A3")),
                new Student2("C", "3", "C", List.of("C1", "C2", "C3", "C4", "A2", "A3")),
                new Student2("B", "2", "B", List.of("B1", "B2", "B3"))
        );

        //student2List.stream().distinct().forEach(System.out::println);

        System.out.println("======= Grouping by name, rollNo, address ============");
        student2List.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("======= Filtering having more than one count ============");
        student2List.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(val -> val.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Student2 {
    private String name, rollNo, address;
    private List<String> activities;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student2 student2)) return false;
        return Objects.equals(getName(), student2.getName())
                && Objects.equals(getRollNo(), student2.getRollNo())
                && Objects.equals(getAddress(), student2.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRollNo(), getAddress());
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
