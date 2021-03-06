package config;

import java.util.ArrayList;
import java.util.List;

import toefl.main.exercise.dao.AnswerDAO;
import toefl.main.exercise.dao.AnswerInfoDAO;
import toefl.main.exercise.dao.ExerciseDAO;
import toefl.main.exercise.dao.MyProgressDAO;
import toefl.main.exercise.dao.PackageDAO;
import toefl.main.exercise.dao.QuestionDAO;
import toefl.main.exercise.dao.ScoreDAO;
import toefl.main.exercise.model.Answer;
import toefl.main.exercise.model.AnswerInfo;
import toefl.main.exercise.model.Exercise;
import toefl.main.exercise.model.MyProgress;
import toefl.main.exercise.model.Package;
import toefl.main.exercise.model.Question;
import toefl.main.exercise.model.Score;

public class Datapool {

	static List<Package> packages = new ArrayList<>();
	static List<Exercise> exercises = new ArrayList<>();
	static List<Question> questions = new ArrayList<>();
	static List<Answer> answers = new ArrayList<>();
	static List<AnswerInfo> answerInfos = new ArrayList<>();
	static List<Score> scores = new ArrayList<Score>();
	static List<MyProgress> myProgresses = new ArrayList<MyProgress>();

	static PackageDAO packageDAO = new PackageDAO();
	static ExerciseDAO exerciseDAO = new ExerciseDAO();
	static QuestionDAO questionDAO = new QuestionDAO();
	static AnswerDAO answerDAO = new AnswerDAO();
	static AnswerInfoDAO answerInfoDAO = new AnswerInfoDAO();
	static ScoreDAO scoreDAO = new ScoreDAO();
	static MyProgressDAO progressDAO = new MyProgressDAO();

	public static void init(){
		packages = packageDAO.retrieve();
		exercises = exerciseDAO.retrieve();
		questions = questionDAO.retrieve();
		answers = answerDAO.retrieve();
		answerInfos = answerInfoDAO.retrieve();
		scores = scoreDAO.retrieve();
		myProgresses = progressDAO.retrieve();
	}

	public static List<Package> getListPackages(){
		List<Package> listPackages = new ArrayList<>(); 
		for (Package package1 : packages) {
			for (Exercise exercise : exercises) {
				if(package1.getId()==exercise.getPackageId()){
					package1.getExercises().add(exercise);
				}
			}
			listPackages.add(package1);
		}
		return listPackages;
	}

	public static List<Exercise> getListExercises(){
		List<Exercise> listExercises = new ArrayList<>();
		for (Exercise exercise : exercises) {
			for (Question question : questions) {
				if (question.getExerciseId()==exercise.getId()){
					exercise.getQuestions().add(question);
				}
			}
			for (Answer answer : answers) {
				if (answer.getExerciseId()==exercise.getId()){
					exercise.getAnswers().add(answer);
				}
			}
			for (AnswerInfo answerInfo : answerInfos) {
				if(answerInfo.getExerciseId()==exercise.getId()){
					exercise.getAnswerInfos().add(answerInfo);
				}
			}
			listExercises.add(exercise);
		}
		return listExercises;
	}
	
	public static Exercise getExercise(int id){
		for (Exercise exercise : exercises) {
			if (exercise.getId()==id){
				for (Question question : questions) {
					if (question.getExerciseId()==exercise.getId()){
						exercise.getQuestions().add(question);
					}
				}
				for (Answer answer : answers) {
					if (answer.getExerciseId()==exercise.getId()){
						exercise.getAnswers().add(answer);
					}
				}
				for (AnswerInfo answerInfo : answerInfos) {
					if(answerInfo.getExerciseId()==exercise.getId()){
						exercise.getAnswerInfos().add(answerInfo);
					}
				}
				return exercise;
			}
			return null;
		}
		return null;
	}

	public static List<Answer> getListAnswerWithAnswerInfo(){
		for (Answer answer : answers) {
			for (AnswerInfo answerInfo : answerInfos) {
				if(answer.getId()==answerInfo.getAnswerId()) answer.setAnswerInfo(answerInfo);
			}
		}
		return answers;
	}

	public static List<AnswerInfo> getLisAnswerInfos(){
		return answerInfos;
	}

	public static AnswerInfo getAnswerInfo(Answer answer){
		for (AnswerInfo answerInfo : getLisAnswerInfos()) {
			if (answer.getId()==answerInfo.getAnswerId()) return answerInfo;
		}
		return null;
	}

	public static List<Score> getScore() {
		return scores;
	}

	public static List<MyProgress> getMyProgress() {
		return myProgresses;
	}
	
	public static void main(String[] args) {
		init();
	}
}
