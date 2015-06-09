package toefl.main.exercise.model;

import java.util.ArrayList;
import java.util.Collection;

public class Exercise {

	int id;
	String name;
	int packageId;
	Collection<Question> questions = new ArrayList<>();
	Collection<Answer> answers = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public Collection<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Collection<Question> questions) {
		this.questions = questions;
	}
	public Collection<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Collection<Answer> answers) {
		this.answers = answers;
	}
}
