package exception;

public class UncheckedException1 extends RuntimeException{

    public UncheckedException1() {
        super();
    }

    public UncheckedException1(String s) {
        super(s);
        System.out.println("Exception: " + s);
    }
}
