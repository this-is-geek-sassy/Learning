public class Child extends Parent{
    Child() {
        System.out.println("Child object " + this);
    }
    @Override
    void f2() {
        super.f2();
        System.out.println(this);
        System.out.println("inside f2");
    }
}
