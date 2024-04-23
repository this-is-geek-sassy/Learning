package reflection;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println(Class.forName(Calculator.class.getName()));
    }
}
