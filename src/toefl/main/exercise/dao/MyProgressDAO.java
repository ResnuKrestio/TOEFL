package toefl.main.exercise.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
