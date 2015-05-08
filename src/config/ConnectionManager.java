package config;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.hsqldb.jdbcDriver;

public class ConnectionManager {

	static Properties properties;
	private static Connection con;
	private static Statement stmt;
	private static jdbcDriver driver;
	private static DriverManager driverManager;
	
	public ConnectionManager() {
		
	}
	
	public static void init() throws IOException{
		properties = new Properties();
		driver = new org.hsqldb.jdbcDriver();
		properties.load(ConnectionManager.class.getClassLoader().getResourceAsStream("connection.properties"));
		try {
			driverManager.registerDriver(driver);
			con = driverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
			
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
