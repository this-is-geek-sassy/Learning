package classLoading;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> c = Class.forName("classLoading.User");

        Method[] methods = c.getDeclaredMethods();

        for (Method m: methods) {
            System.out.println(m.getName());
        }
        System.out.println("No of methods: " + methods.length);
    }
}
