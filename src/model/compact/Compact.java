package model.compact;

import java.util.Date;

public class Compact {
	private int id;
	private int house_id;
	private int user_id;
	private Date time;
	private Date begintime;
	private Date endtime;
	private Double rental;
	private String payment;
	private String pledge;
	private String periods;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHouse_id() {
		return house_id;
	}
	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Date getBegintime() {
		return begintime;
	}
	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public Double getRental() {
		return rental;
	}
	public void setRental(Double rental) {
		this.rental = rental;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getPledge() {
		return pledge;
	}
	public void setPledge(String pledge) {
		this.pledge = pledge;
	}
	public String getPeriods() {
		return periods;
	}
	public void setPeriods(String periods) {
		this.periods = periods;
	}
	
	
	
}
