package methodRef;

public class MyClass {

    public void myMethod1 (int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {

//        MyInterface f = i -> System.out.println(i);
        MyClass c = new MyClass();
        MyInterface f = c::myMethod1;
        f.myMethod(10);
    }
}
