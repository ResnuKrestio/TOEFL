package toefl.main.exercise.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import toefl.main.exercise.model.Question;
import config.ConnectionManager;
import config.DAO;

public class QuestionDAO implements DAO<Question>{

	private static String INSERT = "";
	private static String UPDATE = "";
	private static String DELETE = "";
	private static String SQL = "SELECT * FROM QUESTION";
	Question question;
	List<Question> questions;
	Statement stmt;
	ResultSet rs;
	
	@Override
	public List<Question> retrieve() {
		questions = new ArrayList<>();
		try {
			stmt = ConnectionManager.init();
			rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				question = new Question();
				question.setId(rs.getInt("ID"));
				question.setExerciseId(rs.getInt("EXERCISE_ID"));
				question.setQuestion(rs.getString("QUESTION"));
				questions.add(question);
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
		return questions;
	}

	@Override
	public Question get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Question model) {
		// TODO Auto-generated method stub
		
	}



}
