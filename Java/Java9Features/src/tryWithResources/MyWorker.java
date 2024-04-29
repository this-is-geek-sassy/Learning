package tryWithResources;

public class MyWorker implements AutoCloseable{

    public MyWorker() {
        System.out.println("creating the resource");
    }

    public void doSomething() {
        System.out.println("doing something");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource");
    }
}
