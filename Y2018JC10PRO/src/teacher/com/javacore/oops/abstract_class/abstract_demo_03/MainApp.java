package com.teacher.oops.abstract_class.abstract_demo_03;

public class MainApp {

	public static void main(String[] args) {
		// Cách 1
		// Circle obj = new Circle(255, "Yealow");
		// Cách 2
		Shape obj = new Circle(255, "Yealow"); // Polymorphisms......
		printObject(obj);
		Shape obj2 = new Rectangle(455, 888, "Black");
		System.out.println("=================================");
		printObject(obj2);

	}

	public static void printObject(Shape o) {
		if (o instanceof Circle) {
			System.out.println("Diện tích của " + o.getName() + " là: " + o.getArea());
			System.out.println("Chu vi của " + o.getName() + " là: " + o.getPerimeter());

		} else if (o instanceof Rectangle) {
			System.out.println("Diện tích của " + o.getName() + " là: " + o.getArea());
			System.out.println("Chu vi của " + o.getName() + " là: " + o.getPerimeter());
		}
	}

}
