package toefl.main.exercise.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import toefl.main.exercise.model.Package;
import config.ConnectionManager;
import config.DAO;

public class PackageDAO implements DAO<Package>{

	private static String INSERT = "";
	private static String UPDATE = "";
	private static String DELETE = "";
	private static String SQL = "SELECT * FROM PACKAGE";
	Package pack;
	List<Package> packages;
	Statement stmt;
	ResultSet rs;
	
	@Override
	public Package get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Package> retrieve() {
		
		packages = new ArrayList<>();
		try {
			stmt = ConnectionManager.init();
			rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				pack = new Package();
				pack.setId(rs.getInt("ID"));
				pack.setName(rs.getString("NAME"));
				pack.setDuration(rs.getInt("DURATION"));
				packages.add(pack);
			}
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return packages;
	}
	
}
