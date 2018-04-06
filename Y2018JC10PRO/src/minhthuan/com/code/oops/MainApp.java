package minhthuan.com.code.oops;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		// // 1. Dung tinh nang da hinh
		// IShape circle = new Circle(5.6);
		// 2. Khoi tao doi tuong circle tu chinh no
		Circle circle2 = new Circle();
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh : ");
		radius = sc.nextDouble();
		circle2.setRadius(radius);
		displayInforShape(circle2);
		// System.out.println(circle.toString());
		// System.out.println(circle2.toString());
	}

	public static void displayInforShape(IShape iShape) {
		System.out.println(iShape.toString());
	}
}
