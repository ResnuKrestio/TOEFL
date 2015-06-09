package toefl.main.exercise.model;

import java.util.ArrayList;
import java.util.Collection;

public class Package{

	int id;
	String name;
	int duration;
	Collection<Exercise> exercises = new ArrayList<>();
	
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Collection<Exercise> getExercises() {
		return exercises;
	}
	public void setExercises(Collection<Exercise> exercises) {
		this.exercises = exercises;
	}
}
