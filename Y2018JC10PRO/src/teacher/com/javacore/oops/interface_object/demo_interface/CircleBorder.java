package teacher.com.javacore.oops.interface_object.demo_interface;

public class CircleBorder extends Circle {
	private int borderWidth;
	private String colorBorder;

	public CircleBorder() {
		// TODO Auto-generated constructor stub
	}

	public CircleBorder(double radius, int borderWidth, String colorBorder) {
		super(radius);
		this.borderWidth = borderWidth;
		this.colorBorder = colorBorder;
	}

	@Override
	public String toString() {

		return super.toString() + " with the borderWidth is " + this.borderWidth;
	}
}
