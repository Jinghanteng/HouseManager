package model.logistics;

import java.util.List;

public class PageLogistics<E> {
	private int page;
	private int size;
	private int all;
	private int pagesize;
	private List<E> list;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAll() {
		return all;
	}
	public void setAll(int all) {
		this.all = all;
	}
	public int getPagesize() {
		return (int)Math.ceil((double)all/size);
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	
}
