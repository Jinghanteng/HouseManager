package model.house;

public class House {
	private int id;
	private String location;
	private String plot;
	private int unit;
	private int floor;
	private int room;
	private double area;
	private String orientation;
	private String finish;
	private String gas;
	private int people;
	public House() {
		super();
	}
	public int getId() {
		return id;
	}
	
	public House(String location, String plot, int unit, int floor, int room, double area, String orientation,
			String finish, String gas, int people) {
		super();
		this.location = location;
		this.plot = plot;
		this.unit = unit;
		this.floor = floor;
		this.room = room;
		this.area = area;
		this.orientation = orientation;
		this.finish = finish;
		this.gas = gas;
		this.people = people;
	}
	public House(int id, String location, String plot, int unit, int floor, int room, double area, String orientation,
			String finish, String gas, int people) {
		super();
		this.id = id;
		this.location = location;
		this.plot = plot;
		this.unit = unit;
		this.floor = floor;
		this.room = room;
		this.area = area;
		this.orientation = orientation;
		this.finish = finish;
		this.gas = gas;
		this.people = people;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public String getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	public String getGas() {
		return gas;
	}
	public void setGas(String gas) {
		this.gas = gas;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
}
