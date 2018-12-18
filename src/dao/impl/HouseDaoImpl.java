package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dao.HouseDao;
import dbUilt.DBUilt;
import model.house.House;

public class HouseDaoImpl implements HouseDao {

	@Override
	public List<House> getAllHouse() {
		// TODO Auto-generated method stub
		List<House> list = new ArrayList<>();
		Connection connection = DBUilt.getConnection();
		String sql = "select * from house";
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				House house = new House(resultSet.getInt("id"), resultSet.getString("location"),
						resultSet.getString("plot"), resultSet.getInt("unit"), resultSet.getInt("floor"),
						resultSet.getInt("room"), resultSet.getDouble("area"), resultSet.getString("orientation"),
						resultSet.getString("finish"), resultSet.getString("gas"), resultSet.getInt("people"));
				list.add(house);
			}
			DBUilt.close(connection, statement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<House> getLimit(int page, int size) {
		// TODO Auto-generated method stub
		List<House> list = new ArrayList<>();
		Connection connection = DBUilt.getConnection();
		String sql = "select * from house limit ?,?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, (page - 1) * size);
			preparedStatement.setInt(2, size);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				House house = new House(resultSet.getInt("id"), resultSet.getString("location"),
						resultSet.getString("plot"), resultSet.getInt("unit"), resultSet.getInt("floor"),
						resultSet.getInt("room"), resultSet.getDouble("area"), resultSet.getString("orientation"),
						resultSet.getString("finish"), resultSet.getString("gas"), resultSet.getInt("people"));
				;
				list.add(house);
			}
			DBUilt.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 添加房子信息
	 */
	@Override
	public void addHouse(House house) {
		// TODO Auto-generated method stub
		Connection connection = DBUilt.getConnection();
		// 所属地区location、所属小区plot、单元号unit、所属楼层floor、房间号room、面积area、
		// 朝向orientation、装修(精装、简装等)finish、是否双气gas、限住人数people、
		System.out.println(house.getLocation());
		String sql = "insert into house(location,plot,unit,floor,room,area,orientation,finish,gas,people) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, house.getLocation());
			preparedStatement.setString(2, house.getPlot());
			preparedStatement.setInt(3, house.getUnit());
			preparedStatement.setInt(4, house.getFloor());
			preparedStatement.setInt(5, house.getRoom());
			preparedStatement.setDouble(6, house.getArea());
			preparedStatement.setString(7, house.getOrientation());
			preparedStatement.setString(8, house.getFinish());
			preparedStatement.setString(9, house.getGas());
			preparedStatement.setInt(10, house.getPeople());
			preparedStatement.execute();
			DBUilt.close(connection, preparedStatement, null);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 所属地区location、所属小区plot、单元号unit、所属楼层floor、房间号room、面积area、
	// 朝向orientation、装修(精装、简装等)finish、是否双气gas、限住人数people、
	@Override
	public void updatehouse(House house) {
		Connection connection = DBUilt.getConnection();
		String sql = "update house set location=?,plot=?,unit=?,floor=?,room=?,area=?,orientation=?,finish=?,gas=?,people=? where id=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, house.getLocation());
			preparedStatement.setString(2, house.getPlot());
			preparedStatement.setInt(3, house.getUnit());
			preparedStatement.setInt(4, house.getFloor());
			preparedStatement.setInt(5, house.getRoom());
			preparedStatement.setDouble(6, house.getArea());
			preparedStatement.setString(7, house.getOrientation());
			preparedStatement.setString(8, house.getFinish());
			preparedStatement.setString(9, house.getGas());
			preparedStatement.setInt(10, house.getPeople());
			preparedStatement.setInt(11, house.getId());
			preparedStatement.execute();
			DBUilt.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public House getHouserByid(int id) {
		// TODO Auto-generated method stub
		House house = null;
		Connection connection = DBUilt.getConnection();
		String sql = "select * from house where id=? ";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				house = new House(resultSet.getInt("id"), resultSet.getString("location"), resultSet.getString("plot"),
						resultSet.getInt("unit"), resultSet.getInt("floor"), resultSet.getInt("room"),
						resultSet.getDouble("area"), resultSet.getString("orientation"), resultSet.getString("finish"),
						resultSet.getString("gas"), resultSet.getInt("people"));

			}
			DBUilt.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return house;

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Connection connection=DBUilt.getConnection();
		String sql="delete from house where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			DBUilt.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<House> getHouseByHouseRoom(int room) {
		// TODO Auto-generated method stub
		List<House> list=new ArrayList<>();
		Connection connection=DBUilt.getConnection();
		String sql="select * from house where room like ?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, "%"+room+"%");
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				
				House house = new House(resultSet.getInt("id"), resultSet.getString("location"),
						resultSet.getString("plot"), resultSet.getInt("unit"), resultSet.getInt("floor"),
						resultSet.getInt("room"), resultSet.getDouble("area"), resultSet.getString("orientation"),
						resultSet.getString("finish"), resultSet.getString("gas"), resultSet.getInt("people"));
				list.add(house);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}



}
