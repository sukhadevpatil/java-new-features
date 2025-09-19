package miscellaneous.interface_1;

import java.util.List;

public interface Multiplier {

    static boolean isEmpty(List<Integer> list) {
        return list != null && !list.isEmpty();
    }
}
