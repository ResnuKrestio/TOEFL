package toefl.main.exercise.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import toefl.main.exercise.model.Question;
import toefl.main.exercise.model.Score;
import config.ConnectionManager;
import config.DAO;

public class ScoreDAO implements DAO<Score>{

	private static String INSERT = "INSERT INTO SCORE (TOTAL_RIGHT_ANSWER,SCORE) WHERE (?,?)";
	private static String UPDATE = "";
	private static String DELETE = "";
	private static String SQL = "SELECT * FROM SCORE";
	Score score;
	List<Score> scores;
	Statement stmt;
	ResultSet rs;
	
	@Override
	public List<Score> retrieve() {
		scores = new ArrayList<>();
		try {
			stmt = ConnectionManager.init();
			rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				score = new Score();
				score.setId(rs.getInt("ID"));
				score.setTotalRightAnswer(rs.getInt("TOTAL_RIGHT_ANSWER"));
				score.setScore(rs.getInt("SCORE"));
				scores.add(score);
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
		return scores;
	}

	@Override
	public Score get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
