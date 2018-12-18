package service.impl;

import dao.LogisticsDao;
import dao.impl.LogisticsDaoImpl;
import model.logistics.Logistics;
import model.logistics.PageLogistics;
import service.LogisticService;

public class LogisticServiceImpl implements LogisticService {
			LogisticsDao logisticsdao = new LogisticsDaoImpl();
	@Override
	public PageLogistics<Logistics> pageLogistics(int page,int size) {
		// TODO Auto-generated method stub
		PageLogistics<Logistics> pageLogistics=new PageLogistics<>();
		pageLogistics.setAll(logisticsdao.getAll().size());
		pageLogistics.setList(logisticsdao.pageLogistics(page, size));
		pageLogistics.setPage(page);
		pageLogistics.setSize(size);
		return pageLogistics;
	}
	@Override
	public void addLogistic(Logistics l) {
		// TODO Auto-generated method stub
		logisticsdao.addlogistics(l);
	}

}
