package toefl.main.exercise.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import toefl.main.exercise.model.MyProgress;
import config.ConnectionManager;
import config.DAO;

public class MyProgressDAO implements DAO<MyProgress>{

	String insert = "INSERT INTO MY_PROGRESS (DATE,SCORE,TIME,PACKAGE)VALUES(?,?,?,?)";
	String select = "SELECT * FROM MY_PROGRESS";
	PreparedStatement psmt;
	Statement statement;
	List<MyProgress> myProgress;
	ResultSet rs;
	
	@Override
	public List<MyProgress> retrieve() {
		myProgress = new ArrayList<MyProgress>();
		try {
			statement = ConnectionManager.init();
			rs = statement.executeQuery(select);
			while (rs.next()) {
				MyProgress progress = new MyProgress();
				progress.setDate(rs.getString("DATE"));
				progress.setPackage1(rs.getString("PACKAGE"));
				progress.setScore(rs.getInt("SCORE"));
				progress.setTime(rs.getString("TIME"));
				myProgress.add(progress);
			}
		}  catch (IOException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return myProgress;
	}

	@Override
	public MyProgress get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(MyProgress model) {
		try {
			psmt = ConnectionManager.initPreparedStatement(insert);
			psmt.setString(1, model.getDate());
			psmt.setInt(2, model.getScore());
			psmt.setString(3, model.getTime());
			psmt.setString(4, model.getPackage1());
			System.out.println("Insert Succes");
			psmt.execute();
			ConnectionManager.close();
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
