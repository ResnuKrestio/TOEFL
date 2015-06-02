package toefl.main.exercise.model;

public class Answer {

	int id;
	int exerciseId;
	int questionId;
	String answerA;
	String answerB;
	String answerC;
	String answerD;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExercise_id() {
		return exerciseId;
	}
	public void setExercise_id(int exercise_id) {
		this.exerciseId = exercise_id;
	}
	public int getQuestion_id() {
		return questionId;
	}
	public void setQuestion_id(int question_id) {
		this.questionId = question_id;
	}
	public String getAnswer_a() {
		return answerA;
	}
	public void setAnswer_a(String answer_a) {
		this.answerA = answer_a;
	}
	public String getAnswer_b() {
		return answerB;
	}
	public void setAnswer_b(String answer_b) {
		this.answerB = answer_b;
	}
	public String getAnswer_c() {
		return answerC;
	}
	public void setAnswer_c(String answer_c) {
		this.answerC = answer_c;
	}
	public String getAnswer_d() {
		return answerD;
	}
	public void setAnswer_d(String answer_d) {
		this.answerD = answer_d;
	}
	
	
}
