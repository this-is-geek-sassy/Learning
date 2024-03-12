package abstraction;

public class MyCircle implements Circle{
    @Override
    public void calculateArea(float radius) {
//        pi = 4.32f;
        System.out.println(pi*radius*radius);
    }
}
