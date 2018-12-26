package test;

import org.junit.Test;

import dao.HouseDao;
import dao.impl.HouseDaoImpl;


public class TestDemo {
	@Test
	public void getAllMessage() {
		HouseDao houseDao=new HouseDaoImpl();
		houseDao.getAllHouse();
		System.out.println("111");
	}
	
	public void test2() {
		System.out.println("name");
	}
	@Test(timeout=100)
	public void test3() {
		for(int i=1;i<20000;i++) {
			System.out.println(i);
		}
		
	}
	
}
