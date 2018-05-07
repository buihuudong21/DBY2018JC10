package com.teacher.enumerations.demo_onsite.sample02;

public class AppMain {

	public static void main(String[] args) {
		// Để check enum apple
		// 1. Lấy theo từng đối tượng
		System.out.println("Price of A is: " + Apple.A.getPrice());
		System.out.println("Price of B is: " + Apple.B.getPrice());
		System.out.println("Price of C is: " + Apple.C.getPrice());
		System.out.println("Price of D is: " + Apple.D.getPrice());
		System.out.println("Price of E is: " + Apple.E.getPrice());
		// 2 Lấy tập tất cả các object trong enum Apple
		Apple[] arrApple = Apple.values();
		for (Apple apple : arrApple) {
			System.out.print(apple.getPrice() + " ");
		}
	}

}
