package abstraction;

public class Test {
    public static void main(String[] args) {
//        BMW bmw = new BMW();
        BMW bmw1 = new ThreeSeries();
        bmw1.commonFunc();
        bmw1.accelerate();

        BMW bmw2 = new FiveSeries();
        bmw2.accelerate();
        bmw2.commonFunc();

        Honda honda = new Honda();
        honda.go();  honda.stop();
    }
}
