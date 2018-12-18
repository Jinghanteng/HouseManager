package model.user;

import java.util.List;

public class PageUser<E> {
	private int page;
	private int size;
	private int allsize;
	private int pagecount;
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
	public int getAllsize() {
		return allsize;
	}
	public void setAllsize(int allsize) {
		this.allsize = allsize;
	}
	public int getPagecount() {
		return (int) Math.ceil((double)allsize/size);
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	
}
