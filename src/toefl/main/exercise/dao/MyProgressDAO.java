package toefl.main.exercise.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import toefl.main.exercise.model.MyProgress;
import config.ConnectionManager;
import config.DAO;

public class MyProgressDAO implements DAO<MyProgress>{

	String insert = "INSERT INTO MY_PROGRESS (DATE,SCORE,TIME,PACKAGE)VALUES(?,?,?,?)";
	PreparedStatement psmt;
	
	@Override
	public List<MyProgress> retrieve() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyProgress get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(MyProgress model) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			psmt = ConnectionManager.initPreparedStatement(insert);
			psmt.setString(1, sdf.format(model.getDate()));
			psmt.setInt(2, model.getScore());
			psmt.setString(3, model.getTime());
			psmt.setInt(4, model.getPackage1());
			psmt.executeQuery();
			ConnectionManager.close();
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
