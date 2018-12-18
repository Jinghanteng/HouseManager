package dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.CompactDao;
import dbUilt.DBUilt;
import model.compact.Compact;

public class CompactDaoImpl implements CompactDao {

	@Override
	public List<Compact> getAllCompact() {
		// TODO Auto-generated method stub
		List<Compact> list=new ArrayList<>();
		Connection connection=DBUilt.getConnection();
		String sql="select * from compact";
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while (resultSet.next()) {
				Compact compact=new Compact();
				compact.setBegintime(resultSet.getTimestamp("begintime"));
				compact.setEndtime(resultSet.getTimestamp("endtime"));
				compact.setHouse_id(resultSet.getInt("house_id"));
				compact.setId(resultSet.getInt("id"));
				compact.setPayment(resultSet.getString("payment"));
				compact.setPeriods(resultSet.getString("periods"));
				compact.setPledge(resultSet.getString("pledge"));
				compact.setRental(resultSet.getDouble("rental"));
				compact.setTime(resultSet.getTimestamp("time"));
				compact.setUser_id(resultSet.getInt("user_id"));
				list.add(compact);
			}
			DBUilt.close(connection, statement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Compact> pageCompact(int page, int size) {
		// TODO Auto-generated method stub
		List<Compact> list=new ArrayList<>();
		Connection connection=DBUilt.getConnection();
		String sql="select * from compact limit ?,?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, (page-1)*size);
			preparedStatement.setInt(2, size);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				Compact compact=new Compact();
				compact.setBegintime(resultSet.getTimestamp("begintime"));
				compact.setEndtime(resultSet.getTimestamp("endtime"));
				compact.setHouse_id(resultSet.getInt("house_id"));
				compact.setId(resultSet.getInt("id"));
				compact.setPayment(resultSet.getString("payment"));
				compact.setPeriods(resultSet.getString("periods"));
				compact.setPledge(resultSet.getString("pledge"));
				compact.setRental(resultSet.getDouble("rental"));
				compact.setTime(resultSet.getTimestamp("time"));
				compact.setUser_id(resultSet.getInt("user_id"));
				list.add(compact);
			}
			DBUilt.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void addCompact(Compact compact) {
		// TODO Auto-generated method stub
		Connection connection=DBUilt.getConnection();
		String sql="insert into compact(house_id,user_id,time,begintime,endtime,rental,payment,pledge,periods) values(?,?,now(),?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, compact.getHouse_id());
			preparedStatement.setInt(2, compact.getUser_id());
			Date begintime=new Date(compact.getBegintime().getTime());
			Date endtime=new Date(compact.getEndtime().getTime());
			preparedStatement.setDate(3, begintime);
			preparedStatement.setDate(4, endtime);
			preparedStatement.setDouble(5, compact.getRental());
			preparedStatement.setString(6, compact.getPayment());
			preparedStatement.setString(7, compact.getPledge());
			preparedStatement.setString(8, compact.getPeriods());
			preparedStatement.execute();
			DBUilt.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
