package exception;

public class IllegalArgumentExceptionDemo {
    public int sum(int a, int b) {
        if (a==0 || b==0) {
            throw new IllegalArgumentException("a and b should not be zero");
        }
        return a+b;
    }
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setPriority(11);
    }
}
