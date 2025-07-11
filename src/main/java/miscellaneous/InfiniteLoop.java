package miscellaneous;

import java.util.Random;
import java.util.stream.Stream;

public class InfiniteLoop {
    public static void main(String[] args) {
        //Stream.generate(new Random()::nextInt).forEach(System.out::println);

        Stream.iterate(0, i -> i + 1).forEach(System.out::println);
    }
}
