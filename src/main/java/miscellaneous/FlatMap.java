package miscellaneous;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<StudentClazz> studentClazzes = List.of(
                new StudentClazz("A", "1", "A", List.of("A1", "A2", "A3")),
                new StudentClazz("B", "2", "B", List.of("B1", "B2", "B3", "A1", "A2", "A3"))
        );

        Set<String> activities = studentClazzes.stream().map(StudentClazz::getActivities)
                .flatMap(List::stream)
                        .collect(Collectors.toSet());

        System.out.println(activities);

        studentClazzes.stream().map(StudentClazz::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("======================================================");

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Orange", "Banana", "Apple"),
                Arrays.asList("Mango", "Pineapple", "Guava"),
                Arrays.asList("Banana", "Mango", "Pineapple")
        );

        listOfLists.stream()
                .flatMap(List::stream)
                .distinct()
                .forEach(System.out::println);

    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class StudentClazz {
    private String name, rollNo, address;
    private List<String> activities;
}
