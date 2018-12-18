package model.compact;

import java.util.List;

public class PageCompact<E> {
	private int page;//
	private int size;//һҳ������
	private int pageCount;//�ܹ�ҳ��
	private int all;//������
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
	public int getPageCount() {
		return (int)Math.ceil((double)all/size);
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getAll() {
		return all;
	}
	public void setAll(int all) {
		this.all = all;
	}
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	public PageCompact() {
		super();
	}
	
	
	
}
