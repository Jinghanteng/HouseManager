package service;

import java.util.List;

import model.house.House;
import model.house.PageInfo;


public interface HouseService<E> {
	List<House> getAllHouse();
	PageInfo<House> getPageInfo(int page,int size);
	List<House> getHouseByRoom(int room);
	//Ìí¼Ó·¿×Ó
	void addHouse(House house);
	void updateHouse(House house);
	House getHouseById(int id);
	void deleteByID(int id);
}
