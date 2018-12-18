package dao;

import java.util.List;

import model.acyivity.Activity;

public interface ActivityDao {
	List<Activity> getAllActivity();
	List<Activity> PageActivity(int page,int size);
}
