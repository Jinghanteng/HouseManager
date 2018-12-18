package service;

import model.repair.PageRepair;
import model.repair.Repair;

public interface RepairService {
	PageRepair<Repair> pageRepair(int page,int size);
}
