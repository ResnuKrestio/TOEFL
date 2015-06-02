package toefl.main.exercise.model;

public class AnswerInfo {

	int id;
	int answerId;
	char rightAnswer;
	String keyword;
	String gramaticalDisc;
	String explanation;
	String pdf;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public char getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(char rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getGramaticalDisc() {
		return gramaticalDisc;
	}
	public void setGramaticalDisc(String gramaticalDisc) {
		this.gramaticalDisc = gramaticalDisc;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getPdf() {
		return pdf;
	}
	public void setPdf(String pdf) {
		this.pdf = pdf;
	}
	
	
}
