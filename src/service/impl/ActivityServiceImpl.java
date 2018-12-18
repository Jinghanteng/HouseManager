package service.impl;

import dao.ActivityDao;
import dao.impl.ActivityDaoImpl;
import model.acyivity.Activity;
import model.acyivity.PageActivity;
import service.ActivityService;

public class ActivityServiceImpl implements ActivityService {
	ActivityDao activityDao=new ActivityDaoImpl();
	@Override
	public PageActivity<Activity> pageActivity(int page,int size) {
		// TODO Auto-generated method stub
		PageActivity<Activity> pageActivity=new PageActivity<>();
		pageActivity.setAll(activityDao.getAllActivity().size());
		pageActivity.setList(activityDao.PageActivity(page, size));
		pageActivity.setPage(page);
		pageActivity.setSize(size);
		return pageActivity;
	}

}
