package exception;

public class TestMainMethod {
    public static void main(String[] args) throws CheckedCustomException {
//        throw new UncheckedException1("Saswata");
        throw new CheckedCustomException("Business exception that needs to be handled");
    }
}
