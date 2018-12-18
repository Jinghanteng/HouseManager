package model.house;

import java.util.List;

public class PageInfo<E> {
	private int page;//��ǰҳ��
	private int size;//һҳ������¼
	private int totalsize;//��������  
	private int pageCount;//�ܹ��ּ�ҳ
	private List<E> list;// һҳ�������ݵļ���
	

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
	//�ּ�ҳ
	//ҳ������   ҳ��=����ȡ����������/һҳ������
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

