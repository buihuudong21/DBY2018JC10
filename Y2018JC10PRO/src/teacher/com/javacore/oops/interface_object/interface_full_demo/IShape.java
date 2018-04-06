package teacher.com.javacore.oops.interface_object.interface_full_demo;

public interface IShape extends IShapOther, IShap2Other {
	final String color = "Blue";

	abstract double getArea();// Tính diện tích của hình

	abstract double getPerimeter();// Tính chu vi của hình

}
