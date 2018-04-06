package teacher.com.javacore.oops.interface_object.demo_interface;

public interface IShape {
	// 1. Khai bao hang so
	String COLOR = "BLUE"; // public static final String COLOR="BLUE";

	// 2. Dinh nghia cac phuong thuc truu tuong
	// 2.1 Tinh dien tich
	public Double getArea();

	// 2.2 Tinh chu vi
	public Double getPerimeter();

}
