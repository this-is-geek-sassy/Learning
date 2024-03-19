public class GCDemo {
    private int objID;
    public GCDemo(int objID) {
        this.objID = objID;
        System.out.println("created " + this.objID);
    }

    public static void main(String[] args) {
//        GCDemo gcDemo = new GCDemo();
//        GCDemo gcDemo1 = new GCDemo();
        new GCDemo(1);
        new GCDemo(2);
        for (int i = 1; i <= 100; i++) {
            System.gc();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalized " + this.objID);
    }
}
