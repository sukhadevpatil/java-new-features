package scaler;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

class DataRecord {
    private String name;
    private LocalDateTime timestamp;
    private float value;

    public DataRecord(String name, LocalDateTime timestamp, float value) {
        this.name = name;
        this.timestamp = timestamp;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DataRecord{" +
                "name='" + name + '\'' +
                ", timestamp=" + timestamp +
                ", value='" + value + '\'' +
                '}';
    }
}
public class Lambda {
    public static void main(String[] args) {
        List<DataRecord> dataRecords = List.of(
                new DataRecord("A", LocalDateTime.of(2024, 11, 22, 10, 0), 11.22f),
                new DataRecord("A", LocalDateTime.of(2024, 3, 4, 11, 0), 3.04f),
                new DataRecord("B", LocalDateTime.of(2024, 2, 3, 12, 0), 2.03f),
                new DataRecord("B", LocalDateTime.of(2024, 4, 6, 13, 0), 4.06f),
                new DataRecord("B", LocalDateTime.of(2024, 4, 5, 13, 0), 4.05f),
                new DataRecord("C", LocalDateTime.of(2024, 5, 6, 14, 0), 5.06f),
                new DataRecord("C", LocalDateTime.of(2024, 4, 5, 13, 0), 4.06f)
        );
        Map<String, List<Float>> groupedValues =
                dataRecords.stream()
                .sorted(Comparator.comparing(DataRecord::getTimestamp)) // Sort by timestamp
                .collect(Collectors.groupingBy(
                        DataRecord::getName, // Group by name
                        Collectors.mapping(DataRecord::getValue, Collectors.toList())
                ));

        Map<String, TreeSet<DataRecord>> groupedValues2 = dataRecords.stream()
                .collect(Collectors.groupingBy(DataRecord::getName,
                        Collectors.mapping(Function.identity(),
                                Collectors.toCollection(
                                        () -> new TreeSet<>(Comparator.comparing(e -> e.getTimestamp()))))));

        Map<String, TreeSet<DataRecord>> groupedValues3 = dataRecords.stream()
                .collect(Collectors.groupingBy(DataRecord::getName,
                        Collectors.toCollection(
                                        () -> new TreeSet<>(Comparator.comparing(e -> e.getTimestamp())))));


        //groupedValues.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println(groupedValues);
        System.out.println(groupedValues2);
        System.out.println(groupedValues3);
    }
}
