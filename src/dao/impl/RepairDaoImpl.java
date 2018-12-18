package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import dao.RepairDao;
import dbUilt.DBUilt;
import model.repair.Repair;

public class RepairDaoImpl implements RepairDao {

	@Override
	public List<Repair> getAllrepair() {
		// TODO Auto-generated method stub
		List<Repair> list=new ArrayList<>();
		Connection connection=DBUilt.getConnection();
		String sql="select * from repair";
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while (resultSet.next()) {
				Repair repair=new Repair();
				repair.setHousing(resultSet.getString("housing"));
				repair.setId(resultSet.getInt("id"));
				repair.setInstructions(resultSet.getString("instructions"));
				repair.setOther(resultSet.getString("other"));
				repair.setPrincipal(resultSet.getString("principal"));
				repair.setResult(resultSet.getString("result"));
				repair.setTime(resultSet.getDate("time"));
				list.add(repair);
			}
			DBUilt.close(connection, statement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	@Override
	public List<Repair> PageRepair(int page, int size) {
		// TODO Auto-generated method stub
		List<Repair> list=new ArrayList<>();
		Connection connection=DBUilt.getConnection();
		String sql="select * from repair limit ?,?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, (page-1)*size);
			preparedStatement.setInt(2, size);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				Repair repair=new Repair();
				repair.setHousing(resultSet.getString("housing"));
				repair.setId(resultSet.getInt("id"));
				repair.setInstructions(resultSet.getString("instructions"));
				repair.setOther(resultSet.getString("other"));
				repair.setPrincipal(resultSet.getString("principal"));
				repair.setResult(resultSet.getString("result"));
				repair.setTime(resultSet.getDate("time"));
				list.add(repair);
			}
			DBUilt.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
