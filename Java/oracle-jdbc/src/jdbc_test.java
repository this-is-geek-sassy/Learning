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
            long rowsAffectedByInsert = mySmt.executeLargeUpdate("" +
                    "insert into employees_duplicate " +
                    "(last_name, first_name, email, department_id, salary, hire_date, job_id)" +
                    "values" +
                    "('Wright', 'Eric', 'eric.wright@foo.com', '40', 330000.00, '17-JUN-03', 'HR_REP')");

            int rowsAffectedByUpdate = mySmt.executeUpdate("" +
                    "update employees_duplicate " +
                    "set EMPLOYEE_ID=(select (select max(employee_id) " +
                                        "FROM employees_duplicate) + 1 " +
                                        "from dual) " +
                    "where first_name='Eric' and last_name='Wright'");

            int rowsAffectedByDelete = mySmt.executeUpdate("" +
                    "delete from employees_duplicate " +
                    "where first_name='Eric' and last_name='Wright'");

            if (rowsAffectedByInsert >= 1 && rowsAffectedByUpdate >= 1 && rowsAffectedByDelete >= 1) {
                System.out.println("Updation & deletion successful!");
            }

            myRes = mySmt.executeQuery("select * from employees_duplicate");

            while (myRes.next()) {
                System.out.println(myRes.getString("employee_id") + ", "
                        + myRes.getString("last_name") + ", "
                        + myRes.getString("first_name"));
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
