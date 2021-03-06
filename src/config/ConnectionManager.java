package config;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.hsqldb.jdbcDriver;

public class ConnectionManager{

	static Properties properties;
	private static Connection con;
	private static Statement stmt;
	private static PreparedStatement psmt;
	private static jdbcDriver driver;

	public ConnectionManager() {

	}

	public static Statement init() throws IOException{
		properties = new Properties();
		driver = new org.hsqldb.jdbcDriver();
		properties.load(ConnectionManager.class.getClassLoader().getResourceAsStream("connection.properties"));
		try {
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	public static PreparedStatement initPreparedStatement(String sql) throws IOException{
		properties = new Properties();
		driver = new org.hsqldb.jdbcDriver();
		properties.load(ConnectionManager.class.getClassLoader().getResourceAsStream("connection.properties"));
		try {
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
			psmt = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return psmt;
	}
	

	public static void close() throws SQLException {
		if (psmt!=null) psmt.close();
		if (stmt!=null) stmt.close();
		con.commit();
		con.close();
	}
}
