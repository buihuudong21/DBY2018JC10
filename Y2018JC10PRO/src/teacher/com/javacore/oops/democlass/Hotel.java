package teacher.com.javacore.oops.democlass;

public class Hotel {
	// 1. Mô tả các thuộc tính( properties/attribute/data)
	protected String name; // default access modifier
	private String color;
	private int totalRoom;
	private int bookedRoom;
	private boolean pool;

	// 2. Xây dựng hàm tao (constructor) để sinh đối tượng
	public Hotel() {

	}

	public Hotel(String name, String color, int totalRoom, int bookedRoom, boolean pool) {
		this.name = name;
		this.color = color;
		this.totalRoom = totalRoom;
		this.bookedRoom = bookedRoom;
		this.pool = pool;
	}

	// 3. Các phương thức mà đối tượng có (các hành vi)

	String printName() {
		String strName = this.name; // biến local
		return strName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTotalRoom() {
		return totalRoom;
	}

	public void setTotalRoom(int totalRoom) {
		this.totalRoom = totalRoom;
	}

	public int getBookedRoom() {
		return bookedRoom;
	}

	public void setBookedRoom(int bookedRoom) {
		this.bookedRoom = bookedRoom;
	}

	public boolean isPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	public void incrementBookedRoom(int bookedRoom) {
		this.bookedRoom += bookedRoom;// this.bookedRoom = this.bookedRoom + bookedRoom;
	}

	public void decrementBookedRoom(int bookedRoom) {
		this.bookedRoom -= bookedRoom;
	}

	public int checkAvaiable() {
		return this.totalRoom - this.bookedRoom;
	}

	public void DisplayInforHotel() {
		System.out.println("Tên khách sạn là: " + this.name + " có tổng số phòng: " + this.totalRoom + " còn "
				+ this.checkAvaiable() + " phòng chưa đặt");
	}

}
