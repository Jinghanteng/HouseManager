package model.role;

import java.util.List;

public class PageRole<E> {
	private int size;
	private int page;
	private int allsize;
	private int pageCount;
	private List<E> list;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getAllsize() {
		return allsize;
	}
	public void setAllsize(int allsize) {
		this.allsize = allsize;
	}
	public int getPageCount() {
		return (int)Math.ceil((double)allsize/size);
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
}
