package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Firstjdbc {
	public static void main(String[] args) throws SQLException {
		// 1. establish connection = 3 (url,username,pwd or database)
		// url = "jdbc:mysql://localhost:3306:schemaname/dbname
		// 2. Obtain statement reference
		// 3. Prepare SQL statement as string 
		// 4. execute statement
		// 5. Fetch results
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?","root","Root123$");
		System.out.println("connected...");
		Statement st = con.createStatement();
		String sql = "select * from EMP";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
		}
	}
}
