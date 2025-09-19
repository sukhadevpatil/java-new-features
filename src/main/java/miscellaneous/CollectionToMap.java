package miscellaneous;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionToMap {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("John", "Pune"),
                new Person("Amit", "Sangli"),
                new Person("Tim", "Satara"),
                new Person("Tim", "Satara"),
                new Person("Chandan", "Kolhapur"));

        //Following snippet would not handle duplicate key - will throw exception
        //Map<String, String> personMap = personList.stream().collect(Collectors.toMap(Person::name, Person::city));
        //System.out.println(personMap);

        HashMap<String, Person> personConcurrentHashMap = personList.stream().collect(Collectors
                .toMap(Person::name, Function.identity(), (o1, o2) -> o1, HashMap::new));

        System.out.println(personConcurrentHashMap);
    }

    public record Person (String name, String city) {}
}
