package service.impl;

import java.util.List;

import dao.CompactDao;
import dao.impl.CompactDaoImpl;
import model.compact.Compact;
import model.compact.PageCompact;
import service.CompactService;

public class CompactServiceImpl implements CompactService {
	CompactDao compactDao =new CompactDaoImpl();
	@Override
	public PageCompact<Compact> pageCompact1(int page ,int size) {
		// TODO Auto-generated method stub
		PageCompact<Compact> pageCompact2=new PageCompact<>();
		
		pageCompact2.setAll(compactDao.getAllCompact().size());
		pageCompact2.setList(compactDao.pageCompact(page, size));
		pageCompact2.setPage(page);
		pageCompact2.setSize(size);
		return pageCompact2;
	}
	@Override
	public List<Compact> getAllCompact() {
		// TODO Auto-generated method stub
		return compactDao.getAllCompact();
	}
	@Override
	public void AddCompact(Compact compact) {
		// TODO Auto-generated method stub
		compactDao.addCompact(compact);
	}

}
