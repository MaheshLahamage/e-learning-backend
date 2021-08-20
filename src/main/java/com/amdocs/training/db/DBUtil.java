package com.amdocs.training.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
	static String dbUrl = "jdbc:mysql://localhost:3306/batch_2b";
	static String username = "root";
	static String password = "root";
	private static Connection conn = null;
	private DBUtil() {}
	public static Connection getConnection() throws SQLException {
		if(conn == null) {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl,
			username, password);
			return conn;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
