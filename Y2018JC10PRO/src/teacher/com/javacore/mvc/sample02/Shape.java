package teacher.com.javacore.mvc.sample02;

public abstract class Shape {
	private boolean isValue;

	public Shape() {
		isValue = true;
	}

	public Shape(boolean isValue) {
		this.isValue = isValue;
	}

	public abstract double Area(Object obj);

	public abstract double Perrimetter(Object obj);

	public void PrintInfo() {
	}
}
