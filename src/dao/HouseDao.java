package dao;

import java.util.List;

import model.house.House;
import model.house.PageInfo;

public interface HouseDao {
	List<House> getAllHouse();
	List<House> getLimit(int page,int size);
	List<House> getHouseByHouseRoom(int room);
	void addHouse(House house);
	void updatehouse(House house);
	House getHouserByid(int id);
	void deleteById(int id);
	
}
