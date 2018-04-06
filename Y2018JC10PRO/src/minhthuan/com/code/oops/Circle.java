package minhthuan.com.code.oops;

public class Circle extends IShape {
	private double radius;

	public Circle() {
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return Math.pow(getRadius(), 2) * Math.PI;
	}

	@Override
	public Double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.getRadius();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The circle has a area " + this.getArea() + " and perimater is :" + this.getPerimeter();
	}

}
