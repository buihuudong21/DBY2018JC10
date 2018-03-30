package com.teacher.oops.interface_object.interface_full_demo;

public class Rectangle implements IShape {
	private double height; // Chiều cao
	private double width; // Chiều rộng

	public Rectangle() {

	}

	public Rectangle(double height, double width) {

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

}
