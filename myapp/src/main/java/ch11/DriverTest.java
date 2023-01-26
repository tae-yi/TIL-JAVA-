package ch11;

import java.sql.*;

public class DriverTest {
	public static void main(String[] args) {
		Connection con;
		System.out.println("JDBC 연동 시작!!!");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("JDBC 접속!!!");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "2802");
			System.out.println("Success");
		}
		catch(SQLException ex) {System.out.println("SQLException" + ex);}
		catch(Exception ex) {System.out.println("Exception" + ex);}


	}

}
