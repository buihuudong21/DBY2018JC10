package minhthuan.com.code.oops;

public class Rectangle extends IShape {
	private double heigth;
	private double width;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double heigth, double width) {

		this.heigth = heigth;
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return this.heigth * this.width;
	}

	@Override
	public Double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.getHeigth() + this.getHeigth()) * 2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The rectangle has a area " + this.getArea() + " and perimater is :" + this.getPerimeter();
	}
}
