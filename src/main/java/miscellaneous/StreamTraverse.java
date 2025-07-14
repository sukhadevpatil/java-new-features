package miscellaneous;

import java.util.List;
import java.util.stream.Stream;

public class StreamTraverse {
    public static void main(String[] args) {
        List<String> list = List.of("One", "Two", "Three", "Four");

        Stream<String> stream = list.stream();

        stream.forEach(System.out::println);

        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        stream.forEach(System.out::println);
    }
}
