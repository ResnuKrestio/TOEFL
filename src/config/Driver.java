package config;

import javax.xml.crypto.Data;

import toefl.main.exercise.dao.PackageDAO;
import toefl.main.exercise.model.Exercise;
import toefl.main.exercise.model.Package;
import toefl.main.exercise.model.Question;

public class Driver {

	public static void main(String[] args) {
		Datapool.init();
		for (Package package1 : Datapool.getListPackages()) {
			System.out.println(package1.getId());
			System.out.println(package1.getName());
			System.out.println(package1.getDuration());
		}
		System.out.println(Datapool.getListPackages().size());
		
		for (Exercise exercise : Datapool.getListExercises()) {
			System.out.println(exercise.getId());
			System.out.println(exercise.getName());
			System.out.println(exercise.getPackageId());
			for (Question question : exercise.getQuestions()) {
				System.out.println("Ini question "+question.getQuestion());
				
			}
		}
		System.out.println(Datapool.getListExercises().size());
		
	}

}
