package jdbc_test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.concurrent.Callable;

public class jdbc_test {
	
	public static void main(String[] args) throws SQLException {
		
		Connection myConn = null;
		Statement mySmt = null;
		ResultSet myRes = null;
		
		try {
//			Class.forName("")
			myConn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false", "student", "Uwmcpaclwjk@03");
			
			System.out.println("Connection successful");
			
			mySmt = myConn.createStatement();
			myRes = mySmt.executeQuery("select * from employees");
			
			/*
			 * while (myRes.next()) { System.out.println(myRes.getString("last_name") + ", "
			 * + myRes.getString("first_name")); }
			 */
			String department = "Engineering";
			int increaseAmmount = 100;
			
			showSalaries(myConn, department);
			
			CallableStatement statement = myConn.prepareCall("{call increase_salaries_for_department(?, ?)}");
			statement.setString(1, department);
			statement.setDouble(2, increaseAmmount); 
			
			CallableStatement statement2 = myConn.prepareCall("{call greet_the_department(?)}");
			statement2.registerOutParameter(1, Types.VARCHAR);
			statement2.setString(1, department);
			statement2.execute();
			
			/*
			 * String theResult = statement.getString(1); System.out.println("the result = "
			 * + theResult);
			 */
			  
			statement2 = myConn.prepareCall("{call get_employees_for_department(?)}");
			statement2.setString(1, department);
			statement2.execute();
			
			ResultSet res = statement2.getResultSet();
			
			while (res.next()) {
				String empId = res.getString("email");
				System.out.println(empId);
			}
			 
			
			statement2 = myConn.prepareCall("{call get_count_for_department(?, ?)}");
			statement2.setString(1, department);
			statement2.registerOutParameter(2, Types.INTEGER);
			statement2.execute();
			
			int result = statement2.getInt(2);
			System.out.println("the result = " + result);
			
			System.out.println("calling the stored process");
			statement.execute();
			
			System.out.println("Showing the updated salaries");
			showSalaries(myConn, department);
			
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
	
	private static void showSalaries(Connection myConn, String theDepartment) throws SQLException {
		PreparedStatement myStmt = null;
		ResultSet myRs = null;

		try {
			// Prepare statement
			myStmt = myConn
					.prepareStatement("select * from employees where department=?");

			myStmt.setString(1, theDepartment);
			
			// Execute SQL query
			myRs = myStmt.executeQuery();

			// Process result set
			while (myRs.next()) {
				String lastName = myRs.getString("last_name");
				String firstName = myRs.getString("first_name");
				double salary = myRs.getDouble("salary");
				String department = myRs.getString("department");
				
				System.out.printf("%s, %s, %s, %.2f\n", lastName, firstName, department, salary);
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			close(myStmt, myRs);
		}

	}
	
	private static void close(Connection myConn, Statement myStmt,
			ResultSet myRs) throws SQLException {
		if (myRs != null) {
			myRs.close();
		}

		if (myStmt != null) {
			myStmt.close();
		}

		if (myConn != null) {
			myConn.close();
		}
	}

	private static void close(Statement myStmt, ResultSet myRs)
			throws SQLException {

		close(null, myStmt, myRs);
	}

}
