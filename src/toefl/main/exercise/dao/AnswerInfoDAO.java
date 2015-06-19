package toefl.main.exercise.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import toefl.main.exercise.model.AnswerInfo;
import config.ConnectionManager;
import config.DAO;

public class AnswerInfoDAO implements DAO<AnswerInfo>{

	private static String INSERT = "";
	private static String UPDATE = "";
	private static String DELETE = "";
	private static String SQL = "SELECT * FROM ANSWER_INFO";
	AnswerInfo answerInfo;
	List<AnswerInfo> answerInfos;
	Statement stmt;
	ResultSet rs;
	
	@Override
	public List<AnswerInfo> retrieve() {
		answerInfos = new ArrayList<>();
		try {
			stmt = ConnectionManager.init();
			rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				answerInfo = new AnswerInfo();
				answerInfo.setId(rs.getInt("ID"));
				answerInfo.setAnswerId(rs.getInt("ANSWER_ID"));
				answerInfo.setRightAnswer(rs.getString("RIGHT_ANSWER"));
				answerInfo.setExplanation(rs.getString("EXPLANATION"));
				answerInfo.setGramaticalDisc(rs.getString("GRAMATICAL_DISC"));
				answerInfo.setKeyword(rs.getString("KEYWORD"));
				answerInfo.setPdf(rs.getString("PDF"));
				answerInfo.setExerciseId(rs.getInt("EXERCISE_ID"));
				answerInfos.add(answerInfo);
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
		return answerInfos;
	}

	@Override
	public AnswerInfo get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
