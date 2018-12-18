package dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.PaymentinformationDao;
import dbUilt.DBUilt;
import model.paymentinformation.Paymentinformation;

public class PaymentinformationDaoImpl implements PaymentinformationDao {

	@Override
	public List<Paymentinformation> gatAllPaymentinformation() {
		// TODO Auto-generated method stub
		List<Paymentinformation> list=new ArrayList<>();
		Connection connection=DBUilt.getConnection();
		String sql="select * from paymentinformation";
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while (resultSet.next()) {
				Paymentinformation paymentinformation=new Paymentinformation();
				paymentinformation.setId(resultSet.getInt("id"));
				paymentinformation.setHouse_id(resultSet.getInt("house_id"));
				paymentinformation.setOther(resultSet.getString("other"));
				paymentinformation.setPayment(resultSet.getInt("payment"));
				paymentinformation.setTime(resultSet.getTimestamp("time"));
				paymentinformation.setUser_id(resultSet.getInt("user_id"));
				list.add(paymentinformation);
			}
			DBUilt.close(connection, statement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Paymentinformation> PagePaymentinformation(int page, int size) {
		// TODO Auto-generated method stub
		List<Paymentinformation> list=new ArrayList<>();
		String sql="select * from paymentinformation limit ?,?";
		Connection connection=DBUilt.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, (page-1)*size);
			preparedStatement.setInt(2, size);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				Paymentinformation paymentinformation=new Paymentinformation();
				paymentinformation.setId(resultSet.getInt("id"));
				paymentinformation.setHouse_id(resultSet.getInt("house_id"));
				paymentinformation.setOther(resultSet.getString("other"));
				paymentinformation.setPayment(resultSet.getInt("payment"));
				paymentinformation.setTime(resultSet.getTimestamp("time"));
				paymentinformation.setUser_id(resultSet.getInt("user_id"));
				list.add(paymentinformation);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void add(Paymentinformation paymentinformation) {
		// TODO Auto-generated method stub
		Connection connection=DBUilt.getConnection();
		String sql="insert into paymentinformation(house_id,user_id,payment,time,other) values(?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, paymentinformation.getHouse_id());
			preparedStatement.setInt(2, paymentinformation.getUser_id());
			preparedStatement.setDouble(3, paymentinformation.getPayment());
			Date date=new Date(paymentinformation.getTime().getTime());
			preparedStatement.setDate(4, date);
			preparedStatement.setString(5, paymentinformation.getOther());
			preparedStatement.execute();
			DBUilt.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
