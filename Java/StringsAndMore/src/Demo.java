public class Demo {

    int num;
    static Demo obj;
    static {
        System.out.println(Demo.obj);
        Demo.obj = new Demo();
        System.out.println(Demo.obj);
    }
    Demo() {
        System.out.println("this inside the def constructor : " + this);
        System.out.println("this.x : " + this.num);
    }

    public static void main(String[] args) {
        System.out.println(Demo.obj);
        new Demo();
        new Demo();
    }
}
