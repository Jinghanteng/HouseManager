package service;

import model.logistics.Logistics;
import model.logistics.PageLogistics;

public interface LogisticService {
	PageLogistics<Logistics> pageLogistics(int page,int size);
	void addLogistic(Logistics l);
}
