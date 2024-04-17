package lambda.basics;

public class Test {

    public static void main(String[] args) {
//        lambdas.basics.A a = new lambdas.basics.C();
//        a.myMethod();
        A a = () -> System.out.println("inside myMethod arrow");
        a.myMethod();
    }
}
