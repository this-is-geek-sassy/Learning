//package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_test {

    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement mySmt = null;
        ResultSet myRes = null;

        try {
//			Class.forName("")
            myConn = DriverManager
                    .getConnection("jdbc:oracle:thin:@tcp://localhost:1521/xepdb1", "hr", "hr");

            System.out.println("Connection successful");

            mySmt = myConn.createStatement();
            long rowsAffected = mySmt.executeLargeUpdate("" +
                    "insert into employees_duplicate " +
                    "(last_name, first_name, email, department_id, salary, hire_date, job_id)" +
                    "values" +
                    "('Wright', 'Eric', 'eric.wright@foo.com', '40', 330000.00, '17-JUN-03', 'HR_REP')");

            myRes = mySmt.executeQuery("select * from employees_duplicate");

            while (myRes.next()) {
                System.out.println(myRes.getString("last_name") + ", " + myRes.getString("first_name"));
            }
        }catch (Exception exc) {
            exc.printStackTrace();
        }
        finally {
            if (myRes != null) {
                myRes.close();
            }

            if (mySmt != null) {
                mySmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    }

}
