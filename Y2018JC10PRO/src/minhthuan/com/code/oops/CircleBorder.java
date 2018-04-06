package minhthuan.com.code.oops;

public class CircleBorder extends Circle {
	private int borderWidth;
	private String colorBorder;

	public CircleBorder() {
		// TODO Auto-generated constructor stub
	}

	public CircleBorder(int borderWidth, String colorBorder) {
		this.borderWidth = borderWidth;
		this.colorBorder = colorBorder;
	}

	public CircleBorder(double radius, int borderWidth, String colorBorder) {
		super(radius);
		this.borderWidth = borderWidth;
		this.colorBorder = colorBorder;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "has a border is : " + this.borderWidth;
	}
}
