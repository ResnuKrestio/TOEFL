package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectToDB {

	static Properties properties;
	
	private ConnectToDB() {
		
	}
	
	public static Connection getConnectionToDB(){
		Connection con = null;
		try {
			con = DriverManager.getConnection(properties.getProperty("url"),properties);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	private static final ConnectToDB instance = new ConnectToDB();
	
	public static ConnectToDB getInstance(){
		return ConnectToDB.instance;
	}
}
