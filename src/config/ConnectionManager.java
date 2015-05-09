package config;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.text.StyleContext.SmallAttributeSet;

import org.hsqldb.jdbcDriver;

public class ConnectionManager {

	static Properties properties;
	private static Connection con;
	private static Statement stmt;
	private static jdbcDriver driver;
	private static DriverManager driverManager;
	private static ResultSet rs;
	
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
			String sql = "SELECT * FROM EXERCISE;";
			rs =  stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println("MASUK KE SINI NGGA?");
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				System.out.println("ID="+id+" NAME="+name);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
