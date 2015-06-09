package config;

import toefl.main.exercise.dao.PackageDAO;
import toefl.main.exercise.model.Package;

public class Driver {

	public static void main(String[] args) {
		Datapool.init();
		for (Package package1 : Datapool.getListPackages()) {
			System.out.println(package1.getId());
			System.out.println(package1.getName());
			System.out.println(package1.getDuration());
		}
		System.out.println(Datapool.getListPackages().size());
	}

}
