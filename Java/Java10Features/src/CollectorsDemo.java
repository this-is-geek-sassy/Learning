import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> list = List.of(15, 20, 17, 30);
        List<Integer> list1 = list.stream().filter((i) -> i%3 == 0).collect(Collectors.toUnmodifiableList());

//        list1.add(45);    // gives exception
    }
}
