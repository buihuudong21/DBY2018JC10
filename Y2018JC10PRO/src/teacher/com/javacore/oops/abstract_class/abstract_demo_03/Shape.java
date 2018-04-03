package teacher.com.javacore.oops.abstract_class.abstract_demo_03;

public abstract class Shape {
	private String color = "Blue";
	protected String name;

	public Shape() {

	}

	public Shape(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
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

	public abstract double getArea();// Tính diện tích của hình

	public abstract double getPerimeter();// Tính chu vi của hình

	public String displayColor() {
		return "Màu sắc của lớp Shape là: " + this.color;
	}

}
