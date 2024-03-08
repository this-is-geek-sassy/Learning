package p1;

import AccessModifiers.A;

public class C extends A {
    public static void main(String[] args) {
        A aObj = new A();
//        System.out.println(aObj.a);
//        System.out.println(aObj.b);
//        System.out.println(aObj.c);  // c will be accessible only when an object of class C
                                     // will try to access c
        System.out.println(aObj.d);

        C cObj = new C();
        System.out.println(cObj.c);  // now c is accessible
        System.out.println(cObj.d);
    }
}
