package com.teacher.oops.abstract_class.abstract_demo_03;

public class Rectangle extends Shape {
	private double height; // Chiều cao
	private double width; // Chiều rộng
	public final String name = "RECTANGLE";

	public Rectangle() {

	}

	public Rectangle(double height, double width, String color) {
		super(color);
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {

		return this.height * this.width;
	}

	@Override
	public double getPerimeter() {
		return (this.height + this.width) / 2;
	}

	@Override
	public String getName() {

		return "RECTANGLE";
	}

}
