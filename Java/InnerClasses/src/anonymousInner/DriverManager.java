package anonymousInner;

public class DriverManager {
    static Connection getConnection() {

        Connection con = new Connection() {
            // this is an anonymous inner class which implements the Connection interface
            @Override
            public void createStatement() {
                System.out.println("anonymous inner class's method");
            }
        };
        return con;
    }
}
