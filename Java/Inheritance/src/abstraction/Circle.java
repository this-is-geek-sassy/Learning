package abstraction;

public interface Circle {

    public static float pi = 3.14f;    // redundant because by default jvm considers these variable as constants
//    private void calculateArea();      // not permeable by jvm,
    // only public access modifier is allowed in case of interface methods

    public void calculateArea(float radius);
}
