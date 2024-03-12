package abstraction;

public abstract class BMW {
    void commonFunc() {
        System.out.println("inside common functionality method");
    }
    abstract void accelerate();

//    abstract void brake();

    public static void main(String[] args) {
        System.out.println("inside the main method");
    }
}
