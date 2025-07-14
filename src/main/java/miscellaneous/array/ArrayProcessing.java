package miscellaneous.array;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class ArrayProcessing {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4, 5,6,7};

        int [] arr2 = Arrays.copyOf(arr, arr.length);

        System.out.println(Arrays.toString(arr2));

        Integer [] arr3 = stream(arr).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr3));

        List<Integer> list = Arrays.stream(arr3).toList();
        System.out.println(list);

        double [] prices = {1.1, 2.2, 3.3, 4.4, 5.5};

        DoubleStream dbStream = Arrays.stream(prices);
        List<Double> prices2 = dbStream.boxed().toList();

        prices2.stream().max(Double::compare).ifPresent(System.out::println);

        System.out.println(prices2);

        System.out.println("-----------------------------");

        int [] arr4 = {10, 4, 5, 3, 6, 9, 1, 2, 8, 7, 0};
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

        Integer [] arr5 = {10, 4, 5, 3, 6, 9, 1, 2, 8, 7, 0};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));

        int [] largerArray = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < largerArray.length; i++) {
            largerArray[i] = rand.nextInt(10000);
        }
        System.out.println(Arrays.toString(largerArray));
        Arrays.parallelSort(largerArray);
        System.out.println(Arrays.toString(largerArray));

        System.out.println("================================");

        int [] arr6 = new int [10];
        Arrays.fill(arr6, 25);
        System.out.println(Arrays.toString(arr6));

        int [] arr7 = new int [10];
        Arrays.setAll(arr7, i -> i);
        System.out.println(Arrays.toString(arr7));

        System.out.println("---------------------------");

        String [] arr8 = {"Easy", "Bytes"};
        Stream<String> stream1 = Arrays.stream(arr8);
        Stream<String[]> stream2 = stream1.map(s -> s.split(""));
        stream2.flatMap(Arrays::stream).forEach(System.out::println);

    }
}
