package reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> myClass = Class.forName(Calculator.class.getName());
        System.out.println(myClass.getName());
        Constructor<?>[] constructors = myClass.getConstructors();
        System.out.println(Arrays.toString(constructors));
        // if there is no constructors, it will show o/p as: [public reflection.Calculator()]
        // if there are only private constructors, it will return an empty array.
        // if there are public constructors, it will show the array with elements being constructor signatures
        System.out.println(Arrays.toString(myClass.getMethods()));
    }
}
