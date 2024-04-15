package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 70);
        map.put("Tom",60);
        map.put("Lee", 99);
        map.put("Brad", 80);
        map.put("John", 1);

        Set<String> keys = map.keySet();
        System.out.println("keys: " + keys);

        Collection<Integer> values = map.values();
        System.out.println("values: " + values);

        for (String key: keys) {
            System.out.println("Key: " + key + " -- value :" + map.get(key));
        }
    }
}
