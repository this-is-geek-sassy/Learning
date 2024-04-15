package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map = new IdentityHashMap<>();

        Integer id1 = Integer.valueOf(20),
                id2 = Integer.valueOf(20);

        map.put(id1, "Bharat");
        map.put(id2, "Sharat");
        System.out.println(map);
    }
}
