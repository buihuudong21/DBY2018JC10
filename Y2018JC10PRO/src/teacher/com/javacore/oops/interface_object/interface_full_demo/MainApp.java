package com.teacher.oops.interface_object.interface_full_demo;

public class MainApp {

	public static void main(String[] args) {
		IShape obj = new Circle(2555);

		System.out.println("Diện tích là: " + obj.getArea());
		System.out.println("Chu vi là: " + obj.getPerimeter());

		IShape obj2 = new Rectangle(2555, 12);

		System.out.println("Diện tích là: " + obj2.getArea());
		System.out.println("Chu vi là: " + obj2.getPerimeter());

		Rectangle obj3 = new Rectangle(123_456, 12_32);

		System.out.println("Diện tích là: " + obj3.getArea());
		System.out.println("Chu vi là: " + obj3.getPerimeter());

	}

}
