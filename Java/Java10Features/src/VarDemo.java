import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VarDemo {

    public static void main(String[] args) {
        int x = 10;
        float f = 30.0f;
        var name = "saswata";    // inferred type
//        name = 10;    // type mismatch, as java is a strongly typed language

        Map<String, List<String>> map = new HashMap<>();
        var map2 = new HashMap<String, List<String>>();

        for (Map.Entry<String, List<String>> entry: map2.entrySet()) {}

        for (var entry: map2.entrySet()) {
            var value = entry.getValue();
            System.out.println(value);
        }
    }
}
