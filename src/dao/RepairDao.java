package dao;

import java.util.List;

import model.repair.Repair;


public interface RepairDao {
	List<Repair> getAllrepair();
	List<Repair> PageRepair(int page,int size);
	
}
