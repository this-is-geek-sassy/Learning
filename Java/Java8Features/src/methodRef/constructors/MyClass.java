package methodRef.constructors;

public class MyClass {

    private String s;

    public MyClass(String s) {
        this.s = s;
        System.out.println("inside constructor: " + s);
    }
}
