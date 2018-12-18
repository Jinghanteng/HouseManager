package dao;

import java.util.List;

import model.compact.Compact;
import model.compact.PageCompact;

public interface CompactDao {
	List<Compact> getAllCompact();
	List<Compact> pageCompact(int page,int size);
	void addCompact(Compact compact);
}
