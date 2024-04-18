package methodRef.constructors;

public class Test {

    public static void main(String[] args) {

        MyInterface f1 = s -> new MyClass(s);
        f1.get("using lambdas");

        MyInterface f2 = MyClass::new;   // constructor mapping
        f2.get("using constructor mapping");
    }
}
