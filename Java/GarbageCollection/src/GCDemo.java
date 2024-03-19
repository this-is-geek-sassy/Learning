public class GCDemo {
    public GCDemo() {
        System.out.println(this + " created");
    }

    public static void main(String[] args) {
        GCDemo gcDemo = new GCDemo();
        GCDemo gcDemo1 = new GCDemo();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + " finalized");
    }
}
