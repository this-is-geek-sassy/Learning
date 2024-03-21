package jdbc_test;

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
					.getConnection("jdbc:mysql://localhost:3306/demo", "student", "Uwmcpaclwjk@03");
			
			System.out.println("Connection successful");
			
			mySmt = myConn.createStatement();
			myRes = mySmt.executeQuery("select * from employees");
			
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
