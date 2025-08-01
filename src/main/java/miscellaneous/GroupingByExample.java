package miscellaneous;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------");

        getPlayers2().entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().forEach(System.out::println);
        System.out.println("--------------------------------------------");

        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    public static List<Player> getPlayers() {
        return Arrays.asList(new Player("Virat Kohali", "Bangalore", 1), new Player("Rajat Patidar", "Bangalore", 1), new Player("Rohit Sharma", "Mumbai", 2), new Player("Hardik Pandya", "Mumbai", 3), new Player("Krunal Pandya", "Gujrat", 4), new Player("Rishabh Pant", "Lakhnow", 5));
    }

    public static Map<String, String> getPlayers2() {
        return Map.of("Virat Kohali", "Bangalore",
                "Rajat Patidar", "Bangalore",
                "Rohit Sharma", "Mumbai",
                "Hardik Pandya", "Mumbai",
                "Krunal Pandya", "Gujrat",
                "Rishabh Pant", "Lakhnow");

    }
}

@Data
class Player {
    String name;
    String team;
    int score;

    Player(String name, String team, int score) {
        this.name = name;
        this.team = team;
        this.score = score;
    }
}
