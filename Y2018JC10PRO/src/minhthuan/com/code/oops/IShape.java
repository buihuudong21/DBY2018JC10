package minhthuan.com.code.oops;

public abstract class IShape {
	// 1. Khai bao hang so
	public final String COLOR = "BLUE";

	// 2. Định nghĩa các phương thức trừu tượng
	// 2.1 Tính diện tích
	public abstract Double getArea();// tính diện tích

	public abstract Double getPerimeter();// tính chu vi
}
