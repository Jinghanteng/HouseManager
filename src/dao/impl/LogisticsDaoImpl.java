package dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.LogisticsDao;
import dbUilt.DBUilt;
import model.logistics.Logistics;

public class LogisticsDaoImpl implements LogisticsDao {

	@Override
	public List<Logistics> getAll() {
		// TODO Auto-generated method stub
		List<Logistics> list = new ArrayList<>();
		Connection connection = DBUilt.getConnection();
		String sql = "select * from logistics";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Logistics logistics = new Logistics();
				logistics.setId(resultSet.getInt("id"));
				logistics.setIdCard(resultSet.getString("idCard"));
				logistics.setName(resultSet.getString("name"));
				logistics.setPlace(resultSet.getString("place"));
				logistics.setRole_id(resultSet.getInt("role_id"));
				logistics.setSalary(resultSet.getDouble("salary"));
				logistics.setSex(resultSet.getString("sex"));
				logistics.setTel(resultSet.getInt("tel"));
				logistics.setTime(resultSet.getDate("time"));
				list.add(logistics);
			}
			DBUilt.close(connection, statement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Logistics> pageLogistics(int page, int size) {
		// TODO Auto-generated method stub
		List<Logistics> list = new ArrayList<>();
		Connection connection = DBUilt.getConnection();
		String sql = "select * from logistics limit ?,?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (page - 1) * size);
			preparedStatement.setInt(2, size);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Logistics logistics = new Logistics();
				logistics.setId(resultSet.getInt("id"));
				logistics.setIdCard(resultSet.getString("idCard"));
				logistics.setName(resultSet.getString("name"));
				logistics.setPlace(resultSet.getString("place"));
				logistics.setRole_id(resultSet.getInt("role_id"));
				logistics.setSalary(resultSet.getDouble("salary"));
				logistics.setSex(resultSet.getString("sex"));
				logistics.setTel(resultSet.getInt("tel"));
				logistics.setTime(resultSet.getDate("time"));
				list.add(logistics);
			}
			DBUilt.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void addlogistics(Logistics logistics) {
		// TODO Auto-generated method stub
		Connection connection = DBUilt.getConnection();
		String sql = "insert into logistics(name,idcard,tel,sex,role_id,time,salary,place) values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,logistics.getName() );
			preparedStatement.setString(2, logistics.getIdCard());
			preparedStatement.setInt(3, logistics.getTel());
			preparedStatement.setString(4, logistics.getSex());
			preparedStatement.setInt(5, logistics.getRole_id());
			preparedStatement.setDate(6, new Date(logistics.getTime().getTime()));
			preparedStatement.setDouble(7, logistics.getSalary());
			preparedStatement.setString(8, logistics.getPlace());
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
