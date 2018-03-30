package com.teacher.oops.abstract_class.abstract_demo_03;

public class Circle extends Shape {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {

		this.radius = radius;
	}

	public Circle(double radius, String color) {
		super(color);
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

		return "Radis is: " + this.radius + " and " + "Color is " + this.getColor();
	}

	public String displayMau() {
		return "Màu sắc của lớp Circle là: " + this.getColor();
	}

	@Override
	public String getName() {

		return "CIRCLE";
	}
}
