//package jdbc_test;

import java.io.*;
import java.sql.*;

public class jdbc_test {

    public static void main(String[] args) throws SQLException, IOException {

        Connection myConn = null;
        Statement mySmt = null;
        ResultSet myRes = null;

        String catalog = null;
        String schemaPattern = null;
        String tableNamePattern = null;
        String columnNamePattern = null;
        String[] types = null;

        try {
//			Class.forName("")
            myConn = DriverManager
                    .getConnection("jdbc:oracle:thin:@tcp://localhost:1521/xepdb1", "hr", "hr");

            System.out.println("Connection successful");

            mySmt = myConn.createStatement();
            PreparedStatement myPrepStatement = myConn.prepareStatement("" +
                    "delete from employees_duplicate " +
                    "where first_name=? and last_name=?");
            myPrepStatement.setString(1, "Eric");
            myPrepStatement.setString(2, "Wright");

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

//            int rowsAffectedByDelete = mySmt.executeUpdate("" +
//                    "delete from employees_duplicate " +
//                    "where first_name='Eric' and last_name='Wright'");
            int rowsAffectedByDelete = myPrepStatement.executeUpdate();

            if (rowsAffectedByInsert >= 1 && rowsAffectedByUpdate >= 1 && rowsAffectedByDelete >= 1) {
                System.out.println("Updation & deletion successful!");
            }

            myRes = mySmt.executeQuery("select * from employees_duplicate");

            ResultSetMetaData resultSetMetaData = myRes.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Column name: " + resultSetMetaData.getColumnName(i));
                System.out.println("Column type: " + resultSetMetaData.getColumnTypeName(i));
                System.out.println("is Nullable: " + resultSetMetaData.isNullable(i));
                System.out.println("is AutoIncrement: " + resultSetMetaData.isAutoIncrement(i));
                System.out.println();
            }

            while (myRes.next()) {
                System.out.println("Query result...");
                System.out.println(myRes.getString("employee_id") + ", "
                        + myRes.getString("last_name") + ", "
                        + myRes.getString("first_name"));
            }
            DatabaseMetaData metaData = myConn.getMetaData();
            System.out.println("Database meta data:");
            System.out.println(metaData.getDatabaseProductName());
            System.out.println(metaData.getDatabaseProductVersion());
            System.out.println(metaData.getDriverName() + " " + metaData.getDriverVersion());

            ResultSet resultSet = metaData.getTables(catalog,
                                                    schemaPattern, tableNamePattern, types);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("TABLE_NAME"));
                //   code not working as expected with oracle db
            }
            String updateResumeQuery = "Update employees_duplicate " +
                                        "Set Resume = ? " +
                                        "Where first_name = 'William' and last_name = 'Gietz'";
            PreparedStatement preparedStatementToUpdateResume = myConn.prepareStatement(updateResumeQuery);
            File resumeFile = new File("./GEMS_Learner_SOP.pdf");
            FileInputStream input = new FileInputStream(resumeFile);

            preparedStatementToUpdateResume.setBinaryStream(1, input);
            int rowsAffectedByResumeInsert = preparedStatementToUpdateResume.executeUpdate();
            if (rowsAffectedByResumeInsert >= 1) {
                System.out.println("Resume Inserted");
            }
            // Reading BLOB:
            Statement statementToReadResumeFromDB = myConn.createStatement();
            String sqlToReadResume = "select resume from employees_duplicate\n" +
                    "where first_name='William' and last_name='Gietz'";
            ResultSet res = statementToReadResumeFromDB.executeQuery(sqlToReadResume);

            OutputStream outputStream = new FileOutputStream(new File("./resume_read.pdf"));

            while (res.next()) {
                InputStream inputStream = res.getBinaryStream("resume");
                byte[] buffer = new byte[150];
                while (inputStream.read(buffer) > 0) {
                    outputStream.write(buffer);
                }
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
