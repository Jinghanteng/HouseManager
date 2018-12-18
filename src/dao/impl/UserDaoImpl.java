package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import dao.UserDao;
import dbUilt.DBUilt;
import model.role.PageRole;
import model.role.Role;
import model.user.RootUser;
import model.user.User;

public class UserDaoImpl<E> implements UserDao {

	@Override
	public List<RootUser> findAllRootUser() {
		// TODO Auto-generated method stub
		List<RootUser> list = new ArrayList<>();
		Connection connection = DBUilt.getConnection();
		String sql = "select * from rootuser";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				RootUser rootUser = new RootUser();
				rootUser.setId(resultSet.getInt("id"));
				rootUser.setName(resultSet.getString("name"));
				rootUser.setPassname(resultSet.getString("passname"));
				rootUser.setPassword(resultSet.getString("password"));
				rootUser.setRole_id(resultSet.getInt("role_id"));
				rootUser.setSex(resultSet.getString("sex"));
				rootUser.setState(resultSet.getString("state"));
				rootUser.setTime(resultSet.getDate("time"));
				list.add(rootUser);
			}
			DBUilt.close(connection, statement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public RootUser getRootUserByName(String passname) {
		// TODO Auto-generated method stub
		RootUser rootUser = null;
		Connection connection = DBUilt.getConnection();
		String sql = "select * from rootuser where passname=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, passname);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				rootUser = new RootUser();
				rootUser.setId(resultSet.getInt("id"));
				rootUser.setName(resultSet.getString("name"));
				rootUser.setPassname(resultSet.getString("passname"));
				rootUser.setPassword(resultSet.getString("password"));
				rootUser.setRole_id(resultSet.getInt("role_id"));
				rootUser.setSex(resultSet.getString("sex"));
				rootUser.setState(resultSet.getString("state"));
				rootUser.setTime(resultSet.getDate("time"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rootUser;
	}

	@Override
	public List<RootUser> getUserByLimit(int page, int size) {
		// TODO Auto-generated method stub
		List<RootUser> list = new ArrayList<>();
		Connection connection = DBUilt.getConnection();
		String sql = "select * from rootuser limit ?,?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (page - 1) * size);
			preparedStatement.setInt(2, size);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				RootUser user = new RootUser(resultSet.getInt("id"), resultSet.getString("passname"),
						resultSet.getString("password"), resultSet.getString("name"), resultSet.getString("sex"),
						resultSet.getInt("role_id"), resultSet.getDate("time"), resultSet.getString("state"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		List<Role> list=new ArrayList<>();
		String sql="select * from role";
		Connection connection=DBUilt.getConnection();
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while (resultSet.next()) {
				Role role=new Role();
				role.setId(resultSet.getInt("id"));
				role.setName(resultSet.getString("name"));
				role.setTime(resultSet.getTimestamp("time"));
				list.add(role);
			}
			DBUilt.close(connection, statement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Role> getByLimit(int page,int size) {
		// TODO Auto-generated method stub
		List<Role> list=new ArrayList<>();
		String sql="select * from role limit ?,?";
		Connection connection=DBUilt.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, (page-1)*size);
			preparedStatement.setInt(2,size);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				Role role=new Role();
				role.setId(resultSet.getInt("id"));
				role.setName(resultSet.getString("name"));
				role.setTime(resultSet.getTimestamp("time"));
				list.add(role);
			}
			DBUilt.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> list=new ArrayList<>();
		Connection connection=DBUilt.getConnection();
		String sql="select * from user";
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while (resultSet.next()) {
				User user=new User();
				user.setId(resultSet.getInt("id"));
				user.setName(resultSet.getString("name"));
				user.setIdcard(resultSet.getString("idcard"));
				user.setPlace(resultSet.getString("place"));
				user.setSex(resultSet.getString("sex"));
				user.setTel(resultSet.getInt("tel"));
				user.setTime(resultSet.getTimestamp("time"));
				list.add(user);
			}
			DBUilt.close(connection, statement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public List<User> getLimit(int page, int size) {
		// TODO Auto-generated method stub
		List<User> list=new ArrayList<>();
		Connection connection=DBUilt.getConnection();
		String sql="select * from user limit ?,?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, (page-1)*size);
			preparedStatement.setInt(2, size);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				User user=new User();
				user.setId(resultSet.getInt("id"));
				user.setName(resultSet.getString("name"));
				user.setIdcard(resultSet.getString("idcard"));
				user.setPlace(resultSet.getString("place"));
				user.setSex(resultSet.getString("sex"));
				user.setTel(resultSet.getInt("tel"));
				user.setTime(resultSet.getTimestamp("time"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
