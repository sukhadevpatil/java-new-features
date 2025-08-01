package miscellaneous;

import java.util.*;
import java.util.stream.Collectors;

public class MapSortingExample {
    public static void main(String[] args) {
        // Original map
        Map<String, String> map = new HashMap<>();
        map.put("key1", "zebra");
        map.put("key2", "apple");
        map.put("key3", "banana");
        map.put("key4", "cat");

        // Sort by values
        Map<String, String> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // merge function in case of duplicate keys
                        LinkedHashMap::new // to maintain insertion order
                ));

        // Print the sorted map
        sortedMap.forEach((k, v) -> System.out.println(STR."\{k} = \{v}"));

        System.out.println("=====================================================");

        // Alternative: Sort by values using a List and LinkedHashMap
        List<Map.Entry<String, String>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue(String.CASE_INSENSITIVE_ORDER));

        Map<String, String> sortedMap2 = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : entryList) {
            sortedMap2.put(entry.getKey(), entry.getValue());
        }

        sortedMap2.entrySet().stream().forEach(System.out::println);

        System.out.println("=====================================================");

        // Using streams and manual insertion
        Map<String, String> sortedMap3 = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(String.CASE_INSENSITIVE_ORDER))
                .forEachOrdered(e -> sortedMap3.put(e.getKey(), e.getValue()));

        sortedMap3.entrySet().forEach(System.out::println);

        System.out.println("=====================================================");
    }
}
