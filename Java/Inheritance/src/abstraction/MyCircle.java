package abstraction;

public class MyCircle implements Circle, Circle2{
    @Override
    public void calculateArea() {
//        pi = 4.32f;
        System.out.println(Circle.pi);
    }

    @Override
    public void calculateArea(float radius) {
        System.out.println(Circle2.pi * radius * radius);
    }
}
