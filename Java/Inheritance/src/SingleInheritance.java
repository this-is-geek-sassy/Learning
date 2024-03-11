public class SingleInheritance extends Object{

    void m1() {
        System.out.println("inside m1");
    }
    public static void main(String[] args) {
        SingleInheritance singleInheritance = new SingleInheritance();
        singleInheritance.m1();
        singleInheritance.hashCode();
//        singleInheritance.finalize();
        singleInheritance.getClass();
    }
}
