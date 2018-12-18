package service;

import model.acyivity.Activity;
import model.acyivity.PageActivity;

public interface ActivityService {
	PageActivity<Activity> pageActivity(int page,int size);
}
