package dao;

import java.util.List;

import model.logistics.Logistics;

public interface LogisticsDao {
	List<Logistics> getAll();
	List<Logistics> pageLogistics(int page,int size);
	void addlogistics(Logistics logistics);
}
