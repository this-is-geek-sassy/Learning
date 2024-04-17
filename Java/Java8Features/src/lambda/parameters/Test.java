package lambda.parameters;

public class Test {

    public static void main(String[] args) {
//        Sum s = Integer::sum;   // what syntax is this

        Sum s = (a, b) -> { return a+b; };
        int add = s.add(2, 3);
        System.out.println(add);
    }
}
