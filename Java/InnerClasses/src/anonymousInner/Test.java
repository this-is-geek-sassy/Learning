package anonymousInner;

public class Test {
    public static void main(String[] args) {
        Connection connection = DriverManager.getConnection();
        connection.createStatement();
    }
}
