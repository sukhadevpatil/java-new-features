package miscellaneous.interface_1;

import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> list = List.of(1,2,3,4,5);
        System.out.println(Multiplier.isEmpty(list));
    }
}
