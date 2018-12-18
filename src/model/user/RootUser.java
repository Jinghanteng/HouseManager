package model.user;

import java.util.Date;

public class RootUser {
	private int id;
	private String passname;
	private String password;
	private String name;
	private String sex;
	private int role_id;
	private Date time;
	private String state;
	public RootUser(int id, String passname, String password, String name, String sex, int role_id, Date time,
			String state) {
		super();
		this.id = id;
		this.passname = passname;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.role_id = role_id;
		this.time = time;
		this.state = state;
	}
	public RootUser() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassname() {
		return passname;
	}
	public void setPassname(String passname) {
		this.passname = passname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
