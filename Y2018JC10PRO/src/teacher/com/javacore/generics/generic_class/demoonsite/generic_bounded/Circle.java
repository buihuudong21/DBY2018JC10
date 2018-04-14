package com.teacher.generics.generic_class.demoonsite.generic_bounded;

public class Circle extends Shape {
	private double radius;

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
	public double Area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double Perimetter() {

		return 2 * Math.PI * radius;
	}

}
