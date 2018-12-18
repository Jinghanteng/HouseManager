package service.impl;

import dao.RepairDao;
import dao.impl.RepairDaoImpl;
import model.repair.PageRepair;
import model.repair.Repair;
import service.RepairService;

public class RepairServiceImpl implements RepairService {
			RepairDao re=new RepairDaoImpl();
	@Override
	public PageRepair<Repair> pageRepair(int page, int size) {
		// TODO Auto-generated method stub
		PageRepair<Repair> pageRepair=new PageRepair<>();
		pageRepair.setAll(re.getAllrepair().size());
		pageRepair.setList(re.PageRepair(page, size));
		pageRepair.setPage(page);
		pageRepair.setSize(size);
		return pageRepair;
	}

}
