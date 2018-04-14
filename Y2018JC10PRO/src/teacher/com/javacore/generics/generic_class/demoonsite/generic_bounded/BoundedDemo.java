package com.teacher.generics.generic_class.demoonsite.generic_bounded;

public class BoundedDemo {

	public static void main(String[] args) {
		Shape rectange = new Rectangle(10, 20);
		Shape circle = new Circle(10);

		String ret = equalsArea(rectange, circle) ? "bang nhau" : "khong bang nhau";

		System.out.println("So sanh dien tich: " + ret);

	}

	// Phuong thuc so sanh dien tich cua 2 hinh: Bounded
	public static <E extends Shape> boolean equalsArea(E o1, E o2) {

		return o1.Area() == o2.Area();

	}

}
