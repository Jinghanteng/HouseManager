package model.house;

import java.util.List;

public class PageInfo<E> {
	private int page;//当前页码
	private int size;//一页几条记录
	private int totalsize;//总数据量  
	private int pageCount;//总共分几页
	private List<E> list;// 一页里面数据的集合
	

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

	public int getTotalsize() {
		return totalsize;
	}

	public void setTotalsize(int totalsize) {
		this.totalsize = totalsize;
	}
	//分几页
	//页数计算   页数=向上取整（总数量/一页几条）
	public int getPageCount() {
		return (int)Math.ceil((double)totalsize/size);
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

