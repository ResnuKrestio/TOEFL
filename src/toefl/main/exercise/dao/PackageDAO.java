package toefl.main.exercise.dao;

import java.util.List;

import toefl.main.exercise.model.Package;
import config.DAO;

public class PackageDAO implements DAO<Package>{

	private static String INSERT = "";
	private static String UPDATE = "";
	private static String DELETE = "";
	private static String SQL = "";
	Package package1 = new Package();
	
	@Override
	public Package get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Package> retrieve() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
