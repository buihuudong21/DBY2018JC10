package teacher.com.javacore.oops.interface_object.interface_full_demo;

public class Circle implements IShape, IShapOther, IShap2Other {
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
	public double getArea() {

		return Math.PI * Math.pow(getRadius(), 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public String toString() {

		return "Radis is: " + this.radius + " and " + "Color is " + color;
	}

	@Override
	public int getData() {

		return 0;
	}

}
