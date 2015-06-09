package toefl.main.exercise.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import toefl.main.exercise.model.Answer;
import toefl.main.exercise.model.Exercise;
import toefl.main.exercise.model.Question;
import config.ConnectionManager;
import config.DAO;

public class AnswerDAO implements DAO<Answer>{

	private static String INSERT = "";
	private static String UPDATE = "";
	private static String DELETE = "";
	private static String SQL = "SELECT * FROM ANSWER";
	Answer answer;
	List<Answer> answers;
	Statement stmt;
	ResultSet rs;
	
	@Override
	public List<Answer> retrieve() {
		answers = new ArrayList<>();
		try {
			stmt = ConnectionManager.init();
			rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				answer = new Answer();
				answer.setId(rs.getInt("ID"));
				answer.setQuestionId(rs.getInt("QUESTION_ID"));
				answer.setExerciseId(rs.getInt("EXERCISE_ID"));
				answer.setAnswerA(rs.getString("ANSWER_A"));
				answer.setAnswerB(rs.getString("ANSWER_B"));
				answer.setAnswerC(rs.getString("ANSWER_C"));
				answer.setAnswerD(rs.getString("ANSWER_D"));
				answers.add(answer);
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
		return answers;
	}

	@Override
	public Answer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
