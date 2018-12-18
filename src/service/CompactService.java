package service;

import java.util.List;

import model.compact.Compact;
import model.compact.PageCompact;

public interface CompactService {
	List<Compact> getAllCompact();
	PageCompact<Compact> pageCompact1(int page ,int size);
	void AddCompact(Compact compact);
}
