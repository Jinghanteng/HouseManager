package service.impl;

import java.util.ArrayList;
import java.util.List;

import dao.HouseDao;
import dao.impl.HouseDaoImpl;
import model.house.House;
import model.house.PageInfo;
import service.HouseService;

public class HouseServiceImpl implements HouseService {
		HouseDao houseDao=new HouseDaoImpl();
	@Override
	public List<House> getAllHouse() {
		// TODO Auto-generated method stub
		return houseDao.getAllHouse();
	}
	@Override
	public PageInfo<House> getPageInfo(int page, int size) {
		// TODO Auto-generated method stub
		PageInfo<House> pageInfo=new PageInfo<>();
		pageInfo.setList(houseDao.getLimit(page, size));
		pageInfo.setTotalsize(houseDao.getAllHouse().size());
		pageInfo.setSize(size);
		pageInfo.setPage(page);
		
		return pageInfo;
	}
	@Override
	public void addHouse(House house) {
		houseDao.addHouse(house);
	}
	@Override
	public void updateHouse(House house) {
		// TODO Auto-generated method stub
		houseDao.updatehouse(house);
		
	}
	@Override
	public House getHouseById(int id) {
		// TODO Auto-generated method stub
		return houseDao.getHouserByid(id);
	}
	@Override
	public void deleteByID(int id) {
		// TODO Auto-generated method stub
		houseDao.deleteById(id);
	}
	@Override
	public List getHouseByRoom(int room) {
		// TODO Auto-generated method stub
		return houseDao.getHouseByHouseRoom(room);
	}

}
