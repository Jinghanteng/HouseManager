package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import dao.ActivityDao;
import dbUilt.DBUilt;
import model.acyivity.Activity;

public class ActivityDaoImpl implements ActivityDao {

	@Override
	public List<Activity> getAllActivity() {
		// TODO Auto-generated method stub
		List<Activity> list=new ArrayList<>();
		Connection connection=DBUilt.getConnection();
		String sql="select * from activity";
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while (resultSet.next()) {
				Activity activity=new Activity();
				activity.setContent(resultSet.getString("content"));
				activity.setCost(resultSet.getDouble("cost"));
				activity.setId(resultSet.getInt("id"));
				activity.setLocation(resultSet.getString("location"));
				activity.setOrganizer(resultSet.getString("organizer"));
				activity.setTheme(resultSet.getString("theme"));
				activity.setTime(resultSet.getTimestamp("time"));
				list.add(activity);
			}
			DBUilt.close(connection, statement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Activity> PageActivity(int page, int size) {
		// TODO Auto-generated method stub
		List<Activity> list=new ArrayList<>();
		Connection connection=DBUilt.getConnection();
		String sql="select * from activity limit ?,?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, (page-1)*size);
			preparedStatement.setInt(2, size);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				Activity activity=new Activity();
				activity.setContent(resultSet.getString("content"));
				activity.setCost(resultSet.getDouble("cost"));
				activity.setId(resultSet.getInt("id"));
				activity.setLocation(resultSet.getString("location"));
				activity.setOrganizer(resultSet.getString("organizer"));
				activity.setTheme(resultSet.getString("theme"));
				activity.setTime(resultSet.getTimestamp("time"));
				list.add(activity);
			}
			DBUilt.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
