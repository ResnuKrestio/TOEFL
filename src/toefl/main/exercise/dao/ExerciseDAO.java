package toefl.main.exercise.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import toefl.main.exercise.model.Exercise;
import config.ConnectionManager;
import config.DAO;

public class ExerciseDAO implements DAO<Exercise>{

	private static String INSERT = "";
	private static String UPDATE = "";
	private static String DELETE = "";
	private static String SQL = "SELECT * FROM EXERCISE";
	Exercise exercise;
	List<Exercise> exercises;
	Statement stmt;
	ResultSet rs;
	
	@Override
	public List<Exercise> retrieve() {
		exercises = new ArrayList<>();
		try {
			stmt = ConnectionManager.init();
			rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				exercise = new Exercise();
				exercise.setId(rs.getInt("ID"));
				exercise.setName(rs.getString("NAME"));
				exercise.setPackageId(rs.getInt("PACKAGE_ID"));
				exercises.add(exercise);
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
		return exercises;
	}

	@Override
	public Exercise get(int id) {
		return exercise;
	}

}
