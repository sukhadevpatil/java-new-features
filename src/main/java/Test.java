import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String args[]){

        String s1=new String("hello");

        String s2="hello";

        String s3=s1.intern();

        System.out.println(s1==s2);

        System.out.println(s2==s3);

        Map<String, Integer> objMap = new HashMap<>();
        objMap.put("Emp4", 4);
        objMap.put("Emp3", 3);
        objMap.put("Emp1", 1);
        objMap.put("Emp2", 2);

        objMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> System.out.println(e.getKey() + "=" + e.getValue()));
        System.out.println("==============");

        //Second highest
        Map.Entry<String, Integer> entry = objMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(1);

        System.out.println(entry);

    }
}
