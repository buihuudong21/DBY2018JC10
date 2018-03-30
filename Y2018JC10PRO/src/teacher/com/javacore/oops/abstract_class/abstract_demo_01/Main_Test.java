package com.teacher.oops.abstract_class.abstract_demo_01;

public class Main_Test {

	public static void main(String[] args) {

		Geometric obj1 = new Circle(10);

	}

	public static void displayGeometricObject(Geometric object) {
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
	// Hàm so sánh diện tích của 2 đối tượng
}
