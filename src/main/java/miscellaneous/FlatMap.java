package miscellaneous;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<StudentClazz> studentClazzes = List.of(
                new StudentClazz("A", "1", "A", List.of("A1", "A2", "A3")),
                new StudentClazz("B", "2", "B", List.of("B1", "B2", "B3"))
        );

        studentClazzes.stream().map(StudentClazz::getActivities)
                .flatMap(List::stream)
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
