package teacher.com.javacore.oops.interface_object.demo_interface;

public class Circle implements IShape {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {

		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public Double getArea() {

		return Math.pow(getRadius(), 2) * Math.PI;
	}

	@Override
	public Double getPerimeter() {

		return 2 * Math.PI * this.getRadius();
	}

	// Hien thi thong tin ve hinh
	@Override
	public String toString() {

		return "The circle has area is: " + this.getArea() + " and perimeter is: " + this.getPerimeter();
	}

}
