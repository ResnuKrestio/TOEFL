package config;

import java.util.List;

public interface DAO<T> {
	public List<T> retrieve();
	public T get(int id);
	public void insert(T model);
}
