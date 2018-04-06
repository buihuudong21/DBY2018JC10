package teacher.com.javacore.oops.interface_object.demo_interface;

public class Rectangle implements IShape {
	private double height;
	private double width;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double height, double width) {

		this.height = height;
		this.width = width;
	}

	protected double getHeight() {
		return height;
	}

	protected void setHeight(double height) {
		this.height = height;
	}

	protected double getWidth() {
		return width;
	}

	protected void setWidth(double width) {
		this.width = width;
	}

	@Override
	public Double getArea() {

		return this.height * this.width;
	}

	@Override
	public Double getPerimeter() {

		return (this.getHeight() + this.getWidth()) * 2;
	}

	@Override
	public String toString() {

		return "The rectangle has area is: " + this.getArea() + " and perimeter is: " + this.getPerimeter()
				+ " with height is: " + this.getHeight() + " and width is: " + this.getWidth();
	}

}
