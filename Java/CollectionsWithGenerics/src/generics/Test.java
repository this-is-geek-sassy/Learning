package generics;

public class Test {
    public static void main(String[] args) {
        MyGenericClass<String> s = new MyGenericClass<>("abc");
        s.displayObjectType();
        System.out.println(s.getObject());

        MyGenericClass<Integer> i = new MyGenericClass<>(123);
        i.displayObjectType();
        System.out.println(i.getObject().toString());

        MyGenericClass<Double> d = new MyGenericClass<>((double)123);
        i.displayObjectType();
        System.out.println(i.getObject().toString());
    }
}
