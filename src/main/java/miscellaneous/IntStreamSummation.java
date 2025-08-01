package miscellaneous;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class IntStreamSummation {

    public static List<DataRecord> getData() {
        return List.of(
                new DataRecord("A", LocalDateTime.of(2024, 11, 22, 10, 0), 11.22f, 10),
                new DataRecord("A", LocalDateTime.of(2024, 3, 4, 11, 0), 3.04f, 12),
                new DataRecord("B", LocalDateTime.of(2024, 2, 3, 12, 0), 2.03f, 8),
                new DataRecord("B", LocalDateTime.of(2024, 4, 6, 13, 0), 4.06f, 7),
                new DataRecord("B", LocalDateTime.of(2024, 4, 5, 13, 0), 4.05f, 9),
                new DataRecord("C", LocalDateTime.of(2024, 5, 6, 14, 0), 5.06f, 11),
                new DataRecord("C", LocalDateTime.of(2024, 4, 5, 13, 0), 4.06f, 10)
        );
    }

    public static float sum(List<DataRecord> dataRecords) {
//        return dataRecords.stream()
//                .mapToInt(DataRecord::getNoOfNotebooks)
//                .sum();

        return dataRecords.stream()
                .collect(Collectors.summingInt(DataRecord::getNoOfNotebooks));
    }

    public static double averaging(List<DataRecord> dataRecords) {
        return dataRecords.stream()
                .collect(Collectors.averagingInt(DataRecord::getNoOfNotebooks));
    }

    public static void main(String[] args) {
        System.out.println("Sum of notebooks: " + sum(getData()));
        System.out.println("Avg. of notebooks: " + averaging(getData()));
    }
}

class DataRecord {
    private String name;
    private LocalDateTime timestamp;
    private float value;
    private int noOfNotebooks;

    public DataRecord(String name, LocalDateTime timestamp, float value, int noOfNotebooks) {
        this.name = name;
        this.timestamp = timestamp;
        this.value = value;
        this.noOfNotebooks = noOfNotebooks;
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

    public int getNoOfNotebooks() {
        return noOfNotebooks;
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
