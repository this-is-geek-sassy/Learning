package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<?> myClass = Class.forName(Calculator.class.getName());
        System.out.println(myClass.getName());
        Constructor<?>[] constructors = myClass.getConstructors();
        System.out.println(Arrays.toString(constructors));
        // if there is no constructors, it will show o/p as: [public reflection.Calculator()]
        // if there are only private constructors, it will return an empty array.
        // if there are public constructors, it will show the array with elements being constructor signatures
        System.out.println(Arrays.toString(myClass.getMethods()));


        // access default constructor
        Constructor<?> defaultConstructor = myClass.getConstructor( null);
        Calculator createdObject = (Calculator) defaultConstructor.newInstance(null);
        System.out.println(createdObject);

        // access parameterized constructor
        Constructor<?> parameterizedConstructor = myClass.getConstructor(double.class, double.class);
        Calculator createdObjectUsingParameterizedConstructor = (Calculator) parameterizedConstructor.newInstance(4.8, 3.2);
        System.out.println(createdObjectUsingParameterizedConstructor);

        Method getNum1 =  myClass.getMethod("getNum1", null);
        double num1 = (double) getNum1.invoke(createdObjectUsingParameterizedConstructor, null);
        System.out.println("num1: " + num1);
//        System.out.println(getNum1.invoke(createdObjectUsingParameterizedConstructor, null));

        Method setNum1 = myClass.getMethod("setNum1", double.class);
        setNum1.invoke(createdObjectUsingParameterizedConstructor, 45.3);
        System.out.println("createdObjectUsingParameterizedConstructor: " + createdObjectUsingParameterizedConstructor);

        Method sum = myClass.getMethod("sum", int.class, int.class);
        System.out.println(sum.invoke(createdObjectUsingParameterizedConstructor, 3, 4));

//        Field num1Field = myClass.getField("num1");
//        System.out.println(num1Field);

        Field num1Field = myClass.getDeclaredField("num1");
        num1Field.setAccessible(true);
        num1Field.set(createdObjectUsingParameterizedConstructor, 300);
        double newNum1Value = (double) num1Field.get(createdObjectUsingParameterizedConstructor);
        System.out.println(newNum1Value);

        Annotation[] annotations = myClass.getAnnotations();
        System.out.println(Arrays.toString(annotations));
    }
}
